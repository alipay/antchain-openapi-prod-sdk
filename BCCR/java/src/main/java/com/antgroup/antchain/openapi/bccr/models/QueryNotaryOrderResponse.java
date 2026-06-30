// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单状态
    @NameInMap("status")
    public String status;

    // 支付状态最后更新时间戳
    @NameInMap("pay_time")
    public Long payTime;

    // 用户预览签署文件的时间戳
    @NameInMap("preview_time")
    public Long previewTime;

    // 支付状态
    @NameInMap("pay_status")
    public String payStatus;

    // 补充材料说明，当需要补充材料时提供
    @NameInMap("material_remarks")
    public String materialRemarks;

    // 出证的公证书信息
    @NameInMap("notary_info")
    public NotaryInfo notaryInfo;

    // 拒绝办理信息
    @NameInMap("reject_info")
    public RefuseInfo rejectInfo;

    // 终止信息
    @NameInMap("terminal_info")
    public RefuseInfo terminalInfo;

    // 支付方式
    @NameInMap("pay_type")
    public String payType;

    // 用户应付的金额
    @NameInMap("payable_amount")
    public Long payableAmount;

    // 用户实际支付的金额
    @NameInMap("paid_amount")
    public Long paidAmount;

    // 公证处物流信息
    @NameInMap("notary_express_list")
    public java.util.List<ExpressInfo> notaryExpressList;

    // 发票物流信息
    @NameInMap("invoice_express_list")
    public java.util.List<ExpressInfo> invoiceExpressList;

    public static QueryNotaryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryOrderResponse self = new QueryNotaryOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotaryOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotaryOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotaryOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotaryOrderResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryNotaryOrderResponse setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public QueryNotaryOrderResponse setPreviewTime(Long previewTime) {
        this.previewTime = previewTime;
        return this;
    }
    public Long getPreviewTime() {
        return this.previewTime;
    }

    public QueryNotaryOrderResponse setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public QueryNotaryOrderResponse setMaterialRemarks(String materialRemarks) {
        this.materialRemarks = materialRemarks;
        return this;
    }
    public String getMaterialRemarks() {
        return this.materialRemarks;
    }

    public QueryNotaryOrderResponse setNotaryInfo(NotaryInfo notaryInfo) {
        this.notaryInfo = notaryInfo;
        return this;
    }
    public NotaryInfo getNotaryInfo() {
        return this.notaryInfo;
    }

    public QueryNotaryOrderResponse setRejectInfo(RefuseInfo rejectInfo) {
        this.rejectInfo = rejectInfo;
        return this;
    }
    public RefuseInfo getRejectInfo() {
        return this.rejectInfo;
    }

    public QueryNotaryOrderResponse setTerminalInfo(RefuseInfo terminalInfo) {
        this.terminalInfo = terminalInfo;
        return this;
    }
    public RefuseInfo getTerminalInfo() {
        return this.terminalInfo;
    }

    public QueryNotaryOrderResponse setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public QueryNotaryOrderResponse setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }
    public Long getPayableAmount() {
        return this.payableAmount;
    }

    public QueryNotaryOrderResponse setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }
    public Long getPaidAmount() {
        return this.paidAmount;
    }

    public QueryNotaryOrderResponse setNotaryExpressList(java.util.List<ExpressInfo> notaryExpressList) {
        this.notaryExpressList = notaryExpressList;
        return this;
    }
    public java.util.List<ExpressInfo> getNotaryExpressList() {
        return this.notaryExpressList;
    }

    public QueryNotaryOrderResponse setInvoiceExpressList(java.util.List<ExpressInfo> invoiceExpressList) {
        this.invoiceExpressList = invoiceExpressList;
        return this;
    }
    public java.util.List<ExpressInfo> getInvoiceExpressList() {
        return this.invoiceExpressList;
    }

}
