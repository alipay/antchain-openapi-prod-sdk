// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class UpdateFirmInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云蚂侧用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 信息同步类型
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 云蚂侧企业id
    @NameInMap("firm_id")
    @Validation(required = true)
    public Long firmId;

    // 企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 企业认证状态
    @NameInMap("firm_cert_status")
    public String firmCertStatus;

    // 企业认证did
    @NameInMap("firm_did")
    public String firmDid;

    // 账户角色
    @NameInMap("refer_type")
    public String referType;

    // 云蚂侧原管理员账户id
    @NameInMap("former_admin_id")
    public Long formerAdminId;

    public static UpdateFirmInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFirmInfoRequest self = new UpdateFirmInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFirmInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFirmInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateFirmInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UpdateFirmInfoRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public UpdateFirmInfoRequest setFirmId(Long firmId) {
        this.firmId = firmId;
        return this;
    }
    public Long getFirmId() {
        return this.firmId;
    }

    public UpdateFirmInfoRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public UpdateFirmInfoRequest setFirmCertStatus(String firmCertStatus) {
        this.firmCertStatus = firmCertStatus;
        return this;
    }
    public String getFirmCertStatus() {
        return this.firmCertStatus;
    }

    public UpdateFirmInfoRequest setFirmDid(String firmDid) {
        this.firmDid = firmDid;
        return this;
    }
    public String getFirmDid() {
        return this.firmDid;
    }

    public UpdateFirmInfoRequest setReferType(String referType) {
        this.referType = referType;
        return this;
    }
    public String getReferType() {
        return this.referType;
    }

    public UpdateFirmInfoRequest setFormerAdminId(Long formerAdminId) {
        this.formerAdminId = formerAdminId;
        return this;
    }
    public Long getFormerAdminId() {
        return this.formerAdminId;
    }

}
