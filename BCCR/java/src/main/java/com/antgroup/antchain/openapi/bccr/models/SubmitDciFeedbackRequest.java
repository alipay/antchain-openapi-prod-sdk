// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SubmitDciFeedbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 联系人
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系电话
    @NameInMap("contact_phone_number")
    @Validation(required = true)
    public String contactPhoneNumber;

    // 申诉原因
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 反馈类型
    @NameInMap("feedback_type")
    @Validation(required = true)
    public String feedbackType;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 代理信息
    @NameInMap("proxy_data")
    public ProxyData proxyData;

    public static SubmitDciFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDciFeedbackRequest self = new SubmitDciFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDciFeedbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDciFeedbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDciFeedbackRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SubmitDciFeedbackRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SubmitDciFeedbackRequest setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
        return this;
    }
    public String getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }

    public SubmitDciFeedbackRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDciFeedbackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitDciFeedbackRequest setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
        return this;
    }
    public String getFeedbackType() {
        return this.feedbackType;
    }

    public SubmitDciFeedbackRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SubmitDciFeedbackRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

}
