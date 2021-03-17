// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class InitRcpMgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    // 确认预抵押结论，Y-表示继续，N-表示中止
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 中止抵押的原因code
    @NameInMap("fail_code")
    public String failCode;

    // 中止抵押的原因描述
    @NameInMap("fail_desc")
    public String failDesc;

    // 抵押登记相关合同变量和值全集，Map<String,String>的json格式
    @NameInMap("ar_var_value_json")
    @Validation(required = true)
    public String arVarValueJson;

    // 抵押担保信息
    @NameInMap("mg_order_mort_guarantee")
    @Validation(required = true)
    public MortGuaranteeInfo mgOrderMortGuarantee;

    public static InitRcpMgRequest build(java.util.Map<String, ?> map) throws Exception {
        InitRcpMgRequest self = new InitRcpMgRequest();
        return TeaModel.build(map, self);
    }

    public InitRcpMgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitRcpMgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitRcpMgRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public InitRcpMgRequest setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

    public InitRcpMgRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public InitRcpMgRequest setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public InitRcpMgRequest setFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }
    public String getFailDesc() {
        return this.failDesc;
    }

    public InitRcpMgRequest setArVarValueJson(String arVarValueJson) {
        this.arVarValueJson = arVarValueJson;
        return this;
    }
    public String getArVarValueJson() {
        return this.arVarValueJson;
    }

    public InitRcpMgRequest setMgOrderMortGuarantee(MortGuaranteeInfo mgOrderMortGuarantee) {
        this.mgOrderMortGuarantee = mgOrderMortGuarantee;
        return this;
    }
    public MortGuaranteeInfo getMgOrderMortGuarantee() {
        return this.mgOrderMortGuarantee;
    }

}
