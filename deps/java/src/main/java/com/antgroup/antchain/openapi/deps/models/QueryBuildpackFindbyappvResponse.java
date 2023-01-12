// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappvResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Buildpack
    @NameInMap("buildpack")
    public BuildpackByAppV buildpack;

    public static QueryBuildpackFindbyappvResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappvResponse self = new QueryBuildpackFindbyappvResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappvResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbyappvResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbyappvResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbyappvResponse setBuildpack(BuildpackByAppV buildpack) {
        this.buildpack = buildpack;
        return this;
    }
    public BuildpackByAppV getBuildpack() {
        return this.buildpack;
    }

}
