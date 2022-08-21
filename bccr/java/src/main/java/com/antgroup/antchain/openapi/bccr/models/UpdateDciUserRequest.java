// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class UpdateDciUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci用户ID
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // 证件正面oss fileId
    @NameInMap("cert_front_file_id")
    @Validation(required = true)
    public String certFrontFileId;

    // 证件背面oss fileId
    @NameInMap("cert_back_file_id")
    public String certBackFileId;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

    public static UpdateDciUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDciUserRequest self = new UpdateDciUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDciUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDciUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDciUserRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public UpdateDciUserRequest setCertFrontFileId(String certFrontFileId) {
        this.certFrontFileId = certFrontFileId;
        return this;
    }
    public String getCertFrontFileId() {
        return this.certFrontFileId;
    }

    public UpdateDciUserRequest setCertBackFileId(String certBackFileId) {
        this.certBackFileId = certBackFileId;
        return this;
    }
    public String getCertBackFileId() {
        return this.certBackFileId;
    }

    public UpdateDciUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateDciUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
