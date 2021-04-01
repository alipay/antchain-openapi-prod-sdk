// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCorporateSelfcreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展信息
    @NameInMap("extension")
    public String extension;

    // 公司名称
    @NameInMap("owner_name")
    public String ownerName;

    // 携带自己定义的服务类型
    @NameInMap("services")
    public java.util.List<DidDocServicesInfo> services;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidCorporateSelfcreateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCorporateSelfcreateRequest self = new StartDidCorporateSelfcreateRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCorporateSelfcreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCorporateSelfcreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCorporateSelfcreateRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartDidCorporateSelfcreateRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartDidCorporateSelfcreateRequest setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

    public StartDidCorporateSelfcreateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
