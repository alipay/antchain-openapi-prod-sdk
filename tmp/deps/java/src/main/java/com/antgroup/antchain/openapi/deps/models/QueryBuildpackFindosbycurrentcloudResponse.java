// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindosbycurrentcloudResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // BuildpackOS
    @NameInMap("buildpack_os")
    public java.util.List<BuildpackOS> buildpackOs;

    public static QueryBuildpackFindosbycurrentcloudResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindosbycurrentcloudResponse self = new QueryBuildpackFindosbycurrentcloudResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindosbycurrentcloudResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindosbycurrentcloudResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindosbycurrentcloudResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindosbycurrentcloudResponse setBuildpackOs(java.util.List<BuildpackOS> buildpackOs) {
        this.buildpackOs = buildpackOs;
        return this;
    }
    public java.util.List<BuildpackOS> getBuildpackOs() {
        return this.buildpackOs;
    }

}
