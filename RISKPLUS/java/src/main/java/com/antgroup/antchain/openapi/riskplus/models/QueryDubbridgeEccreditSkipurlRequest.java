// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeEccreditSkipurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 客户申请提交后，该笔申请对应的银行内部流水号，一直到客户签约完成都是这个流水号。
    @NameInMap("apply_no")
    public String applyNo;

    // 企业信息
    @NameInMap("enterprise_info")
    public EcEnterpriseInfo enterpriseInfo;

    // 申请人信息
    @NameInMap("applicant_person_info")
    public EcApplicantPersonInfo applicantPersonInfo;

    // 操作类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    public static QueryDubbridgeEccreditSkipurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeEccreditSkipurlRequest self = new QueryDubbridgeEccreditSkipurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeEccreditSkipurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeEccreditSkipurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeEccreditSkipurlRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryDubbridgeEccreditSkipurlRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public QueryDubbridgeEccreditSkipurlRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryDubbridgeEccreditSkipurlRequest setEnterpriseInfo(EcEnterpriseInfo enterpriseInfo) {
        this.enterpriseInfo = enterpriseInfo;
        return this;
    }
    public EcEnterpriseInfo getEnterpriseInfo() {
        return this.enterpriseInfo;
    }

    public QueryDubbridgeEccreditSkipurlRequest setApplicantPersonInfo(EcApplicantPersonInfo applicantPersonInfo) {
        this.applicantPersonInfo = applicantPersonInfo;
        return this;
    }
    public EcApplicantPersonInfo getApplicantPersonInfo() {
        return this.applicantPersonInfo;
    }

    public QueryDubbridgeEccreditSkipurlRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
