// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAshieldHardeningtaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的具体对象，具体含义见下表。
    @NameInMap("res_data")
    public HardeningTaskResponse resData;

    public static SubmitAshieldHardeningtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAshieldHardeningtaskResponse self = new SubmitAshieldHardeningtaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAshieldHardeningtaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAshieldHardeningtaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAshieldHardeningtaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAshieldHardeningtaskResponse setResData(HardeningTaskResponse resData) {
        this.resData = resData;
        return this;
    }
    public HardeningTaskResponse getResData() {
        return this.resData;
    }

}
