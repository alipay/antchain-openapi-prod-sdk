// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateBuildpackNativetechstackversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 技术栈类别
    @NameInMap("tech_stack")
    @Validation(required = true)
    public String techStack;

    // 云原生技术栈版本名称
    @NameInMap("tech_stack_version")
    @Validation(required = true)
    public String techStackVersion;

    // 基础镜像名称
    @NameInMap("from_image")
    @Validation(required = true)
    public String fromImage;

    // 版本描述信息
    @NameInMap("description")
    public String description;

    // 扩展指令列表
    @NameInMap("ext_commands")
    public java.util.List<String> extCommands;

    // 扩展属性 - 表现为Map<String,String>序列化后的字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    public static UpdateBuildpackNativetechstackversionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpackNativetechstackversionRequest self = new UpdateBuildpackNativetechstackversionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpackNativetechstackversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBuildpackNativetechstackversionRequest setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

    public UpdateBuildpackNativetechstackversionRequest setTechStackVersion(String techStackVersion) {
        this.techStackVersion = techStackVersion;
        return this;
    }
    public String getTechStackVersion() {
        return this.techStackVersion;
    }

    public UpdateBuildpackNativetechstackversionRequest setFromImage(String fromImage) {
        this.fromImage = fromImage;
        return this;
    }
    public String getFromImage() {
        return this.fromImage;
    }

    public UpdateBuildpackNativetechstackversionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBuildpackNativetechstackversionRequest setExtCommands(java.util.List<String> extCommands) {
        this.extCommands = extCommands;
        return this;
    }
    public java.util.List<String> getExtCommands() {
        return this.extCommands;
    }

    public UpdateBuildpackNativetechstackversionRequest setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

}
