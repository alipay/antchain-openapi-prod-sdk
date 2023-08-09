// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryAbilityWithapinameResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // api与能力信息关联列表
    @NameInMap("ability_api_relation_list")
    public java.util.List<AbilityApiRelation> abilityApiRelationList;

    public static QueryAbilityWithapinameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAbilityWithapinameResponse self = new QueryAbilityWithapinameResponse();
        return TeaModel.build(map, self);
    }

    public QueryAbilityWithapinameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAbilityWithapinameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAbilityWithapinameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAbilityWithapinameResponse setAbilityApiRelationList(java.util.List<AbilityApiRelation> abilityApiRelationList) {
        this.abilityApiRelationList = abilityApiRelationList;
        return this;
    }
    public java.util.List<AbilityApiRelation> getAbilityApiRelationList() {
        return this.abilityApiRelationList;
    }

}
