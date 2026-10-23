// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentFileUploadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传后的 AFTS 文件 ID
    @NameInMap("file_id")
    public String fileId;

    // OSS 对象路径
    @NameInMap("oss_file_path")
    public String ossFilePath;

    // 图片访问地址，可用于视频生成 input_elements[].url
    @NameInMap("access_url")
    public String accessUrl;

    public static ExecAntcloudMarketingagentFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentFileUploadResponse self = new ExecAntcloudMarketingagentFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentFileUploadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentFileUploadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentFileUploadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentFileUploadResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecAntcloudMarketingagentFileUploadResponse setOssFilePath(String ossFilePath) {
        this.ossFilePath = ossFilePath;
        return this;
    }
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    public ExecAntcloudMarketingagentFileUploadResponse setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }
    public String getAccessUrl() {
        return this.accessUrl;
    }

}
