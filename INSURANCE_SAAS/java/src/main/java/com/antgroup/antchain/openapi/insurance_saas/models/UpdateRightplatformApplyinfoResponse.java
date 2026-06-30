// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class UpdateRightplatformApplyinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请权益编号
    @NameInMap("right_apply_no")
    public String rightApplyNo;

    public static UpdateRightplatformApplyinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRightplatformApplyinfoResponse self = new UpdateRightplatformApplyinfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRightplatformApplyinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateRightplatformApplyinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRightplatformApplyinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateRightplatformApplyinfoResponse setRightApplyNo(String rightApplyNo) {
        this.rightApplyNo = rightApplyNo;
        return this;
    }
    public String getRightApplyNo() {
        return this.rightApplyNo;
    }

}
