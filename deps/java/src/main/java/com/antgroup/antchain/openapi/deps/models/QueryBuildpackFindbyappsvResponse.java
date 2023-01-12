// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappsvResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 包含Buildpack对象的json串
    @NameInMap("buildpack")
    public String buildpack;

    public static QueryBuildpackFindbyappsvResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappsvResponse self = new QueryBuildpackFindbyappsvResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappsvResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbyappsvResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbyappsvResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbyappsvResponse setBuildpack(String buildpack) {
        this.buildpack = buildpack;
        return this;
    }
    public String getBuildpack() {
        return this.buildpack;
    }

}
