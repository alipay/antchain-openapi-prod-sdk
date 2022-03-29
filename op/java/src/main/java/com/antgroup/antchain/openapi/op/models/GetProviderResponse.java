// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class GetProviderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // API前缀
    @NameInMap("api_name_prefix")
    public String apiNamePrefix;

    // 描述
    @NameInMap("description")
    public String description;

    // 是否在开发者中心展示
    @NameInMap("developer_center_display")
    public Boolean developerCenterDisplay;

    // Proivder名称，等同于产品码
    @NameInMap("name")
    public String name;

    // 产品别名
    @NameInMap("name_alias")
    public String nameAlias;

    // 组织机构
    @NameInMap("organization")
    public String organization;

    // 产品类型
    @NameInMap("provider_type")
    public String providerType;

    // 产品状态
    @NameInMap("status")
    public String status;

    // 产品简介
    @NameInMap("summary")
    public String summary;

    public static GetProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProviderResponse self = new GetProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetProviderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetProviderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetProviderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetProviderResponse setApiNamePrefix(String apiNamePrefix) {
        this.apiNamePrefix = apiNamePrefix;
        return this;
    }
    public String getApiNamePrefix() {
        return this.apiNamePrefix;
    }

    public GetProviderResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetProviderResponse setDeveloperCenterDisplay(Boolean developerCenterDisplay) {
        this.developerCenterDisplay = developerCenterDisplay;
        return this;
    }
    public Boolean getDeveloperCenterDisplay() {
        return this.developerCenterDisplay;
    }

    public GetProviderResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProviderResponse setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
        return this;
    }
    public String getNameAlias() {
        return this.nameAlias;
    }

    public GetProviderResponse setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public GetProviderResponse setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public GetProviderResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetProviderResponse setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
