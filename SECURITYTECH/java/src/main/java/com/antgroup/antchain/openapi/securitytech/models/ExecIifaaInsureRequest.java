// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ExecIifaaInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保险信息list的jsonStr
    @NameInMap("insure_info_list_str")
    @Validation(required = true)
    public String insureInfoListStr;

    // 对insure_info_list_str的签名，使用十六进制字符串编码
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static ExecIifaaInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecIifaaInsureRequest self = new ExecIifaaInsureRequest();
        return TeaModel.build(map, self);
    }

    public ExecIifaaInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecIifaaInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecIifaaInsureRequest setInsureInfoListStr(String insureInfoListStr) {
        this.insureInfoListStr = insureInfoListStr;
        return this;
    }
    public String getInsureInfoListStr() {
        return this.insureInfoListStr;
    }

    public ExecIifaaInsureRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
