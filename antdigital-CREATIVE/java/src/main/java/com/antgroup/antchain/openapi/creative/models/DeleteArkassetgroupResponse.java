// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class DeleteArkassetgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // {"ResponseMetadata":{"RequestId":"20240514213000D4E5F6789ABCDEF012","Action":"DeleteAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{}}
    @NameInMap("response_body")
    public String responseBody;

    public static DeleteArkassetgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteArkassetgroupResponse self = new DeleteArkassetgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteArkassetgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteArkassetgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteArkassetgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteArkassetgroupResponse setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }
    public String getResponseBody() {
        return this.responseBody;
    }

}
