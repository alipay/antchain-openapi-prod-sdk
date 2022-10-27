// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class AgreementQueryResult extends TeaModel {
    // 会员所属业务平台在智能科技的会员ID
    @NameInMap("platform_member_id")
    @Validation(required = true)
    public String platformMemberId;

    // 外部业务平台的用户ID
    @NameInMap("out_member_id")
    @Validation(required = true)
    public String outMemberId;

    // 签约产品的产品码
    @NameInMap("product_code")
    public String productCode;

    // 签约产品的产品名称
    @NameInMap("product_name")
    public String productName;

    // 签约的产品类型
    // 
    @NameInMap("product_type")
    public String productType;

    // 签约时间
    // 
    @NameInMap("signing_time")
    public String signingTime;

    // 到期时间
    @NameInMap("end_time")
    public String endTime;

    // 是否有效
    // 
    @NameInMap("active_flag")
    public Boolean activeFlag;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static AgreementQueryResult build(java.util.Map<String, ?> map) throws Exception {
        AgreementQueryResult self = new AgreementQueryResult();
        return TeaModel.build(map, self);
    }

    public AgreementQueryResult setPlatformMemberId(String platformMemberId) {
        this.platformMemberId = platformMemberId;
        return this;
    }
    public String getPlatformMemberId() {
        return this.platformMemberId;
    }

    public AgreementQueryResult setOutMemberId(String outMemberId) {
        this.outMemberId = outMemberId;
        return this;
    }
    public String getOutMemberId() {
        return this.outMemberId;
    }

    public AgreementQueryResult setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AgreementQueryResult setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public AgreementQueryResult setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AgreementQueryResult setSigningTime(String signingTime) {
        this.signingTime = signingTime;
        return this;
    }
    public String getSigningTime() {
        return this.signingTime;
    }

    public AgreementQueryResult setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AgreementQueryResult setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }
    public Boolean getActiveFlag() {
        return this.activeFlag;
    }

    public AgreementQueryResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public AgreementQueryResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
