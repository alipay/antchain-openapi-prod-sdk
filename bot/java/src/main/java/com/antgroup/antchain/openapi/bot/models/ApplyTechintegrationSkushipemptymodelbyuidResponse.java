// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyTechintegrationSkushipemptymodelbyuidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 证书信息
    @NameInMap("cert")
    public String cert;

    // Id2信息
    @NameInMap("id2")
    public String id2;

    public static ApplyTechintegrationSkushipemptymodelbyuidResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTechintegrationSkushipemptymodelbyuidResponse self = new ApplyTechintegrationSkushipemptymodelbyuidResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTechintegrationSkushipemptymodelbyuidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidResponse setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidResponse setId2(String id2) {
        this.id2 = id2;
        return this;
    }
    public String getId2() {
        return this.id2;
    }

}
