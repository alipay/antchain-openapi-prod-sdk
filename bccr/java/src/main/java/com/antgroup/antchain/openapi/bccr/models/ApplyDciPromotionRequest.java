// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ApplyDciPromotionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联系人姓名
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系人电话
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // dci ID
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 推广渠道
    @NameInMap("promotion_way")
    @Validation(required = true)
    public String promotionWay;

    public static ApplyDciPromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDciPromotionRequest self = new ApplyDciPromotionRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDciPromotionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDciPromotionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDciPromotionRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ApplyDciPromotionRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public ApplyDciPromotionRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public ApplyDciPromotionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyDciPromotionRequest setPromotionWay(String promotionWay) {
        this.promotionWay = promotionWay;
        return this;
    }
    public String getPromotionWay() {
        return this.promotionWay;
    }

}
