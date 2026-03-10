// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCertificateLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 放款请求流水号
    @NameInMap("loan_req_no")
    @Validation(required = true)
    public String loanReqNo;

    // 请求方代码
    @NameInMap("source_code")
    public String sourceCode;

    // 文件类型，0结清证明
    // 1代偿凭证
    // 2放款凭证
    @NameInMap("file_type")
    @Validation(required = true)
    public Long fileType;

    // 申请日期，yyyy-MM-dd
    @NameInMap("apply_date")
    @Validation(required = true)
    public String applyDate;

    // 业务类型，
    // 1非乐花卡
    // 2乐花卡
    @NameInMap("business_type")
    @Validation(required = true)
    public Long businessType;

    public static QueryDubbridgeCertificateLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCertificateLxRequest self = new QueryDubbridgeCertificateLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCertificateLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCertificateLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCertificateLxRequest setLoanReqNo(String loanReqNo) {
        this.loanReqNo = loanReqNo;
        return this;
    }
    public String getLoanReqNo() {
        return this.loanReqNo;
    }

    public QueryDubbridgeCertificateLxRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public QueryDubbridgeCertificateLxRequest setFileType(Long fileType) {
        this.fileType = fileType;
        return this;
    }
    public Long getFileType() {
        return this.fileType;
    }

    public QueryDubbridgeCertificateLxRequest setApplyDate(String applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public String getApplyDate() {
        return this.applyDate;
    }

    public QueryDubbridgeCertificateLxRequest setBusinessType(Long businessType) {
        this.businessType = businessType;
        return this;
    }
    public Long getBusinessType() {
        return this.businessType;
    }

}
