// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeRightprotecttemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 维权要素模板名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 维权要素模板业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 维权措施，枚举值，包括：
    // ARBITRATION，仲裁
    // ARBITRATION_EXECUTION，仲裁执行
    // MEDIATION，调解
    @NameInMap("right_protect_type")
    @Validation(required = true)
    public String rightProtectType;

    // 要素模板关联的案件要素模板ID，要素模板和案件模板必须属于同一个业务类型才可以关联
    @NameInMap("case_template_id")
    @Validation(required = true)
    public String caseTemplateId;

    // 维权要素模板文件下载地址，文件为excel格式，包含维权要素的所有算法信息、字段信息和文件附件信息
    @NameInMap("template_file_url")
    @Validation(required = true)
    public String templateFileUrl;

    public static CreateJusticeRightprotecttemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeRightprotecttemplateRequest self = new CreateJusticeRightprotecttemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeRightprotecttemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeRightprotecttemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeRightprotecttemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJusticeRightprotecttemplateRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateJusticeRightprotecttemplateRequest setRightProtectType(String rightProtectType) {
        this.rightProtectType = rightProtectType;
        return this;
    }
    public String getRightProtectType() {
        return this.rightProtectType;
    }

    public CreateJusticeRightprotecttemplateRequest setCaseTemplateId(String caseTemplateId) {
        this.caseTemplateId = caseTemplateId;
        return this;
    }
    public String getCaseTemplateId() {
        return this.caseTemplateId;
    }

    public CreateJusticeRightprotecttemplateRequest setTemplateFileUrl(String templateFileUrl) {
        this.templateFileUrl = templateFileUrl;
        return this;
    }
    public String getTemplateFileUrl() {
        return this.templateFileUrl;
    }

}
