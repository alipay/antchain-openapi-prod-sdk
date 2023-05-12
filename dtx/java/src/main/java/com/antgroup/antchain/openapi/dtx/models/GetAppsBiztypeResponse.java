// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetAppsBiztypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 参与者信息
    @NameInMap("data")
    public java.util.List<ActionInfo> data;

    // Saga状态机的json定义
    @NameInMap("statemachine_json")
    public String statemachineJson;

    public static GetAppsBiztypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppsBiztypeResponse self = new GetAppsBiztypeResponse();
        return TeaModel.build(map, self);
    }

    public GetAppsBiztypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppsBiztypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppsBiztypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppsBiztypeResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppsBiztypeResponse setData(java.util.List<ActionInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ActionInfo> getData() {
        return this.data;
    }

    public GetAppsBiztypeResponse setStatemachineJson(String statemachineJson) {
        this.statemachineJson = statemachineJson;
        return this;
    }
    public String getStatemachineJson() {
        return this.statemachineJson;
    }

}
