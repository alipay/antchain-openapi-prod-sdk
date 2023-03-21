// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceEndorsementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批单申请号
    @NameInMap("endorsement_apply_no")
    @Validation(required = true)
    public String endorsementApplyNo;

    // 申请时间
    @NameInMap("endorsement_apply_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endorsementApplyDate;

    // 保单号
    @NameInMap("insurance_number")
    @Validation(required = true)
    public String insuranceNumber;

    // 保司编码
    @NameInMap("insurance_code")
    @Validation(required = true)
    public String insuranceCode;

    // 批单保额，单位：元，最多两位小数
    @NameInMap("endorsement_apply_amount")
    @Validation(required = true)
    public String endorsementApplyAmount;

    // [{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000003(标的类型:包裹)","objNo":"标的编号","logisticsNo":"物流单号","sellerID":"卖家ID","objName":"货物名称","objType":"货物类型","objAmount":"货物金额(元)","buyerID":"买家ID"}},{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000002(标的类型:入库单)","objNo":"标的编号","pkgInNo":"入库编号","merchantName":"商家","objName":"货物","objType":"货物类型","objCount":"货物数量","objAmount":"货物金额(元)","buyerID":""}}]
    @NameInMap("endorsement_apply_contents")
    @Validation(required = true)
    public java.util.List<String> endorsementApplyContents;

    public static ApplyInsuranceEndorsementRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceEndorsementRequest self = new ApplyInsuranceEndorsementRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceEndorsementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceEndorsementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceEndorsementRequest setEndorsementApplyNo(String endorsementApplyNo) {
        this.endorsementApplyNo = endorsementApplyNo;
        return this;
    }
    public String getEndorsementApplyNo() {
        return this.endorsementApplyNo;
    }

    public ApplyInsuranceEndorsementRequest setEndorsementApplyDate(String endorsementApplyDate) {
        this.endorsementApplyDate = endorsementApplyDate;
        return this;
    }
    public String getEndorsementApplyDate() {
        return this.endorsementApplyDate;
    }

    public ApplyInsuranceEndorsementRequest setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public ApplyInsuranceEndorsementRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public ApplyInsuranceEndorsementRequest setEndorsementApplyAmount(String endorsementApplyAmount) {
        this.endorsementApplyAmount = endorsementApplyAmount;
        return this;
    }
    public String getEndorsementApplyAmount() {
        return this.endorsementApplyAmount;
    }

    public ApplyInsuranceEndorsementRequest setEndorsementApplyContents(java.util.List<String> endorsementApplyContents) {
        this.endorsementApplyContents = endorsementApplyContents;
        return this;
    }
    public java.util.List<String> getEndorsementApplyContents() {
        return this.endorsementApplyContents;
    }

}
