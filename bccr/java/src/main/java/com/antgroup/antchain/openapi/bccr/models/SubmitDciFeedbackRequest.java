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

    // 作品名称
    @NameInMap("work_name")
    @Validation(required = true)
    public String workName;

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

    public SubmitDciFeedbackRequest setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
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

}
