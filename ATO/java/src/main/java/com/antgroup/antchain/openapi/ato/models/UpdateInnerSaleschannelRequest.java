// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerSaleschannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 渠道码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 修改后的渠道名称
    @NameInMap("channel_name")
    public String channelName;

    // 渠道链接
    @NameInMap("channel_link")
    public String channelLink;

    // 操作人域账号
    @NameInMap("operator")
    public String operator;

    public static UpdateInnerSaleschannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerSaleschannelRequest self = new UpdateInnerSaleschannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerSaleschannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerSaleschannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerSaleschannelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerSaleschannelRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public UpdateInnerSaleschannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateInnerSaleschannelRequest setChannelLink(String channelLink) {
        this.channelLink = channelLink;
        return this;
    }
    public String getChannelLink() {
        return this.channelLink;
    }

    public UpdateInnerSaleschannelRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
