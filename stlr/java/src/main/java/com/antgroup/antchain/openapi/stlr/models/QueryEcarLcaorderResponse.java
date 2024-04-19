// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarLcaorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // LCA订单单号
    @NameInMap("order_no")
    public String orderNo;

    // 来源于三方平台的订单编号
    @NameInMap("source_order_no")
    public String sourceOrderNo;

    // 三方平台客户ID，在三方平台唯一
    @NameInMap("customer_id")
    public String customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    @NameInMap("carbon_account_no")
    public String carbonAccountNo;

    // Pending——待分配，Closed——已关闭，Allocated——已分配，Finished——已完成
    @NameInMap("order_status")
    public String orderStatus;

    // 产品概要信息
    @NameInMap("product")
    public EnterpriseProductOutline product;

    // 足迹计算信息
    @NameInMap("lca_carbon_datum")
    public LcaCarbonDatum lcaCarbonDatum;

    public static QueryEcarLcaorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarLcaorderResponse self = new QueryEcarLcaorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryEcarLcaorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEcarLcaorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEcarLcaorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEcarLcaorderResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryEcarLcaorderResponse setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
        return this;
    }
    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    public QueryEcarLcaorderResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryEcarLcaorderResponse setCarbonAccountNo(String carbonAccountNo) {
        this.carbonAccountNo = carbonAccountNo;
        return this;
    }
    public String getCarbonAccountNo() {
        return this.carbonAccountNo;
    }

    public QueryEcarLcaorderResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public QueryEcarLcaorderResponse setProduct(EnterpriseProductOutline product) {
        this.product = product;
        return this;
    }
    public EnterpriseProductOutline getProduct() {
        return this.product;
    }

    public QueryEcarLcaorderResponse setLcaCarbonDatum(LcaCarbonDatum lcaCarbonDatum) {
        this.lcaCarbonDatum = lcaCarbonDatum;
        return this;
    }
    public LcaCarbonDatum getLcaCarbonDatum() {
        return this.lcaCarbonDatum;
    }

}
