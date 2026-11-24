// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class FileurlBlockchainBotIotagentFilesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件ID
    @NameInMap("file_id")
    public String fileId;

    // 短期预签名下载地址
    @NameInMap("file_url")
    public String fileUrl;

    // 下载地址过期时间（ISO-8601）
    @NameInMap("expire_at")
    public String expireAt;

    public static FileurlBlockchainBotIotagentFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        FileurlBlockchainBotIotagentFilesResponse self = new FileurlBlockchainBotIotagentFilesResponse();
        return TeaModel.build(map, self);
    }

    public FileurlBlockchainBotIotagentFilesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FileurlBlockchainBotIotagentFilesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FileurlBlockchainBotIotagentFilesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FileurlBlockchainBotIotagentFilesResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileurlBlockchainBotIotagentFilesResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public FileurlBlockchainBotIotagentFilesResponse setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

}
