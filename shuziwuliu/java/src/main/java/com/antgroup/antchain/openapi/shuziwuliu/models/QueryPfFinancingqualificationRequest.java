// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfFinancingqualificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("client_no")
    @Validation(required = true)
    public String clientNo;

    // 融资主体did
    @NameInMap("financing_subject_did")
    @Validation(required = true)
    public String financingSubjectDid;

    // 借款人证件类型
    @NameInMap("borrower_card_type")
    @Validation(required = true)
    public String borrowerCardType;

    // 借款人证件号码
    // 
    // 
    @NameInMap("borrower_card_no")
    @Validation(required = true)
    public String borrowerCardNo;

    // 申请流水号
    @NameInMap("apl_seq_no")
    @Validation(required = true)
    public String aplSeqNo;

    public static QueryPfFinancingqualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfFinancingqualificationRequest self = new QueryPfFinancingqualificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfFinancingqualificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfFinancingqualificationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfFinancingqualificationRequest setClientNo(String clientNo) {
        this.clientNo = clientNo;
        return this;
    }
    public String getClientNo() {
        return this.clientNo;
    }

    public QueryPfFinancingqualificationRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public QueryPfFinancingqualificationRequest setBorrowerCardType(String borrowerCardType) {
        this.borrowerCardType = borrowerCardType;
        return this;
    }
    public String getBorrowerCardType() {
        return this.borrowerCardType;
    }

    public QueryPfFinancingqualificationRequest setBorrowerCardNo(String borrowerCardNo) {
        this.borrowerCardNo = borrowerCardNo;
        return this;
    }
    public String getBorrowerCardNo() {
        return this.borrowerCardNo;
    }

    public QueryPfFinancingqualificationRequest setAplSeqNo(String aplSeqNo) {
        this.aplSeqNo = aplSeqNo;
        return this;
    }
    public String getAplSeqNo() {
        return this.aplSeqNo;
    }

}
