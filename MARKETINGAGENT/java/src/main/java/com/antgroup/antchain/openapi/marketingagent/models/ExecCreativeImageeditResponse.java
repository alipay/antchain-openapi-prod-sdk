// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class ExecCreativeImageeditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次子图编辑任务的独立消息 ID，用于调用子图编辑查询接口获取进度和结果。
    @NameInMap("message_id")
    public String messageId;

    // 本次编辑新建的版本 ID。任务提交成功不代表图片生成成功；查询确认成功后可作为下一轮修改来源。
    @NameInMap("segment_version_id")
    public String segmentVersionId;

    public static ExecCreativeImageeditResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecCreativeImageeditResponse self = new ExecCreativeImageeditResponse();
        return TeaModel.build(map, self);
    }

    public ExecCreativeImageeditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecCreativeImageeditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecCreativeImageeditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecCreativeImageeditResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ExecCreativeImageeditResponse setSegmentVersionId(String segmentVersionId) {
        this.segmentVersionId = segmentVersionId;
        return this;
    }
    public String getSegmentVersionId() {
        return this.segmentVersionId;
    }

}
