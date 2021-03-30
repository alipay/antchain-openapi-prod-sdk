// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证件号
    @NameInMap("cert_no")
    @Validation(required = true, maxLength = 20)
    public String certNo;

    // 证件类型;050 统一社会信用证代码
    @NameInMap("cert_type")
    @Validation(required = true, maxLength = 3)
    public String certType;

    // 银行端客户号
    @NameInMap("customer_no")
    @Validation(required = true, maxLength = 20)
    public String customerNo;

    // 融资主体did
    @NameInMap("financing_subject_did")
    @Validation(required = true)
    public String financingSubjectDid;

    public static QueryPfQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfQuotaRequest self = new QueryPfQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfQuotaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfQuotaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryPfQuotaRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public QueryPfQuotaRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryPfQuotaRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

}
