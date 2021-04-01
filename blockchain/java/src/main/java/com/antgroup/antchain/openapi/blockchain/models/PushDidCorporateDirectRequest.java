// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushDidCorporateDirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // did doc json string
    @NameInMap("doc")
    @Validation(required = true)
    public String doc;

    // 对hash进行签名后接字符串
    @NameInMap("sign_data")
    @Validation(required = true)
    public String signData;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static PushDidCorporateDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDidCorporateDirectRequest self = new PushDidCorporateDirectRequest();
        return TeaModel.build(map, self);
    }

    public PushDidCorporateDirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDidCorporateDirectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDidCorporateDirectRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public PushDidCorporateDirectRequest setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public PushDidCorporateDirectRequest setSignData(String signData) {
        this.signData = signData;
        return this;
    }
    public String getSignData() {
        return this.signData;
    }

    public PushDidCorporateDirectRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
