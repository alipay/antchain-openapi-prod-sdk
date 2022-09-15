// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingmodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户的物模型内容（多个物模型功能拼合的json）
    @NameInMap("thing_model")
    public String thingModel;

    public static QueryThingmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingmodelResponse self = new QueryThingmodelResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingmodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThingmodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThingmodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThingmodelResponse setThingModel(String thingModel) {
        this.thingModel = thingModel;
        return this;
    }
    public String getThingModel() {
        return this.thingModel;
    }

}
