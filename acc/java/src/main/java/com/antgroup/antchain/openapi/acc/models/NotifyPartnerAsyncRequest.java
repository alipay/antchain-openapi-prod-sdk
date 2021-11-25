// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class NotifyPartnerAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ZHONGYI
    @NameInMap("partner_id")
    @Validation(required = true)
    public String partnerId;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 通知内容	
    // 
    @NameInMap("notify_content")
    @Validation(required = true)
    public String notifyContent;

    public static NotifyPartnerAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPartnerAsyncRequest self = new NotifyPartnerAsyncRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPartnerAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPartnerAsyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyPartnerAsyncRequest setPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public String getPartnerId() {
        return this.partnerId;
    }

    public NotifyPartnerAsyncRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public NotifyPartnerAsyncRequest setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
        return this;
    }
    public String getNotifyContent() {
        return this.notifyContent;
    }

}
