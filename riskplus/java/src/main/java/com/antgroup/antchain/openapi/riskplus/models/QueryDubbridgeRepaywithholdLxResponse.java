// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaywithholdLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代扣状态，
    // 1、代扣成功
    // 2、代扣失败
    // 3. 代扣处理中
    // 4. 未收到代扣请求（交易侧可以重复发起代扣）
    @NameInMap("status")
    public Long status;

    // 代扣描述，失败时，需给出的错误描述
    @NameInMap("msg")
    public String msg;

    // 资金方扣款交易流水号，受理流水号(资金方)
    @NameInMap("order_num")
    public String orderNum;

    // 支付通道交易流水号
    @NameInMap("trans_num")
    public String transNum;

    // 代扣明细
    @NameInMap("withhold_detail")
    public java.util.List<WithholdDetailItem> withholdDetail;

    public static QueryDubbridgeRepaywithholdLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaywithholdLxResponse self = new QueryDubbridgeRepaywithholdLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaywithholdLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepaywithholdLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepaywithholdLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepaywithholdLxResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryDubbridgeRepaywithholdLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeRepaywithholdLxResponse setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public QueryDubbridgeRepaywithholdLxResponse setTransNum(String transNum) {
        this.transNum = transNum;
        return this;
    }
    public String getTransNum() {
        return this.transNum;
    }

    public QueryDubbridgeRepaywithholdLxResponse setWithholdDetail(java.util.List<WithholdDetailItem> withholdDetail) {
        this.withholdDetail = withholdDetail;
        return this;
    }
    public java.util.List<WithholdDetailItem> getWithholdDetail() {
        return this.withholdDetail;
    }

}
