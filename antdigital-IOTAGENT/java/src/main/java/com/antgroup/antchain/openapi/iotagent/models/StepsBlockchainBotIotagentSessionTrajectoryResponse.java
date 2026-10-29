// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StepsBlockchainBotIotagentSessionTrajectoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行步骤列表(JSON)
    @NameInMap("steps_json")
    public String stepsJson;

    // 下一页游标
    @NameInMap("next_cursor")
    public String nextCursor;

    // 总步骤数
    @NameInMap("total_steps")
    public Long totalSteps;

    public static StepsBlockchainBotIotagentSessionTrajectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        StepsBlockchainBotIotagentSessionTrajectoryResponse self = new StepsBlockchainBotIotagentSessionTrajectoryResponse();
        return TeaModel.build(map, self);
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setStepsJson(String stepsJson) {
        this.stepsJson = stepsJson;
        return this;
    }
    public String getStepsJson() {
        return this.stepsJson;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryResponse setTotalSteps(Long totalSteps) {
        this.totalSteps = totalSteps;
        return this;
    }
    public Long getTotalSteps() {
        return this.totalSteps;
    }

}
