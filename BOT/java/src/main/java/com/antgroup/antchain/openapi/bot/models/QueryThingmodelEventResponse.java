// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingmodelEventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 物模型事件json
    // 
    @NameInMap("thing_model_event_json")
    public String thingModelEventJson;

    // 数据样例
    @NameInMap("data_demo")
    public String dataDemo;

    public static QueryThingmodelEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingmodelEventResponse self = new QueryThingmodelEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingmodelEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThingmodelEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThingmodelEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThingmodelEventResponse setThingModelEventJson(String thingModelEventJson) {
        this.thingModelEventJson = thingModelEventJson;
        return this;
    }
    public String getThingModelEventJson() {
        return this.thingModelEventJson;
    }

    public QueryThingmodelEventResponse setDataDemo(String dataDemo) {
        this.dataDemo = dataDemo;
        return this;
    }
    public String getDataDemo() {
        return this.dataDemo;
    }

}
