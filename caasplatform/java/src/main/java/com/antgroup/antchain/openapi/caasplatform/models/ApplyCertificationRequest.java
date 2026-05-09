// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class ApplyCertificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务编号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 出证类型：OWN（自有）/ NOTARY（公正处证明）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ApplyCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificationRequest self = new ApplyCertificationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCertificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCertificationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCertificationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ApplyCertificationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
