// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppExtraInfo extends TeaModel {
    // ID
    @NameInMap("id")
    public String id;

    // 名称
    @NameInMap("name")
    public String name;

    // 值
    @NameInMap("value")
    public String value;

    // 描述
    @NameInMap("description")
    public String description;

    // 模板ID
    @NameInMap("template_id")
    public String templateId;

    // 模板类型
    @NameInMap("type")
    public String type;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 最近修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // 应用扩展信息ID
    @NameInMap("app_extrainfo_id")
    public String appExtrainfoId;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 模板数据ID
    @NameInMap("template_data_id")
    public String templateDataId;

    public static AppExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        AppExtraInfo self = new AppExtraInfo();
        return TeaModel.build(map, self);
    }

    public AppExtraInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppExtraInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppExtraInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AppExtraInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppExtraInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AppExtraInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AppExtraInfo setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppExtraInfo setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public AppExtraInfo setAppExtrainfoId(String appExtrainfoId) {
        this.appExtrainfoId = appExtrainfoId;
        return this;
    }
    public String getAppExtrainfoId() {
        return this.appExtrainfoId;
    }

    public AppExtraInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppExtraInfo setTemplateDataId(String templateDataId) {
        this.templateDataId = templateDataId;
        return this;
    }
    public String getTemplateDataId() {
        return this.templateDataId;
    }

}
