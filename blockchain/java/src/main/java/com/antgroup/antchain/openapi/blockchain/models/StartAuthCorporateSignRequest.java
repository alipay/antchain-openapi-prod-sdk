// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthCorporateSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要进行签名的字符串，按规定方式进行传参拼接并sha256
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 需要代理签名的目标did，此did是当前请求方申请在授权宝控制创建
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static StartAuthCorporateSignRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthCorporateSignRequest self = new StartAuthCorporateSignRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthCorporateSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthCorporateSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthCorporateSignRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartAuthCorporateSignRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
