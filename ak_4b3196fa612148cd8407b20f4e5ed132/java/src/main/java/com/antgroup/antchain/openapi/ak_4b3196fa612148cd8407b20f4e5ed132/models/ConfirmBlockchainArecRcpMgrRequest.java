// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class ConfirmBlockchainArecRcpMgrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 助贷平台
    @NameInMap("loan_assist_platform")
    @Validation(required = true)
    public String loanAssistPlatform;

    // 房产链内部银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 解抵押单号
    @NameInMap("mg_release_order_no")
    @Validation(required = true)
    public String mgReleaseOrderNo;

    // Y=继续解抵押,N=终止解抵押
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 终止解抵押原因码
    @NameInMap("fail_code")
    public String failCode;

    // 终止解抵押原因描述
    @NameInMap("fail_desc")
    public String failDesc;

    // 银行签署完成的解抵押合同列表
    @NameInMap("agreements")
    @Validation(required = true)
    public java.util.List<Agreement> agreements;

    public static ConfirmBlockchainArecRcpMgrRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmBlockchainArecRcpMgrRequest self = new ConfirmBlockchainArecRcpMgrRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmBlockchainArecRcpMgrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmBlockchainArecRcpMgrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmBlockchainArecRcpMgrRequest setLoanAssistPlatform(String loanAssistPlatform) {
        this.loanAssistPlatform = loanAssistPlatform;
        return this;
    }
    public String getLoanAssistPlatform() {
        return this.loanAssistPlatform;
    }

    public ConfirmBlockchainArecRcpMgrRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public ConfirmBlockchainArecRcpMgrRequest setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

    public ConfirmBlockchainArecRcpMgrRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ConfirmBlockchainArecRcpMgrRequest setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public ConfirmBlockchainArecRcpMgrRequest setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public ConfirmBlockchainArecRcpMgrRequest setAgreements(java.util.List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }

}
