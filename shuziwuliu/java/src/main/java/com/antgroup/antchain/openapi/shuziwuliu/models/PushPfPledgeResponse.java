// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushPfPledgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 质押标识，用于账单质押推送状态查询
    @NameInMap("pledge_id")
    public String pledgeId;

    // 已提交  COMMIT
    // 推送中 PUSHING
    // 推送成功 PUSH_SUC
    // 推送失败 PUSH_FAIL
    @NameInMap("status")
    public String status;

    // 描述
    @NameInMap("desc")
    public String desc;

    public static PushPfPledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        PushPfPledgeResponse self = new PushPfPledgeResponse();
        return TeaModel.build(map, self);
    }

    public PushPfPledgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushPfPledgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushPfPledgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushPfPledgeResponse setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
        return this;
    }
    public String getPledgeId() {
        return this.pledgeId;
    }

    public PushPfPledgeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushPfPledgeResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
