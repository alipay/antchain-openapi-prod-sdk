// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityWithproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 能力列表
    @NameInMap("ability_info_list")
    public java.util.List<AbilityInfo> abilityInfoList;

    public static QueryAntchainSaasAbilityWithproductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityWithproductResponse self = new QueryAntchainSaasAbilityWithproductResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityWithproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainSaasAbilityWithproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainSaasAbilityWithproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainSaasAbilityWithproductResponse setAbilityInfoList(java.util.List<AbilityInfo> abilityInfoList) {
        this.abilityInfoList = abilityInfoList;
        return this;
    }
    public java.util.List<AbilityInfo> getAbilityInfoList() {
        return this.abilityInfoList;
    }

}
