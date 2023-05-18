// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class PagequeryAntchainSaasAbilityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 当前页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total")
    public Long total;

    // 能力信息列表
    @NameInMap("ability_info_list")
    public java.util.List<AbilityInfo> abilityInfoList;

    public static PagequeryAntchainSaasAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainSaasAbilityResponse self = new PagequeryAntchainSaasAbilityResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainSaasAbilityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAntchainSaasAbilityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAntchainSaasAbilityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAntchainSaasAbilityResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryAntchainSaasAbilityResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntchainSaasAbilityResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryAntchainSaasAbilityResponse setAbilityInfoList(java.util.List<AbilityInfo> abilityInfoList) {
        this.abilityInfoList = abilityInfoList;
        return this;
    }
    public java.util.List<AbilityInfo> getAbilityInfoList() {
        return this.abilityInfoList;
    }

}
