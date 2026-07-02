// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class ImportTaskRateinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("cus_no")
    @Validation(required = true)
    public String cusNo;

    // 借据信息
    @NameInMap("loan_info_list")
    @Validation(required = true)
    public java.util.List<String> loanInfoList;

    public static ImportTaskRateinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTaskRateinfoRequest self = new ImportTaskRateinfoRequest();
        return TeaModel.build(map, self);
    }

    public ImportTaskRateinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportTaskRateinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportTaskRateinfoRequest setCusNo(String cusNo) {
        this.cusNo = cusNo;
        return this;
    }
    public String getCusNo() {
        return this.cusNo;
    }

    public ImportTaskRateinfoRequest setLoanInfoList(java.util.List<String> loanInfoList) {
        this.loanInfoList = loanInfoList;
        return this;
    }
    public java.util.List<String> getLoanInfoList() {
        return this.loanInfoList;
    }

}
