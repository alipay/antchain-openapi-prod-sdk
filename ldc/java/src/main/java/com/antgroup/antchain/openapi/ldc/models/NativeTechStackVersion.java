// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NativeTechStackVersion extends TeaModel {
    // 版本描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 用户扩展的自定义Dockerfile指令
    @NameInMap("extend_commands")
    @Validation(required = true)
    public java.util.List<String> extendCommands;

    // 版本扩展信息，e.g 公共环境变量
    @NameInMap("extend_properties")
    @Validation(required = true)
    public String extendProperties;

    // 基础镜像存放地址
    @NameInMap("from_image")
    @Validation(required = true)
    public String fromImage;

    // 唯一标识ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 可见范围：全局可见|租户内可见
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 所属技术栈
    @NameInMap("tech_stack")
    @Validation(required = true)
    public String techStack;

    // 所属技术栈标识id
    @NameInMap("tech_stack_id")
    @Validation(required = true)
    public String techStackId;

    // 技术栈版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 创建时间（UTC）
    @NameInMap("utc_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreated;

    // 最近修改时间（UTC）
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static NativeTechStackVersion build(java.util.Map<String, ?> map) throws Exception {
        NativeTechStackVersion self = new NativeTechStackVersion();
        return TeaModel.build(map, self);
    }

    public NativeTechStackVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NativeTechStackVersion setExtendCommands(java.util.List<String> extendCommands) {
        this.extendCommands = extendCommands;
        return this;
    }
    public java.util.List<String> getExtendCommands() {
        return this.extendCommands;
    }

    public NativeTechStackVersion setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public NativeTechStackVersion setFromImage(String fromImage) {
        this.fromImage = fromImage;
        return this;
    }
    public String getFromImage() {
        return this.fromImage;
    }

    public NativeTechStackVersion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public NativeTechStackVersion setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public NativeTechStackVersion setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

    public NativeTechStackVersion setTechStackId(String techStackId) {
        this.techStackId = techStackId;
        return this;
    }
    public String getTechStackId() {
        return this.techStackId;
    }

    public NativeTechStackVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public NativeTechStackVersion setUtcCreated(String utcCreated) {
        this.utcCreated = utcCreated;
        return this;
    }
    public String getUtcCreated() {
        return this.utcCreated;
    }

    public NativeTechStackVersion setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
