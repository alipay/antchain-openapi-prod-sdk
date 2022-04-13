// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateBuildpackNativetechstackversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // ce4456_jdk8_tengine6
    @NameInMap("display_version")
    @Validation(required = true)
    public String displayVersion;

    // 版本描述
    @NameInMap("description")
    public String description;

    // 完整的镜像地址
    @NameInMap("from_image")
    @Validation(required = true)
    public String fromImage;

    // 所属技术栈大类
    @NameInMap("tech_stack")
    @Validation(required = true)
    public String techStack;

    // 技术栈大类对应的id，如不填写，后台默认根据名称校验所属技术栈大类
    @NameInMap("tech_stack_id")
    public String techStackId;

    // 指定该版本可见范围：
    // PUBLIC - 全站点各个租户都可见；
    // TENANT - 仅创建改版本对应的租户内可见
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 扩展的Dockerfile指令。
    // 用于在FromImage的基础上扩展Dockerfile指令
    @NameInMap("ext_commands")
    public java.util.List<String> extCommands;

    // 扩展属性 - 表现为Map<String,String>序列化后的字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    public static CreateBuildpackNativetechstackversionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackNativetechstackversionRequest self = new CreateBuildpackNativetechstackversionRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackNativetechstackversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBuildpackNativetechstackversionRequest setDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
        return this;
    }
    public String getDisplayVersion() {
        return this.displayVersion;
    }

    public CreateBuildpackNativetechstackversionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBuildpackNativetechstackversionRequest setFromImage(String fromImage) {
        this.fromImage = fromImage;
        return this;
    }
    public String getFromImage() {
        return this.fromImage;
    }

    public CreateBuildpackNativetechstackversionRequest setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

    public CreateBuildpackNativetechstackversionRequest setTechStackId(String techStackId) {
        this.techStackId = techStackId;
        return this;
    }
    public String getTechStackId() {
        return this.techStackId;
    }

    public CreateBuildpackNativetechstackversionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateBuildpackNativetechstackversionRequest setExtCommands(java.util.List<String> extCommands) {
        this.extCommands = extCommands;
        return this;
    }
    public java.util.List<String> getExtCommands() {
        return this.extCommands;
    }

    public CreateBuildpackNativetechstackversionRequest setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

}
