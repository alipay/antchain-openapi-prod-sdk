// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2d01ff274c3448c2b919937512c80f91.models;

import com.aliyun.tea.*;

public class GetDemoDogAgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 年龄
    @NameInMap("age")
    public Long age;

    public static GetDemoDogAgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDemoDogAgeResponse self = new GetDemoDogAgeResponse();
        return TeaModel.build(map, self);
    }

    public GetDemoDogAgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDemoDogAgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDemoDogAgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDemoDogAgeResponse setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
