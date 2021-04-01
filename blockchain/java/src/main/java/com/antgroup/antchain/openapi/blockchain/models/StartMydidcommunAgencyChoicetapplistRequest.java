// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyChoicetapplistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻时候生成的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 选择的tapp信息列表
    @NameInMap("tapp_infos")
    @Validation(required = true)
    public java.util.List<ChoiceTappInfo> tappInfos;

    public static StartMydidcommunAgencyChoicetapplistRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyChoicetapplistRequest self = new StartMydidcommunAgencyChoicetapplistRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyChoicetapplistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyChoicetapplistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyChoicetapplistRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyChoicetapplistRequest setTappInfos(java.util.List<ChoiceTappInfo> tappInfos) {
        this.tappInfos = tappInfos;
        return this;
    }
    public java.util.List<ChoiceTappInfo> getTappInfos() {
        return this.tappInfos;
    }

}
