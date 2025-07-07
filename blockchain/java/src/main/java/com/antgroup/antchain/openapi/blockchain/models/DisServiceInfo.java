// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DisServiceInfo extends TeaModel {
    // 提供服务的did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxxxxxxx</p>
     */
    @NameInMap("controller")
    @Validation(required = true)
    public String controller;

    // 服务地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.xxxx.com/xxxx">www.xxxx.com/xxxx</a></p>
     */
    @NameInMap("end_point")
    @Validation(required = true)
    public String endPoint;

    // 服务id
    /**
     * <strong>example:</strong>
     * <p>did:service:xxxxxx</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 服务类型
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static DisServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        DisServiceInfo self = new DisServiceInfo();
        return TeaModel.build(map, self);
    }

    public DisServiceInfo setController(String controller) {
        this.controller = controller;
        return this;
    }
    public String getController() {
        return this.controller;
    }

    public DisServiceInfo setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public DisServiceInfo setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DisServiceInfo setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
