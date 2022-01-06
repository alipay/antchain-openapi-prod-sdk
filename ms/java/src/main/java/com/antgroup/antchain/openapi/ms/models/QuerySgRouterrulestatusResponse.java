// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgRouterrulestatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Map<String, Object>
    @NameInMap("config_map")
    public String configMap;

    public static QuerySgRouterrulestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgRouterrulestatusResponse self = new QuerySgRouterrulestatusResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgRouterrulestatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgRouterrulestatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgRouterrulestatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgRouterrulestatusResponse setConfigMap(String configMap) {
        this.configMap = configMap;
        return this;
    }
    public String getConfigMap() {
        return this.configMap;
    }

}
