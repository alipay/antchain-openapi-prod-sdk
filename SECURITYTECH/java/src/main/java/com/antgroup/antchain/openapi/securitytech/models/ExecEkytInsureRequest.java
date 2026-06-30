// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ExecEkytInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保险信息list的jsonStr
    @NameInMap("insure_info_list_str")
    @Validation(required = true)
    public String insureInfoListStr;

    // 对insure_info_list_str的签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static ExecEkytInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecEkytInsureRequest self = new ExecEkytInsureRequest();
        return TeaModel.build(map, self);
    }

    public ExecEkytInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecEkytInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecEkytInsureRequest setInsureInfoListStr(String insureInfoListStr) {
        this.insureInfoListStr = insureInfoListStr;
        return this;
    }
    public String getInsureInfoListStr() {
        return this.insureInfoListStr;
    }

    public ExecEkytInsureRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
