// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_e94e2404d4b449ba90e0886673004f6b.models;

import com.aliyun.tea.*;

public class QueryAntcloudTapchainprodDataproducttemplateApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 接口模板编码，用于标识接口参数模板
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 请求参数，json参数，根据不同模板入参数定义。
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryAntcloudTapchainprodDataproducttemplateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudTapchainprodDataproducttemplateApiRequest self = new QueryAntcloudTapchainprodDataproducttemplateApiRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
