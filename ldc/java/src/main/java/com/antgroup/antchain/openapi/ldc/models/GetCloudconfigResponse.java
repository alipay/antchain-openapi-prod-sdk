// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetCloudconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // cluod_config raw txt
    @NameInMap("cloud_config")
    public String cloudConfig;

    public static GetCloudconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudconfigResponse self = new GetCloudconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCloudconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCloudconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCloudconfigResponse setCloudConfig(String cloudConfig) {
        this.cloudConfig = cloudConfig;
        return this;
    }
    public String getCloudConfig() {
        return this.cloudConfig;
    }

}
