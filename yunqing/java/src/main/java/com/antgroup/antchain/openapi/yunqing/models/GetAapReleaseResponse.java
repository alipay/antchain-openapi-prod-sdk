// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetAapReleaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单状态:
    //     TOBE_DEPLOY("TOBE_DEPLOY","待执行","待执行"),
    //     EXECUTING("EXECUTING","执行中","执行中"),
    //     SUCCESS("SUCCESS","完成","完成"),
    //     CANCELED("CANCELED","已取消","已取消"),
    //     FAILED("FAILED","失败","失败"),
    //     WAITING_CONFIRM("WAITING_CONFIRM","待确认","待确认");
    @NameInMap("status")
    public String status;

    public static GetAapReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAapReleaseResponse self = new GetAapReleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetAapReleaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAapReleaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAapReleaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAapReleaseResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
