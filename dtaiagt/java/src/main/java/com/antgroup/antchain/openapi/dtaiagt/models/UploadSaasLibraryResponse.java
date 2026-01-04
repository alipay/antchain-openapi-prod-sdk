// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UploadSaasLibraryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件上传响应
    @NameInMap("data")
    public LibraryUploadFileResult data;

    public static UploadSaasLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSaasLibraryResponse self = new UploadSaasLibraryResponse();
        return TeaModel.build(map, self);
    }

    public UploadSaasLibraryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSaasLibraryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSaasLibraryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSaasLibraryResponse setData(LibraryUploadFileResult data) {
        this.data = data;
        return this;
    }
    public LibraryUploadFileResult getData() {
        return this.data;
    }

}
