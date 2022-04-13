// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticsceneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 弹性场景列表
    @NameInMap("scenes")
    public java.util.List<ElasticScene> scenes;

    public static QueryFlowElasticsceneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticsceneResponse self = new QueryFlowElasticsceneResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticsceneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowElasticsceneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowElasticsceneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowElasticsceneResponse setScenes(java.util.List<ElasticScene> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<ElasticScene> getScenes() {
        return this.scenes;
    }

}
