// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyRefinancePackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产包id
    @NameInMap("package_id")
    @Validation(required = true)
    public String packageId;

    // AUDIT_SUCCESS(审核通过), AUDIT_REFUSE(审核驳回), AUDITING(审核中，需要调无效资产推送将无效资产分批推送过来)
    @NameInMap("audit_status")
    @Validation(required = true)
    public String auditStatus;

    // 放款金额，单位毫厘
    @NameInMap("recredit_limit")
    public Long recreditLimit;

    // 再融资放款流水号
    @NameInMap("recredit_serial_number")
    public String recreditSerialNumber;

    // 额外审核信息说明
    @NameInMap("audit_message")
    public String auditMessage;

    public static VerifyRefinancePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRefinancePackageRequest self = new VerifyRefinancePackageRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRefinancePackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyRefinancePackageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyRefinancePackageRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public VerifyRefinancePackageRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public VerifyRefinancePackageRequest setRecreditLimit(Long recreditLimit) {
        this.recreditLimit = recreditLimit;
        return this;
    }
    public Long getRecreditLimit() {
        return this.recreditLimit;
    }

    public VerifyRefinancePackageRequest setRecreditSerialNumber(String recreditSerialNumber) {
        this.recreditSerialNumber = recreditSerialNumber;
        return this;
    }
    public String getRecreditSerialNumber() {
        return this.recreditSerialNumber;
    }

    public VerifyRefinancePackageRequest setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
        return this;
    }
    public String getAuditMessage() {
        return this.auditMessage;
    }

}
