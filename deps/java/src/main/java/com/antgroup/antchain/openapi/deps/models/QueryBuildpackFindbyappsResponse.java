// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 包含BuildpackV2Adapter对象的json字符串
    @NameInMap("buildpackv2adapter")
    public String buildpackv2adapter;

    public static QueryBuildpackFindbyappsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappsResponse self = new QueryBuildpackFindbyappsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbyappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbyappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbyappsResponse setBuildpackv2adapter(String buildpackv2adapter) {
        this.buildpackv2adapter = buildpackv2adapter;
        return this;
    }
    public String getBuildpackv2adapter() {
        return this.buildpackv2adapter;
    }

}
