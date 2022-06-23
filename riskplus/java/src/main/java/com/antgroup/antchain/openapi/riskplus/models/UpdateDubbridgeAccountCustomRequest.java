// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeAccountCustomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 新渠道id
    @NameInMap("new_open_id")
    @Validation(required = true)
    public String newOpenId;

    // 原渠道id
    @NameInMap("source_open_id")
    @Validation(required = true)
    public String sourceOpenId;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    public static UpdateDubbridgeAccountCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeAccountCustomRequest self = new UpdateDubbridgeAccountCustomRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeAccountCustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDubbridgeAccountCustomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDubbridgeAccountCustomRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public UpdateDubbridgeAccountCustomRequest setNewOpenId(String newOpenId) {
        this.newOpenId = newOpenId;
        return this;
    }
    public String getNewOpenId() {
        return this.newOpenId;
    }

    public UpdateDubbridgeAccountCustomRequest setSourceOpenId(String sourceOpenId) {
        this.sourceOpenId = sourceOpenId;
        return this;
    }
    public String getSourceOpenId() {
        return this.sourceOpenId;
    }

    public UpdateDubbridgeAccountCustomRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

}
