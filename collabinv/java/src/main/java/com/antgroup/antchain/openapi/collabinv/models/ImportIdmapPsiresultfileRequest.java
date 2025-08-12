// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ImportIdmapPsiresultfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 项目唯一标识
    @NameInMap("project_info_id")
    @Validation(required = true)
    public String projectInfoId;

    // 样本编码
    @NameInMap("sample_code")
    @Validation(required = true)
    public String sampleCode;

    // 样本任务编码
    @NameInMap("sample_task_code")
    @Validation(required = true)
    public String sampleTaskCode;

    // 数据源编码
    @NameInMap("data_source")
    @Validation(required = true)
    public String dataSource;

    public static ImportIdmapPsiresultfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIdmapPsiresultfileRequest self = new ImportIdmapPsiresultfileRequest();
        return TeaModel.build(map, self);
    }

    public ImportIdmapPsiresultfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIdmapPsiresultfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIdmapPsiresultfileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ImportIdmapPsiresultfileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportIdmapPsiresultfileRequest setProjectInfoId(String projectInfoId) {
        this.projectInfoId = projectInfoId;
        return this;
    }
    public String getProjectInfoId() {
        return this.projectInfoId;
    }

    public ImportIdmapPsiresultfileRequest setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
        return this;
    }
    public String getSampleCode() {
        return this.sampleCode;
    }

    public ImportIdmapPsiresultfileRequest setSampleTaskCode(String sampleTaskCode) {
        this.sampleTaskCode = sampleTaskCode;
        return this;
    }
    public String getSampleTaskCode() {
        return this.sampleTaskCode;
    }

    public ImportIdmapPsiresultfileRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

}
