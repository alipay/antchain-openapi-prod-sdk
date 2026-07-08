// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubRevenueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 商户订单号需要唯一，方便定位到每一笔订单
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 01:加值；02:减值
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

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

    public static QueryCutpaymentsubRevenueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubRevenueRequest self = new QueryCutpaymentsubRevenueRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubRevenueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentsubRevenueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentsubRevenueRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentsubRevenueRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryCutpaymentsubRevenueRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryCutpaymentsubRevenueRequest setFirstLevelMemberid(String firstLevelMemberid) {
        this.firstLevelMemberid = firstLevelMemberid;
        return this;
    }
    public String getFirstLevelMemberid() {
        return this.firstLevelMemberid;
    }

    public QueryCutpaymentsubRevenueRequest setFirstLevelTerminalid(String firstLevelTerminalid) {
        this.firstLevelTerminalid = firstLevelTerminalid;
        return this;
    }
    public String getFirstLevelTerminalid() {
        return this.firstLevelTerminalid;
    }

    public QueryCutpaymentsubRevenueRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
