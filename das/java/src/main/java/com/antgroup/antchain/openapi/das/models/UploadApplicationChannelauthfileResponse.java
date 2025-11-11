// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadApplicationChannelauthfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权协议索引号
    @NameInMap("file_index")
    public String fileIndex;

    public static UploadApplicationChannelauthfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationChannelauthfileResponse self = new UploadApplicationChannelauthfileResponse();
        return TeaModel.build(map, self);
    }

    public UploadApplicationChannelauthfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadApplicationChannelauthfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadApplicationChannelauthfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadApplicationChannelauthfileResponse setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

}
