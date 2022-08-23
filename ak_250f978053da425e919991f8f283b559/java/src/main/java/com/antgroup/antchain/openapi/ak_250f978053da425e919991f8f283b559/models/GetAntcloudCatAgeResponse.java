// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_250f978053da425e919991f8f283b559.models;

import com.aliyun.tea.*;

public class GetAntcloudCatAgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 猫的年龄
    @NameInMap("age")
    public String age;

    public static GetAntcloudCatAgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntcloudCatAgeResponse self = new GetAntcloudCatAgeResponse();
        return TeaModel.build(map, self);
    }

    public GetAntcloudCatAgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntcloudCatAgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntcloudCatAgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntcloudCatAgeResponse setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
