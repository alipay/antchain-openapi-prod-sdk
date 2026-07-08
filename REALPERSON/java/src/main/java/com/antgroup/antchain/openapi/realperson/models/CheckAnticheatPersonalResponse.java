// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckAnticheatPersonalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险等级
    @NameInMap("risk_level")
    public String riskLevel;

    // 风险等级文字描述
    @NameInMap("risk_level_desc")
    public String riskLevelDesc;

    // 扩展信息
    @NameInMap("extern_info")
    public String externInfo;

    public static CheckAnticheatPersonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAnticheatPersonalResponse self = new CheckAnticheatPersonalResponse();
        return TeaModel.build(map, self);
    }

    public CheckAnticheatPersonalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAnticheatPersonalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAnticheatPersonalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAnticheatPersonalResponse setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public CheckAnticheatPersonalResponse setRiskLevelDesc(String riskLevelDesc) {
        this.riskLevelDesc = riskLevelDesc;
        return this;
    }
    public String getRiskLevelDesc() {
        return this.riskLevelDesc;
    }

    public CheckAnticheatPersonalResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
