// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeInstitutionCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构请求流水号，用于幂等。行方需确保唯一性
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
    @NameInMap("credit_no")
    @Validation(required = true)
    public String creditNo;

    // 客户姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
    @NameInMap("apply_type")
    @Validation(required = true)
    public String applyType;

    // 基础固额-申请调整值，单位分，机构发起调额场景下有值
    @NameInMap("credit_amount")
    public String creditAmount;

    // 年利率-申请调整值，机构发起调价场景下有值
    @NameInMap("credit_rate")
    public String creditRate;

    // 申请来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 机构申请原因码
    @NameInMap("reason_code")
    @Validation(required = true)
    public String reasonCode;

    // 机构发起原因描述
    @NameInMap("reason_msg")
    @Validation(required = true)
    public String reasonMsg;

    // 透传授信阶段天枢字段，json格式
    @NameInMap("ext_info_ts")
    @Validation(required = true)
    public String extInfoTs;

    // 扩展信息，json格式
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static UpdateDubbridgeInstitutionCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeInstitutionCreditRequest self = new UpdateDubbridgeInstitutionCreditRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeInstitutionCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDubbridgeInstitutionCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDubbridgeInstitutionCreditRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public UpdateDubbridgeInstitutionCreditRequest setCreditNo(String creditNo) {
        this.creditNo = creditNo;
        return this;
    }
    public String getCreditNo() {
        return this.creditNo;
    }

    public UpdateDubbridgeInstitutionCreditRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDubbridgeInstitutionCreditRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public UpdateDubbridgeInstitutionCreditRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public UpdateDubbridgeInstitutionCreditRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public UpdateDubbridgeInstitutionCreditRequest setCreditRate(String creditRate) {
        this.creditRate = creditRate;
        return this;
    }
    public String getCreditRate() {
        return this.creditRate;
    }

    public UpdateDubbridgeInstitutionCreditRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateDubbridgeInstitutionCreditRequest setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public UpdateDubbridgeInstitutionCreditRequest setReasonMsg(String reasonMsg) {
        this.reasonMsg = reasonMsg;
        return this;
    }
    public String getReasonMsg() {
        return this.reasonMsg;
    }

    public UpdateDubbridgeInstitutionCreditRequest setExtInfoTs(String extInfoTs) {
        this.extInfoTs = extInfoTs;
        return this;
    }
    public String getExtInfoTs() {
        return this.extInfoTs;
    }

    public UpdateDubbridgeInstitutionCreditRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
