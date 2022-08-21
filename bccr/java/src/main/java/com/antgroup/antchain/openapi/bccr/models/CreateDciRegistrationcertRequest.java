// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDciRegistrationcertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 版权用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // DCI码
    @NameInMap("dci_code")
    @Validation(required = true)
    public String dciCode;

    // 登记号
    @NameInMap("reg_number")
    @Validation(required = true)
    public String regNumber;

    // 二维码
    @NameInMap("qr_code_url")
    @Validation(required = true)
    public String qrCodeUrl;

    // 客户端token
    @NameInMap("client_token")
    public String clientToken;

    public static CreateDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDciRegistrationcertRequest self = new CreateDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public CreateDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDciRegistrationcertRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateDciRegistrationcertRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateDciRegistrationcertRequest setDciCode(String dciCode) {
        this.dciCode = dciCode;
        return this;
    }
    public String getDciCode() {
        return this.dciCode;
    }

    public CreateDciRegistrationcertRequest setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public CreateDciRegistrationcertRequest setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public CreateDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
