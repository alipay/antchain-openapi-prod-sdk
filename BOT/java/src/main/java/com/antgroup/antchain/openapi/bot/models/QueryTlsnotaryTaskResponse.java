// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTlsnotaryTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 唯一的业务 tlsnotary 任务 id
    @NameInMap("task_id")
    public String taskId;

    // tlsnotary任务执行状态
    @NameInMap("state")
    public Long state;

    // 上传文件oss链接
    @NameInMap("upload_oss_links")
    public TlsnotaryUploadOssLinks uploadOssLinks;

    // 认证签名
    @NameInMap("notary_signature")
    public String notarySignature;

    // 业务错误码
    @NameInMap("error_code")
    public Long errorCode;

    // 业务错误信息
    @NameInMap("error_msg")
    public String errorMsg;

    public static QueryTlsnotaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTlsnotaryTaskResponse self = new QueryTlsnotaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryTlsnotaryTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTlsnotaryTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTlsnotaryTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTlsnotaryTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryTlsnotaryTaskResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public QueryTlsnotaryTaskResponse setUploadOssLinks(TlsnotaryUploadOssLinks uploadOssLinks) {
        this.uploadOssLinks = uploadOssLinks;
        return this;
    }
    public TlsnotaryUploadOssLinks getUploadOssLinks() {
        return this.uploadOssLinks;
    }

    public QueryTlsnotaryTaskResponse setNotarySignature(String notarySignature) {
        this.notarySignature = notarySignature;
        return this;
    }
    public String getNotarySignature() {
        return this.notarySignature;
    }

    public QueryTlsnotaryTaskResponse setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryTlsnotaryTaskResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
