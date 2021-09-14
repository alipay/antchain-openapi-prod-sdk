// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class CreateDasDatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据源 biz_uuid
    @NameInMap("biz_uuid")
    public String bizUuid;

    public static CreateDasDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDasDatasourceResponse self = new CreateDasDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDasDatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDasDatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDasDatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDasDatasourceResponse setBizUuid(String bizUuid) {
        this.bizUuid = bizUuid;
        return this;
    }
    public String getBizUuid() {
        return this.bizUuid;
    }

}
