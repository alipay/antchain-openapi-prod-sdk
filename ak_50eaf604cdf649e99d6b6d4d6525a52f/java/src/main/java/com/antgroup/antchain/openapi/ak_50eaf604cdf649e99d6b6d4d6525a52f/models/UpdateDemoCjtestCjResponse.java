// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_50eaf604cdf649e99d6b6d4d6525a52f.models;

import com.aliyun.tea.*;

public class UpdateDemoCjtestCjResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 测试返回参数1
    @NameInMap("return1")
    public String return1;

    public static UpdateDemoCjtestCjResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDemoCjtestCjResponse self = new UpdateDemoCjtestCjResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDemoCjtestCjResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDemoCjtestCjResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDemoCjtestCjResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDemoCjtestCjResponse setReturn1(String return1) {
        this.return1 = return1;
        return this;
    }
    public String getReturn1() {
        return this.return1;
    }

}
