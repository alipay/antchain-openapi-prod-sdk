// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidZkpverifiableclaimVisibilityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 索引字段，标示哪些字段是原始值，哪些字段是hash值
    @NameInMap("index")
    public String index;

    // 被隐藏了部分内容的VC内容
    @NameInMap("vc_view")
    public String vcView;

    public static StartDidZkpverifiableclaimVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDidZkpverifiableclaimVisibilityResponse self = new StartDidZkpverifiableclaimVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public StartDidZkpverifiableclaimVisibilityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDidZkpverifiableclaimVisibilityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDidZkpverifiableclaimVisibilityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDidZkpverifiableclaimVisibilityResponse setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public StartDidZkpverifiableclaimVisibilityResponse setVcView(String vcView) {
        this.vcView = vcView;
        return this;
    }
    public String getVcView() {
        return this.vcView;
    }

}
