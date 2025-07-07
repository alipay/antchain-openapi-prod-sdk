// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidService extends TeaModel {
    // 待更新did之前的版本号
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("previous_version")
    @Validation(required = true)
    public Long previousVersion;

    // did doc中的service id
    /**
     * <strong>example:</strong>
     * <p>service#1</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 服务信息
    @NameInMap("service_info")
    @Validation(required = true)
    public DidServiceInfo serviceInfo;

    // 服务类型
    /**
     * <strong>example:</strong>
     * <p>auth</p>
     */
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static UpdateDidService build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidService self = new UpdateDidService();
        return TeaModel.build(map, self);
    }

    public UpdateDidService setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    public UpdateDidService setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateDidService setServiceInfo(DidServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public DidServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public UpdateDidService setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
