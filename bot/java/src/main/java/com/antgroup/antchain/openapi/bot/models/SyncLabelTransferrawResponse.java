// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncLabelTransferrawResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 标签上链hash返回
    @NameInMap("result_list")
    public java.util.List<LabelChainResult> resultList;

    public static SyncLabelTransferrawResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLabelTransferrawResponse self = new SyncLabelTransferrawResponse();
        return TeaModel.build(map, self);
    }

    public SyncLabelTransferrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncLabelTransferrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncLabelTransferrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncLabelTransferrawResponse setResultList(java.util.List<LabelChainResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<LabelChainResult> getResultList() {
        return this.resultList;
    }

}
