// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidVerifiableclaimStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 希望可验证声明的状态， 0无效，1生效
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 可验证声明id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 该VC的颁发者
    @NameInMap("issuer_did")
    public String issuerDid;

    public static UpdateDidVerifiableclaimStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidVerifiableclaimStatusRequest self = new UpdateDidVerifiableclaimStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidVerifiableclaimStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidVerifiableclaimStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidVerifiableclaimStatusRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateDidVerifiableclaimStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDidVerifiableclaimStatusRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public UpdateDidVerifiableclaimStatusRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

}
