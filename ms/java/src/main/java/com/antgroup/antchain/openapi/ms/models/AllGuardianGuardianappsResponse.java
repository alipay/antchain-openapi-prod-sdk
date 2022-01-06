// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AllGuardianGuardianappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监控app列表
    @NameInMap("guardian_apps")
    public java.util.List<GuardianApp> guardianApps;

    public static AllGuardianGuardianappsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllGuardianGuardianappsResponse self = new AllGuardianGuardianappsResponse();
        return TeaModel.build(map, self);
    }

    public AllGuardianGuardianappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllGuardianGuardianappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllGuardianGuardianappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllGuardianGuardianappsResponse setGuardianApps(java.util.List<GuardianApp> guardianApps) {
        this.guardianApps = guardianApps;
        return this;
    }
    public java.util.List<GuardianApp> getGuardianApps() {
        return this.guardianApps;
    }

}
