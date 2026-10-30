// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TrajectoryIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 轮次索引列表(JSON)
    @NameInMap("scopes_json")
    public String scopesJson;

    // 覆盖状态(JSON)
    @NameInMap("coverage_json")
    public String coverageJson;

    // 下一页游标
    @NameInMap("next_cursor")
    public String nextCursor;

    // 总轮次数
    @NameInMap("total_scopes")
    public Long totalScopes;

    public static TrajectoryIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        TrajectoryIotagentSessionResponse self = new TrajectoryIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public TrajectoryIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TrajectoryIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TrajectoryIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TrajectoryIotagentSessionResponse setScopesJson(String scopesJson) {
        this.scopesJson = scopesJson;
        return this;
    }
    public String getScopesJson() {
        return this.scopesJson;
    }

    public TrajectoryIotagentSessionResponse setCoverageJson(String coverageJson) {
        this.coverageJson = coverageJson;
        return this;
    }
    public String getCoverageJson() {
        return this.coverageJson;
    }

    public TrajectoryIotagentSessionResponse setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public TrajectoryIotagentSessionResponse setTotalScopes(Long totalScopes) {
        this.totalScopes = totalScopes;
        return this;
    }
    public Long getTotalScopes() {
        return this.totalScopes;
    }

}
