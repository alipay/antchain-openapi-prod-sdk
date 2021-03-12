// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckDidSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要验签的字符串
    @NameInMap("check_data")
    @Validation(required = true)
    public String checkData;

    // 对字符串签名的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 签名后的字符串
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static CheckDidSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDidSignRequest self = new CheckDidSignRequest();
        return TeaModel.build(map, self);
    }

    public CheckDidSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckDidSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckDidSignRequest setCheckData(String checkData) {
        this.checkData = checkData;
        return this;
    }
    public String getCheckData() {
        return this.checkData;
    }

    public CheckDidSignRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CheckDidSignRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CheckDidSignRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
