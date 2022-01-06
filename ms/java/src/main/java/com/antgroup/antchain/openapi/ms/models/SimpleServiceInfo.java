// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SimpleServiceInfo extends TeaModel {
    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 服务提供者列表
    @NameInMap("pub_app")
    public java.util.List<String> pubApp;

    // 服务提供者数
    @NameInMap("pub_count")
    public Long pubCount;

    // 服务架构类型
    @NameInMap("service_type")
    public String serviceType;

    // 消费者数
    @NameInMap("sub_count")
    public Long subCount;

    // 应用元数据
    @NameInMap("app_infos")
    public java.util.List<AppMetaDataModel> appInfos;

    public static SimpleServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        SimpleServiceInfo self = new SimpleServiceInfo();
        return TeaModel.build(map, self);
    }

    public SimpleServiceInfo setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SimpleServiceInfo setPubApp(java.util.List<String> pubApp) {
        this.pubApp = pubApp;
        return this;
    }
    public java.util.List<String> getPubApp() {
        return this.pubApp;
    }

    public SimpleServiceInfo setPubCount(Long pubCount) {
        this.pubCount = pubCount;
        return this;
    }
    public Long getPubCount() {
        return this.pubCount;
    }

    public SimpleServiceInfo setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public SimpleServiceInfo setSubCount(Long subCount) {
        this.subCount = subCount;
        return this;
    }
    public Long getSubCount() {
        return this.subCount;
    }

    public SimpleServiceInfo setAppInfos(java.util.List<AppMetaDataModel> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<AppMetaDataModel> getAppInfos() {
        return this.appInfos;
    }

}
