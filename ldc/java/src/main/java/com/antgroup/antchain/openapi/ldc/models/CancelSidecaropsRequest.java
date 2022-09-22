// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CancelSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // mosn/odp
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // 具体sidecar的版本，非必填
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 环宇 order number
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    public static CancelSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSidecaropsRequest self = new CancelSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public CancelSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelSidecaropsRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public CancelSidecaropsRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public CancelSidecaropsRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public CancelSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
