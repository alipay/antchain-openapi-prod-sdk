// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class FinishDciRegistrationcertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 登记号
    @NameInMap("reg_number")
    @Validation(required = true)
    public String regNumber;

    // 数登证书地址
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 数登样本地址
    @NameInMap("sample_url")
    public String sampleUrl;

    // 客户端幂等token
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 登记时间
    @NameInMap("registration_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String registrationTime;

    public static FinishDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishDciRegistrationcertRequest self = new FinishDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public FinishDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishDciRegistrationcertRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FinishDciRegistrationcertRequest setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public FinishDciRegistrationcertRequest setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public FinishDciRegistrationcertRequest setSampleUrl(String sampleUrl) {
        this.sampleUrl = sampleUrl;
        return this;
    }
    public String getSampleUrl() {
        return this.sampleUrl;
    }

    public FinishDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishDciRegistrationcertRequest setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }
    public String getRegistrationTime() {
        return this.registrationTime;
    }

}
