// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubBalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 二级商户账户号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 一级商户商户号
    @NameInMap("first_level_memberid")
    @Validation(required = true)
    public String firstLevelMemberid;

    // 一级商户终端号
    @NameInMap("first_level_terminalid")
    @Validation(required = true)
    public String firstLevelTerminalid;

    public static QueryCutpaymentsubBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubBalanceRequest self = new QueryCutpaymentsubBalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentsubBalanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentsubBalanceRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentsubBalanceRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryCutpaymentsubBalanceRequest setFirstLevelMemberid(String firstLevelMemberid) {
        this.firstLevelMemberid = firstLevelMemberid;
        return this;
    }
    public String getFirstLevelMemberid() {
        return this.firstLevelMemberid;
    }

    public QueryCutpaymentsubBalanceRequest setFirstLevelTerminalid(String firstLevelTerminalid) {
        this.firstLevelTerminalid = firstLevelTerminalid;
        return this;
    }
    public String getFirstLevelTerminalid() {
        return this.firstLevelTerminalid;
    }

}
