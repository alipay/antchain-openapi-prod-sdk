// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CreateBlockchainBccrDciRegistrationcertRequest extends TeaModel {
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

    public static CreateBlockchainBccrDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBccrDciRegistrationcertRequest self = new CreateBlockchainBccrDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setDciCode(String dciCode) {
        this.dciCode = dciCode;
        return this;
    }
    public String getDciCode() {
        return this.dciCode;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public CreateBlockchainBccrDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
