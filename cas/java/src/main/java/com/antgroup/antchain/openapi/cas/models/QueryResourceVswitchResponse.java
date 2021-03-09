// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceVswitchResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 列表条目数
    @NameInMap("total_count")
    public Long totalCount;

    // 交换机的详细信息
    @NameInMap("v_switches")
    public java.util.List<VSwitch> vSwitches;

    public static QueryResourceVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceVswitchResponse self = new QueryResourceVswitchResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceVswitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceVswitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceVswitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceVswitchResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryResourceVswitchResponse setVSwitches(java.util.List<VSwitch> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<VSwitch> getVSwitches() {
        return this.vSwitches;
    }

}
