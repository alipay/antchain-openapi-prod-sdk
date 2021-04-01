// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListLogisticFinanceDisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分布式数字身份列表
    @NameInMap("did_list")
    public java.util.List<DidInfo> didList;

    public static ListLogisticFinanceDisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogisticFinanceDisResponse self = new ListLogisticFinanceDisResponse();
        return TeaModel.build(map, self);
    }

    public ListLogisticFinanceDisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLogisticFinanceDisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLogisticFinanceDisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLogisticFinanceDisResponse setDidList(java.util.List<DidInfo> didList) {
        this.didList = didList;
        return this;
    }
    public java.util.List<DidInfo> getDidList() {
        return this.didList;
    }

}
