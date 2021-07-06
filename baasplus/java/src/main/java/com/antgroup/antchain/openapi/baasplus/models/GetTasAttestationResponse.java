// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetTasAttestationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 精简后的时间戳完整编码（在校验时需要提交）
    @NameInMap("ctsr")
    public String ctsr;

    // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
    @NameInMap("sn")
    public String sn;

    // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
    @NameInMap("ts")
    public String ts;

    public static GetTasAttestationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTasAttestationResponse self = new GetTasAttestationResponse();
        return TeaModel.build(map, self);
    }

    public GetTasAttestationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTasAttestationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTasAttestationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTasAttestationResponse setCtsr(String ctsr) {
        this.ctsr = ctsr;
        return this;
    }
    public String getCtsr() {
        return this.ctsr;
    }

    public GetTasAttestationResponse setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public GetTasAttestationResponse setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
