// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfWithdrawRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行端客户号
    @NameInMap("customer_no")
    @Validation(required = true, maxLength = 20)
    public String customerNo;

    // 证件类型;050 统一社会信用证代码
    @NameInMap("cert_type")
    @Validation(required = true, maxLength = 3)
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true, maxLength = 20)
    public String certNo;

    public static QueryPfWithdrawRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfWithdrawRequest self = new QueryPfWithdrawRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfWithdrawRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfWithdrawRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfWithdrawRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryPfWithdrawRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public QueryPfWithdrawRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
