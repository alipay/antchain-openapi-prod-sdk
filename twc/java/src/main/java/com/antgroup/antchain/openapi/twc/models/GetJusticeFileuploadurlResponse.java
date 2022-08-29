// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetJusticeFileuploadurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 获取的文件key, 请妥善保存, 用于后续接口调用.
    @NameInMap("file_key")
    public String fileKey;

    // 文件上传链接url
    @NameInMap("upload_url")
    public String uploadUrl;

    // 链接失效日期: "yyyy-MM-dd HH:mm:ss"
    @NameInMap("expired_time")
    public String expiredTime;

    public static GetJusticeFileuploadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJusticeFileuploadurlResponse self = new GetJusticeFileuploadurlResponse();
        return TeaModel.build(map, self);
    }

    public GetJusticeFileuploadurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetJusticeFileuploadurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetJusticeFileuploadurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetJusticeFileuploadurlResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GetJusticeFileuploadurlResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public GetJusticeFileuploadurlResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

}
