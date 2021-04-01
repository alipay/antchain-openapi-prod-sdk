// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PullAuthWebpageVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业B类的唯一ID，对应的did在返回值vc_content中的subject字段
    @NameInMap("pk_id")
    @Validation(required = true)
    public String pkId;

    // C类用户的唯一ID，当前为通过姓名+身份证号组合计算哈希得到user_id = sha256(name+certNo)，对应的did在返回值vc_content中的issuer字段
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static PullAuthWebpageVcRequest build(java.util.Map<String, ?> map) throws Exception {
        PullAuthWebpageVcRequest self = new PullAuthWebpageVcRequest();
        return TeaModel.build(map, self);
    }

    public PullAuthWebpageVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullAuthWebpageVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullAuthWebpageVcRequest setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }
    public String getPkId() {
        return this.pkId;
    }

    public PullAuthWebpageVcRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
