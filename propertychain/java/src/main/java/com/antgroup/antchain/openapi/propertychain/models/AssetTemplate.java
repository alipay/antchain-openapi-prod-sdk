// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AssetTemplate extends TeaModel {
    // 模板类型id
    @NameInMap("category_id")
    public String categoryId;

    // 模板内容
    @NameInMap("content")
    public String content;

    // 模板id
    @NameInMap("template_id")
    public String templateId;

    // 模板名称
    @NameInMap("template_name")
    public String templateName;

    // 是否生效
    @NameInMap("valid")
    public Boolean valid;

    // 是否使用
    @NameInMap("used")
    public Boolean used;

    // 版本号
    @NameInMap("version")
    public String version;

    // 联盟Id
    @NameInMap("league_uid")
    public String leagueUid;

    // 标准数据字典
    @NameInMap("standard")
    public Boolean standard;

    public static AssetTemplate build(java.util.Map<String, ?> map) throws Exception {
        AssetTemplate self = new AssetTemplate();
        return TeaModel.build(map, self);
    }

    public AssetTemplate setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AssetTemplate setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AssetTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AssetTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AssetTemplate setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public AssetTemplate setUsed(Boolean used) {
        this.used = used;
        return this;
    }
    public Boolean getUsed() {
        return this.used;
    }

    public AssetTemplate setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AssetTemplate setLeagueUid(String leagueUid) {
        this.leagueUid = leagueUid;
        return this;
    }
    public String getLeagueUid() {
        return this.leagueUid;
    }

    public AssetTemplate setStandard(Boolean standard) {
        this.standard = standard;
        return this;
    }
    public Boolean getStandard() {
        return this.standard;
    }

}
