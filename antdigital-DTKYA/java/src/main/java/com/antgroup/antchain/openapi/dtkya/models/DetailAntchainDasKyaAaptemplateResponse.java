// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DetailAntchainDasKyaAaptemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模板资源 ID
    @NameInMap("resource_id")
    public String resourceId;

    // 模板名称
    @NameInMap("name")
    public String name;

    // 展示给用户的授权事项
    @NameInMap("description")
    public String description;

    // 用户需要确认的授权字段
    @NameInMap("fields")
    public java.util.List<AapAuthorizationField> fields;

    public static DetailAntchainDasKyaAaptemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAntchainDasKyaAaptemplateResponse self = new DetailAntchainDasKyaAaptemplateResponse();
        return TeaModel.build(map, self);
    }

    public DetailAntchainDasKyaAaptemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAntchainDasKyaAaptemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAntchainDasKyaAaptemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAntchainDasKyaAaptemplateResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetailAntchainDasKyaAaptemplateResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailAntchainDasKyaAaptemplateResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailAntchainDasKyaAaptemplateResponse setFields(java.util.List<AapAuthorizationField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<AapAuthorizationField> getFields() {
        return this.fields;
    }

}
