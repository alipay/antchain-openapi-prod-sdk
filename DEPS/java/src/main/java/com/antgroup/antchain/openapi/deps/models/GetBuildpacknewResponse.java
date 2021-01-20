// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBuildpacknewResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // buildpackDetailVO
    @NameInMap("buildpack_detail_v_o")
    public BuildpackDetailVO buildpackDetailVO;

    public static GetBuildpacknewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpacknewResponse self = new GetBuildpacknewResponse();
        return TeaModel.build(map, self);
    }

    public GetBuildpacknewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBuildpacknewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBuildpacknewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBuildpacknewResponse setBuildpackDetailVO(BuildpackDetailVO buildpackDetailVO) {
        this.buildpackDetailVO = buildpackDetailVO;
        return this;
    }
    public BuildpackDetailVO getBuildpackDetailVO() {
        return this.buildpackDetailVO;
    }

}
