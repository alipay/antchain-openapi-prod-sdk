// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class GetInteractvideoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 视频答案URL(视频资源存储在OSS服务上,访问接口时,返回一个视频下载链接)
    @NameInMap("answer_video_url")
    public String answerVideoUrl;

    public static GetInteractvideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInteractvideoResponse self = new GetInteractvideoResponse();
        return TeaModel.build(map, self);
    }

    public GetInteractvideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInteractvideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInteractvideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInteractvideoResponse setAnswerVideoUrl(String answerVideoUrl) {
        this.answerVideoUrl = answerVideoUrl;
        return this;
    }
    public String getAnswerVideoUrl() {
        return this.answerVideoUrl;
    }

}
