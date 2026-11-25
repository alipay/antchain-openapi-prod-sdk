// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DetailAntchainDasKyaServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务稳定 ID
    @NameInMap("service_id")
    public String serviceId;

    // 服务展示名称
    @NameInMap("name")
    public String name;

    // 服务类型：AGENT、MCP、SKILL、CLI、API
    @NameInMap("type")
    public String type;

    // 服务能力与适用范围
    @NameInMap("description")
    public String description;

    // 服务发布状态：ACTIVE 或 INACTIVE
    @NameInMap("status")
    public String status;

    // aap协议模版id列表
    @NameInMap("aap_resource_ids")
    public java.util.List<String> aapResourceIds;

    public static DetailAntchainDasKyaServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAntchainDasKyaServiceResponse self = new DetailAntchainDasKyaServiceResponse();
        return TeaModel.build(map, self);
    }

    public DetailAntchainDasKyaServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAntchainDasKyaServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAntchainDasKyaServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAntchainDasKyaServiceResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DetailAntchainDasKyaServiceResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailAntchainDasKyaServiceResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetailAntchainDasKyaServiceResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailAntchainDasKyaServiceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailAntchainDasKyaServiceResponse setAapResourceIds(java.util.List<String> aapResourceIds) {
        this.aapResourceIds = aapResourceIds;
        return this;
    }
    public java.util.List<String> getAapResourceIds() {
        return this.aapResourceIds;
    }

}
