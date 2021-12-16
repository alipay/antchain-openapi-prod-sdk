// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreSpecResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 规格列表
    @NameInMap("specs")
    public java.util.List<SpecVO> specs;

    public static ListCommercialcoreSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreSpecResponse self = new ListCommercialcoreSpecResponse();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreSpecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCommercialcoreSpecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCommercialcoreSpecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCommercialcoreSpecResponse setSpecs(java.util.List<SpecVO> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<SpecVO> getSpecs() {
        return this.specs;
    }

}
