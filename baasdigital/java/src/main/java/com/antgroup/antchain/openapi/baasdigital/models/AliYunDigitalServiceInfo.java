// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class AliYunDigitalServiceInfo extends TeaModel {
    // 项目总数
    @NameInMap("project_count")
    public Long projectCount;

    // 项目上限
    @NameInMap("project_limit")
    public Long projectLimit;

    // 资源存储使用量
    @NameInMap("storage_used")
    public Long storageUsed;

    // 资源存储容量上限
    @NameInMap("storage_limit")
    public Long storageLimit;

    // 日访问流量
    @NameInMap("traffic_daily_used")
    public Long trafficDailyUsed;

    // 日流量上限
    @NameInMap("traffic_daily_limit")
    public Long trafficDailyLimit;

    public static AliYunDigitalServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        AliYunDigitalServiceInfo self = new AliYunDigitalServiceInfo();
        return TeaModel.build(map, self);
    }

    public AliYunDigitalServiceInfo setProjectCount(Long projectCount) {
        this.projectCount = projectCount;
        return this;
    }
    public Long getProjectCount() {
        return this.projectCount;
    }

    public AliYunDigitalServiceInfo setProjectLimit(Long projectLimit) {
        this.projectLimit = projectLimit;
        return this;
    }
    public Long getProjectLimit() {
        return this.projectLimit;
    }

    public AliYunDigitalServiceInfo setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public AliYunDigitalServiceInfo setStorageLimit(Long storageLimit) {
        this.storageLimit = storageLimit;
        return this;
    }
    public Long getStorageLimit() {
        return this.storageLimit;
    }

    public AliYunDigitalServiceInfo setTrafficDailyUsed(Long trafficDailyUsed) {
        this.trafficDailyUsed = trafficDailyUsed;
        return this;
    }
    public Long getTrafficDailyUsed() {
        return this.trafficDailyUsed;
    }

    public AliYunDigitalServiceInfo setTrafficDailyLimit(Long trafficDailyLimit) {
        this.trafficDailyLimit = trafficDailyLimit;
        return this;
    }
    public Long getTrafficDailyLimit() {
        return this.trafficDailyLimit;
    }

}
