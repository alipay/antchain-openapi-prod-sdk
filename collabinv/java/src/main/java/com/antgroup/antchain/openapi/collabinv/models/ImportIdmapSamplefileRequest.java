// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ImportIdmapSamplefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // oss文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 项目ID
    @NameInMap("project_info_id")
    @Validation(required = true)
    public String projectInfoId;

    // 查询列
    @NameInMap("param_type")
    @Validation(required = true)
    public String paramType;

    // 结果列
    @NameInMap("result_type")
    @Validation(required = true)
    public String resultType;

    // 样本Code
    @NameInMap("sample_code")
    @Validation(required = true)
    public String sampleCode;

    // 样本任务Code
    @NameInMap("sample_task_code")
    @Validation(required = true)
    public String sampleTaskCode;

    // oss文件路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 数据源code
    @NameInMap("data_source")
    @Validation(required = true)
    public String dataSource;

    // 结果加密方式
    @NameInMap("encryption_method")
    @Validation(required = true)
    public String encryptionMethod;

    public static ImportIdmapSamplefileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIdmapSamplefileRequest self = new ImportIdmapSamplefileRequest();
        return TeaModel.build(map, self);
    }

    public ImportIdmapSamplefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIdmapSamplefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIdmapSamplefileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportIdmapSamplefileRequest setProjectInfoId(String projectInfoId) {
        this.projectInfoId = projectInfoId;
        return this;
    }
    public String getProjectInfoId() {
        return this.projectInfoId;
    }

    public ImportIdmapSamplefileRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ImportIdmapSamplefileRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public ImportIdmapSamplefileRequest setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
        return this;
    }
    public String getSampleCode() {
        return this.sampleCode;
    }

    public ImportIdmapSamplefileRequest setSampleTaskCode(String sampleTaskCode) {
        this.sampleTaskCode = sampleTaskCode;
        return this;
    }
    public String getSampleTaskCode() {
        return this.sampleTaskCode;
    }

    public ImportIdmapSamplefileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ImportIdmapSamplefileRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public ImportIdmapSamplefileRequest setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }
    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

}
