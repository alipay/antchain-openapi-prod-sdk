// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeCasetemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件要素模板名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 模板业务类型名称
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 全流程存证模板ID列表，多个用“,”隔开
    @NameInMap("flow_templates")
    @Validation(required = true)
    public String flowTemplates;

    // 模板文件下载地址
    @NameInMap("template_file_url")
    @Validation(required = true)
    public String templateFileUrl;

    public static CreateJusticeCasetemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeCasetemplateRequest self = new CreateJusticeCasetemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeCasetemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeCasetemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeCasetemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJusticeCasetemplateRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateJusticeCasetemplateRequest setFlowTemplates(String flowTemplates) {
        this.flowTemplates = flowTemplates;
        return this;
    }
    public String getFlowTemplates() {
        return this.flowTemplates;
    }

    public CreateJusticeCasetemplateRequest setTemplateFileUrl(String templateFileUrl) {
        this.templateFileUrl = templateFileUrl;
        return this;
    }
    public String getTemplateFileUrl() {
        return this.templateFileUrl;
    }

}
