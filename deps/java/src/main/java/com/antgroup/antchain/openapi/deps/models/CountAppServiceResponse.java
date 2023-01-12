// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountAppServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用服务计数
    @NameInMap("data")
    public AppServiceCount data;

    public static CountAppServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CountAppServiceResponse self = new CountAppServiceResponse();
        return TeaModel.build(map, self);
    }

    public CountAppServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountAppServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountAppServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountAppServiceResponse setData(AppServiceCount data) {
        this.data = data;
        return this;
    }
    public AppServiceCount getData() {
        return this.data;
    }

}
