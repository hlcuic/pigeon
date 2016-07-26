package com.dianping.pigeon.remoting.provider.process.statistics;

import com.dianping.pigeon.remoting.common.util.Constants;
import com.dianping.pigeon.remoting.provider.ProviderBootStrap;
import com.dianping.pigeon.remoting.provider.Server;
import com.dianping.pigeon.remoting.provider.process.RequestProcessor;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Map;

/**
 * Created by chenchongze on 16/7/26.
 */
public enum LoadInfoCollector {

    INSTANCE;

    private final OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();

    public double getSystemLoadAverage() {
        return bean.getSystemLoadAverage();
    }

    public int getOldGC() {
        return 0;
    }

    public int getThreadNum() {

        for (Server server : ProviderBootStrap.getServersMap().values()) {

            if (Constants.PROTOCOL_DEFAULT.equals(server.getProtocol())) {
                RequestProcessor processor = server.getRequestProcessor();

                if (processor != null) {
                    return processor.getRequestProcessThreadPool().getExecutor().getActiveCount();
                }
            }
        }

        return 0;
    }

    public int getQueueSize() {

        for (Server server : ProviderBootStrap.getServersMap().values()) {

            if (Constants.PROTOCOL_DEFAULT.equals(server.getProtocol())) {
                RequestProcessor processor = server.getRequestProcessor();

                if (processor != null) {
                    return processor.getRequestProcessThreadPool().getExecutor().getQueue().size();
                }
            }
        }

        return 0;
    }

    public int getQPS() {
        int qps = 0;
        Map<String, ProviderCapacityBucket> providerCapacityMap = ProviderStatisticsHolder.getCapacityBuckets();

        for (String app : providerCapacityMap.keySet()) {
            ProviderCapacityBucket appCapacity = providerCapacityMap.get(app);
            if (appCapacity != null) {
                qps += appCapacity.getRequestsInLastSecond();
            }
        }

        return qps;
    }

    public static void main(String[] args) {
        List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();

        for (GarbageCollectorMXBean mxbean : beans) {
            if (mxbean.isValid()) {
                System.out.println(mxbean.getName());
                System.out.println(mxbean.getCollectionCount());
                System.out.println(mxbean.getCollectionTime());
                System.out.println();
            }
        }
    }
}
