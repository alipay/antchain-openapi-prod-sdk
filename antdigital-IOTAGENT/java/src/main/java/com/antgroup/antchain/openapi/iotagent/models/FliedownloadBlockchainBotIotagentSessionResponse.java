// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class FliedownloadBlockchainBotIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件信息
    @NameInMap("file")
    public FileInfo file;

    public static FliedownloadBlockchainBotIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        FliedownloadBlockchainBotIotagentSessionResponse self = new FliedownloadBlockchainBotIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public FliedownloadBlockchainBotIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FliedownloadBlockchainBotIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FliedownloadBlockchainBotIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FliedownloadBlockchainBotIotagentSessionResponse setFile(FileInfo file) {
        this.file = file;
        return this;
    }
    public FileInfo getFile() {
        return this.file;
    }

}
