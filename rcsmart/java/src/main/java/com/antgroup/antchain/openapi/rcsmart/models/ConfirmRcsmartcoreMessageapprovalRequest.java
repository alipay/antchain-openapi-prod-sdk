// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rcsmart.models;

import com.aliyun.tea.*;

public class ConfirmRcsmartcoreMessageapprovalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 商户ID
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 审核场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // xxxx
    @NameInMap("message_data")
    @Validation(required = true)
    public MessageDataVO messageData;

    public static ConfirmRcsmartcoreMessageapprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRcsmartcoreMessageapprovalRequest self = new ConfirmRcsmartcoreMessageapprovalRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ConfirmRcsmartcoreMessageapprovalRequest setMessageData(MessageDataVO messageData) {
        this.messageData = messageData;
        return this;
    }
    public MessageDataVO getMessageData() {
        return this.messageData;
    }

}
