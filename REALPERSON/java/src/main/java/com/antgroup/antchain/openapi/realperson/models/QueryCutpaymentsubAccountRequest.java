// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 登录号
    @NameInMap("login_no")
    @Validation(required = true)
    public String loginNo;

    // 一级商户商户号
    @NameInMap("first_level_memberid")
    @Validation(required = true)
    public String firstLevelMemberid;

    // 一级商户终端号
    @NameInMap("first_level_terminalid")
    @Validation(required = true)
    public String firstLevelTerminalid;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryCutpaymentsubAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubAccountRequest self = new QueryCutpaymentsubAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentsubAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentsubAccountRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentsubAccountRequest setLoginNo(String loginNo) {
        this.loginNo = loginNo;
        return this;
    }
    public String getLoginNo() {
        return this.loginNo;
    }

    public QueryCutpaymentsubAccountRequest setFirstLevelMemberid(String firstLevelMemberid) {
        this.firstLevelMemberid = firstLevelMemberid;
        return this;
    }
    public String getFirstLevelMemberid() {
        return this.firstLevelMemberid;
    }

    public QueryCutpaymentsubAccountRequest setFirstLevelTerminalid(String firstLevelTerminalid) {
        this.firstLevelTerminalid = firstLevelTerminalid;
        return this;
    }
    public String getFirstLevelTerminalid() {
        return this.firstLevelTerminalid;
    }

    public QueryCutpaymentsubAccountRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
