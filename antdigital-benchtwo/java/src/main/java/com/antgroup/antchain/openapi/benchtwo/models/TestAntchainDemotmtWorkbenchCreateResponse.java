// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwo.models;

import com.aliyun.tea.*;

public class TestAntchainDemotmtWorkbenchCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("stauts")
    public String stauts;

    // 描述
    @NameInMap("msg")
    public String msg;

    public static TestAntchainDemotmtWorkbenchCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAntchainDemotmtWorkbenchCreateResponse self = new TestAntchainDemotmtWorkbenchCreateResponse();
        return TeaModel.build(map, self);
    }

    public TestAntchainDemotmtWorkbenchCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TestAntchainDemotmtWorkbenchCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TestAntchainDemotmtWorkbenchCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TestAntchainDemotmtWorkbenchCreateResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

    public TestAntchainDemotmtWorkbenchCreateResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
