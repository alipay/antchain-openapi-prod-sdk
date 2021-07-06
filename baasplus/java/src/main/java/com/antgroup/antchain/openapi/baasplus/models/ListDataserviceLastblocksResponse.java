// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class ListDataserviceLastblocksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块信息
    @NameInMap("last_block_list")
    public java.util.List<BlockInfo> lastBlockList;

    public static ListDataserviceLastblocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataserviceLastblocksResponse self = new ListDataserviceLastblocksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataserviceLastblocksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataserviceLastblocksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataserviceLastblocksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataserviceLastblocksResponse setLastBlockList(java.util.List<BlockInfo> lastBlockList) {
        this.lastBlockList = lastBlockList;
        return this;
    }
    public java.util.List<BlockInfo> getLastBlockList() {
        return this.lastBlockList;
    }

}
