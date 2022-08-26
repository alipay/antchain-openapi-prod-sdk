// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class ConfirmBlockchainArecRcpMgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 抵押单号
    @NameInMap("mg_order_no")
    @Validation(required = true)
    public String mgOrderNo;

    // 确认抵押登记结果，Y:继续,N:中止抵押
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 银行返回的中止抵押原因code
    @NameInMap("fail_code")
    public String failCode;

    // 银行反馈的中止抵押原因描述
    @NameInMap("fail_desc")
    public String failDesc;

    public static ConfirmBlockchainArecRcpMgRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmBlockchainArecRcpMgRequest self = new ConfirmBlockchainArecRcpMgRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmBlockchainArecRcpMgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmBlockchainArecRcpMgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmBlockchainArecRcpMgRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public ConfirmBlockchainArecRcpMgRequest setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

    public ConfirmBlockchainArecRcpMgRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ConfirmBlockchainArecRcpMgRequest setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public ConfirmBlockchainArecRcpMgRequest setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

}
