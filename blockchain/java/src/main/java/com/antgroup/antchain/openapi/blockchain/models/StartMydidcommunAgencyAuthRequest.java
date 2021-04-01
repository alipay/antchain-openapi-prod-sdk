// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 用户在本地构造的发起数据授权申请的消息
    @NameInMap("request_raw")
    @Validation(required = true)
    public String requestRaw;

    // 业务码，需要接入时联系数据隐私服务分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartMydidcommunAgencyAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyAuthRequest self = new StartMydidcommunAgencyAuthRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyAuthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyAuthRequest setRequestRaw(String requestRaw) {
        this.requestRaw = requestRaw;
        return this;
    }
    public String getRequestRaw() {
        return this.requestRaw;
    }

    public StartMydidcommunAgencyAuthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
