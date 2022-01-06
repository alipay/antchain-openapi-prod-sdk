// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetGuardianGuardianappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监控app实例
    @NameInMap("guardian_app")
    public GuardianApp guardianApp;

    public static GetGuardianGuardianappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGuardianGuardianappsResponse self = new GetGuardianGuardianappsResponse();
        return TeaModel.build(map, self);
    }

    public GetGuardianGuardianappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetGuardianGuardianappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGuardianGuardianappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetGuardianGuardianappsResponse setGuardianApp(GuardianApp guardianApp) {
        this.guardianApp = guardianApp;
        return this;
    }
    public GuardianApp getGuardianApp() {
        return this.guardianApp;
    }

}
