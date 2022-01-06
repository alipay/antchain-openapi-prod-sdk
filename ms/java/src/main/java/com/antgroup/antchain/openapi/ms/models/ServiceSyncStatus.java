// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServiceSyncStatus extends TeaModel {
    // 服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 服务所属的应用名
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 当前同步状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 日期
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    public static ServiceSyncStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceSyncStatus self = new ServiceSyncStatus();
        return TeaModel.build(map, self);
    }

    public ServiceSyncStatus setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceSyncStatus setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceSyncStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ServiceSyncStatus setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
