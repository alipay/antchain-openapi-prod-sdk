// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateProjectFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编号 
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 文件id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件业务id
    @NameInMap("file_biz_id")
    public String fileBizId;

    // 文件编号
    @NameInMap("file_code")
    public String fileCode;

    // 文件名称
    @NameInMap("file_name")
    public String fileName;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 扩展字段
    @NameInMap("extra_data")
    public String extraData;

    // 数据时间戳
    @NameInMap("data_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dataTimestamp;

    public static CreateProjectFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectFileRequest self = new CreateProjectFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProjectFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProjectFileRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateProjectFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateProjectFileRequest setFileBizId(String fileBizId) {
        this.fileBizId = fileBizId;
        return this;
    }
    public String getFileBizId() {
        return this.fileBizId;
    }

    public CreateProjectFileRequest setFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }
    public String getFileCode() {
        return this.fileCode;
    }

    public CreateProjectFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateProjectFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateProjectFileRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public CreateProjectFileRequest setDataTimestamp(String dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
        return this;
    }
    public String getDataTimestamp() {
        return this.dataTimestamp;
    }

}
