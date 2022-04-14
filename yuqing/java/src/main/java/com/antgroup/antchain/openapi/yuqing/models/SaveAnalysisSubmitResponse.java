// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SaveAnalysisSubmitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分析任务ID
    @NameInMap("analysis_id")
    public String analysisId;

    // 其他
    @NameInMap("result_json")
    public String resultJson;

    public static SaveAnalysisSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAnalysisSubmitResponse self = new SaveAnalysisSubmitResponse();
        return TeaModel.build(map, self);
    }

    public SaveAnalysisSubmitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveAnalysisSubmitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveAnalysisSubmitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveAnalysisSubmitResponse setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public String getAnalysisId() {
        return this.analysisId;
    }

    public SaveAnalysisSubmitResponse setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
