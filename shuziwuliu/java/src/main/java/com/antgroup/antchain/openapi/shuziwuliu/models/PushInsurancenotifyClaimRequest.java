// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushInsurancenotifyClaimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通知类型：
    // claims_pay:理赔支付信息
    // claims_info: 理赔信息
    @NameInMap("category")
    @Validation(required = true, maxLength = 16)
    public String category;

    // 通知内容
    @NameInMap("content")
    @Validation(required = true, maxLength = 3000)
    public String content;

    public static PushInsurancenotifyClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        PushInsurancenotifyClaimRequest self = new PushInsurancenotifyClaimRequest();
        return TeaModel.build(map, self);
    }

    public PushInsurancenotifyClaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushInsurancenotifyClaimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushInsurancenotifyClaimRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public PushInsurancenotifyClaimRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
