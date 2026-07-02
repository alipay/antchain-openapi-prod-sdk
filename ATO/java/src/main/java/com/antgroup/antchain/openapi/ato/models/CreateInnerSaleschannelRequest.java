// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerSaleschannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 投放类型
    @NameInMap("delivery_type")
    @Validation(required = true)
    public String deliveryType;

    // 父级级别的渠道code
    @NameInMap("parent_channel_code")
    public String parentChannelCode;

    // 渠道名称，30个字以内
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 操作人域账号
    @NameInMap("operator")
    public String operator;

    public static CreateInnerSaleschannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerSaleschannelRequest self = new CreateInnerSaleschannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerSaleschannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerSaleschannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerSaleschannelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerSaleschannelRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateInnerSaleschannelRequest setParentChannelCode(String parentChannelCode) {
        this.parentChannelCode = parentChannelCode;
        return this;
    }
    public String getParentChannelCode() {
        return this.parentChannelCode;
    }

    public CreateInnerSaleschannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateInnerSaleschannelRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
