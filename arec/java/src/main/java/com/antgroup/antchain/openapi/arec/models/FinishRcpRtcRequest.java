// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class FinishRcpRtcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申办业务号
    @NameInMap("apply_biz_id")
    @Validation(required = true)
    public String applyBizId;

    // 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
    @NameInMap("biz_status")
    @Validation(required = true)
    public String bizStatus;

    // 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 被担保主债权数额
    @NameInMap("debt_amount")
    @Validation(required = true)
    public Amount debtAmount;

    // 履债结束日期，格式为：yyyy-MM-dd
    @NameInMap("debt_end_date")
    public String debtEndDate;

    // 履债开始日期，格式为：yyyy-MM-dd
    @NameInMap("debt_start_date")
    public String debtStartDate;

    // 评估价值
    @NameInMap("evaluation_amount")
    public Amount evaluationAmount;

    // 抵押权人
    @NameInMap("mortgagee")
    @Validation(required = true)
    public EntityBasicInfo mortgagee;

    // 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
    @NameInMap("mortgage_type")
    @Validation(required = true)
    public String mortgageType;

    // 他项权证信息
    @NameInMap("other_right_info")
    @Validation(required = true)
    public OtherRightInfo otherRightInfo;

    // 登记日期，格式为：yyyy-MM-dd
    @NameInMap("registered_date")
    @Validation(required = true)
    public String registeredDate;

    // 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
    @NameInMap("material_file_list")
    public java.util.List<MaterialFileInfo> materialFileList;

    public static FinishRcpRtcRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishRcpRtcRequest self = new FinishRcpRtcRequest();
        return TeaModel.build(map, self);
    }

    public FinishRcpRtcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishRcpRtcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishRcpRtcRequest setApplyBizId(String applyBizId) {
        this.applyBizId = applyBizId;
        return this;
    }
    public String getApplyBizId() {
        return this.applyBizId;
    }

    public FinishRcpRtcRequest setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public FinishRcpRtcRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public FinishRcpRtcRequest setDebtAmount(Amount debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }
    public Amount getDebtAmount() {
        return this.debtAmount;
    }

    public FinishRcpRtcRequest setDebtEndDate(String debtEndDate) {
        this.debtEndDate = debtEndDate;
        return this;
    }
    public String getDebtEndDate() {
        return this.debtEndDate;
    }

    public FinishRcpRtcRequest setDebtStartDate(String debtStartDate) {
        this.debtStartDate = debtStartDate;
        return this;
    }
    public String getDebtStartDate() {
        return this.debtStartDate;
    }

    public FinishRcpRtcRequest setEvaluationAmount(Amount evaluationAmount) {
        this.evaluationAmount = evaluationAmount;
        return this;
    }
    public Amount getEvaluationAmount() {
        return this.evaluationAmount;
    }

    public FinishRcpRtcRequest setMortgagee(EntityBasicInfo mortgagee) {
        this.mortgagee = mortgagee;
        return this;
    }
    public EntityBasicInfo getMortgagee() {
        return this.mortgagee;
    }

    public FinishRcpRtcRequest setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
        return this;
    }
    public String getMortgageType() {
        return this.mortgageType;
    }

    public FinishRcpRtcRequest setOtherRightInfo(OtherRightInfo otherRightInfo) {
        this.otherRightInfo = otherRightInfo;
        return this;
    }
    public OtherRightInfo getOtherRightInfo() {
        return this.otherRightInfo;
    }

    public FinishRcpRtcRequest setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }
    public String getRegisteredDate() {
        return this.registeredDate;
    }

    public FinishRcpRtcRequest setMaterialFileList(java.util.List<MaterialFileInfo> materialFileList) {
        this.materialFileList = materialFileList;
        return this;
    }
    public java.util.List<MaterialFileInfo> getMaterialFileList() {
        return this.materialFileList;
    }

}
