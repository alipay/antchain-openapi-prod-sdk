// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ScmSofaArchetype extends TeaModel {
    // 用户创建archetype必须要的参数
    @NameInMap("generate_code")
    public Boolean generateCode;

    // Maven代码框架使用 groupId
    @NameInMap("group_id")
    public String groupId;

    // Maven代码框架使用 artifactId
    @NameInMap("artifact_id")
    @Validation(required = true)
    public String artifactId;

    // Maven代码框架使用 codePackage
    @NameInMap("code_package")
    public String codePackage;

    // Sofa代码框架使用 projectType
    @NameInMap("project_type")
    public String projectType;

    // Sofa代码框架使用 版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // Sofa代码框架使用 编码方式
    @NameInMap("encoding")
    public String encoding;

    // 是否使用私有maven
    @NameInMap("use_private_repo")
    public Boolean usePrivateRepo;

    // 提供给快速研发平台使用，格式为JSON字符串
    @NameInMap("meta_data")
    public String metaData;

    public static ScmSofaArchetype build(java.util.Map<String, ?> map) throws Exception {
        ScmSofaArchetype self = new ScmSofaArchetype();
        return TeaModel.build(map, self);
    }

    public ScmSofaArchetype setGenerateCode(Boolean generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public Boolean getGenerateCode() {
        return this.generateCode;
    }

    public ScmSofaArchetype setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ScmSofaArchetype setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ScmSofaArchetype setCodePackage(String codePackage) {
        this.codePackage = codePackage;
        return this;
    }
    public String getCodePackage() {
        return this.codePackage;
    }

    public ScmSofaArchetype setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public ScmSofaArchetype setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ScmSofaArchetype setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public ScmSofaArchetype setUsePrivateRepo(Boolean usePrivateRepo) {
        this.usePrivateRepo = usePrivateRepo;
        return this;
    }
    public Boolean getUsePrivateRepo() {
        return this.usePrivateRepo;
    }

    public ScmSofaArchetype setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

}
