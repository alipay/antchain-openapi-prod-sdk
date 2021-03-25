// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappservicesResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 包含BuildpackV2Adapter对象的json串
    @NameInMap("buildpack_v2_adapter")
    public String buildpackV2Adapter;

    public static QueryBuildpackFindbyappservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappservicesResponse self = new QueryBuildpackFindbyappservicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappservicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbyappservicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbyappservicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbyappservicesResponse setBuildpackV2Adapter(String buildpackV2Adapter) {
        this.buildpackV2Adapter = buildpackV2Adapter;
        return this;
    }
    public String getBuildpackV2Adapter() {
        return this.buildpackV2Adapter;
    }

}
