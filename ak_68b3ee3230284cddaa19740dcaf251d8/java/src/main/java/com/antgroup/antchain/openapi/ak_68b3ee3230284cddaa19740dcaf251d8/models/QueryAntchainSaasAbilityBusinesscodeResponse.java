// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityBusinesscodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 能力信息
    @NameInMap("ability_info")
    public AbilityInfo abilityInfo;

    public static QueryAntchainSaasAbilityBusinesscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityBusinesscodeResponse self = new QueryAntchainSaasAbilityBusinesscodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityBusinesscodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainSaasAbilityBusinesscodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainSaasAbilityBusinesscodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainSaasAbilityBusinesscodeResponse setAbilityInfo(AbilityInfo abilityInfo) {
        this.abilityInfo = abilityInfo;
        return this;
    }
    public AbilityInfo getAbilityInfo() {
        return this.abilityInfo;
    }

}
