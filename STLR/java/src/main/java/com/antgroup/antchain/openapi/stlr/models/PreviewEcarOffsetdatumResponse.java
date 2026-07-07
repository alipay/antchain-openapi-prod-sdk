// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PreviewEcarOffsetdatumResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 注册会员总数
    @NameInMap("register_member_total")
    public Long registerMemberTotal;

    // 碳总能量值
    @NameInMap("carbon_energy_total")
    public String carbonEnergyTotal;

    public static PreviewEcarOffsetdatumResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewEcarOffsetdatumResponse self = new PreviewEcarOffsetdatumResponse();
        return TeaModel.build(map, self);
    }

    public PreviewEcarOffsetdatumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PreviewEcarOffsetdatumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PreviewEcarOffsetdatumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PreviewEcarOffsetdatumResponse setRegisterMemberTotal(Long registerMemberTotal) {
        this.registerMemberTotal = registerMemberTotal;
        return this;
    }
    public Long getRegisterMemberTotal() {
        return this.registerMemberTotal;
    }

    public PreviewEcarOffsetdatumResponse setCarbonEnergyTotal(String carbonEnergyTotal) {
        this.carbonEnergyTotal = carbonEnergyTotal;
        return this;
    }
    public String getCarbonEnergyTotal() {
        return this.carbonEnergyTotal;
    }

}
