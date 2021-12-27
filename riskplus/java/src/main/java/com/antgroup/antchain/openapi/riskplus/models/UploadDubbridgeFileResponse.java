// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadDubbridgeFileResponse extends TeaModel {
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
    @NameInMap("file_info")
    public DubheFileInfo fileInfo;

    public static UploadDubbridgeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDubbridgeFileResponse self = new UploadDubbridgeFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadDubbridgeFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadDubbridgeFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadDubbridgeFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadDubbridgeFileResponse setFileInfo(DubheFileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public DubheFileInfo getFileInfo() {
        return this.fileInfo;
    }

}
