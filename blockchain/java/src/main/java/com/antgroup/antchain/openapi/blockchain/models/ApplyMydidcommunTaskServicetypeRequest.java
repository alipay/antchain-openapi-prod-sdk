// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyMydidcommunTaskServicetypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要被授权人的DID
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 申请发起人的DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 需要被授权使用的服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static ApplyMydidcommunTaskServicetypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyMydidcommunTaskServicetypeRequest self = new ApplyMydidcommunTaskServicetypeRequest();
        return TeaModel.build(map, self);
    }

    public ApplyMydidcommunTaskServicetypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyMydidcommunTaskServicetypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyMydidcommunTaskServicetypeRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public ApplyMydidcommunTaskServicetypeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ApplyMydidcommunTaskServicetypeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
