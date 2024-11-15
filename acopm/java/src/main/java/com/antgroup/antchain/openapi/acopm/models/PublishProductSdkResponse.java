// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class PublishProductSdkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // maven sdk依赖信息
    @NameInMap("sdk_maven_dependency_info")
    public SdkMavenDependencyInfo sdkMavenDependencyInfo;

    public static PublishProductSdkResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishProductSdkResponse self = new PublishProductSdkResponse();
        return TeaModel.build(map, self);
    }

    public PublishProductSdkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PublishProductSdkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PublishProductSdkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PublishProductSdkResponse setSdkMavenDependencyInfo(SdkMavenDependencyInfo sdkMavenDependencyInfo) {
        this.sdkMavenDependencyInfo = sdkMavenDependencyInfo;
        return this;
    }
    public SdkMavenDependencyInfo getSdkMavenDependencyInfo() {
        return this.sdkMavenDependencyInfo;
    }

}
