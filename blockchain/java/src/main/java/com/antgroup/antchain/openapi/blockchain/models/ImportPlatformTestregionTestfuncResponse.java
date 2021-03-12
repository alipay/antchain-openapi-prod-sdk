// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ImportPlatformTestregionTestfuncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 123
    @NameInMap("test_response")
    public String testResponse;

    public static ImportPlatformTestregionTestfuncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportPlatformTestregionTestfuncResponse self = new ImportPlatformTestregionTestfuncResponse();
        return TeaModel.build(map, self);
    }

    public ImportPlatformTestregionTestfuncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportPlatformTestregionTestfuncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportPlatformTestregionTestfuncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportPlatformTestregionTestfuncResponse setTestResponse(String testResponse) {
        this.testResponse = testResponse;
        return this;
    }
    public String getTestResponse() {
        return this.testResponse;
    }

}
