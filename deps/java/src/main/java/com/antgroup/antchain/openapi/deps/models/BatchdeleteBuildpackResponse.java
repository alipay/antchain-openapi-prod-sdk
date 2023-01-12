// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchdeleteBuildpackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // BuildpackDetailVO
    @NameInMap("buildpack_detail_vo")
    public java.util.List<BuildpackDetailVO> buildpackDetailVo;

    public static BatchdeleteBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteBuildpackResponse self = new BatchdeleteBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public BatchdeleteBuildpackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchdeleteBuildpackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchdeleteBuildpackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchdeleteBuildpackResponse setBuildpackDetailVo(java.util.List<BuildpackDetailVO> buildpackDetailVo) {
        this.buildpackDetailVo = buildpackDetailVo;
        return this;
    }
    public java.util.List<BuildpackDetailVO> getBuildpackDetailVo() {
        return this.buildpackDetailVo;
    }

}
