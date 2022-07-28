// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDirectmonitorTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提交类型，FILE/URL
    // 
    @NameInMap("submit_type")
    @Validation(required = true)
    public String submitType;

    // submitType 是FILE就传 oss fileId，是URL就传url地址
    @NameInMap("submit_content")
    @Validation(required = true)
    public String submitContent;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件类别 IMAGE/TEXT/VIDEO/AUDIO
    // 
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
    @NameInMap("detail_file_type")
    @Validation(required = true)
    public String detailFileType;

    // 定向监测任务名称
    @NameInMap("task_name")
    public String taskName;

    // 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    public String clientToken;

    public static CreateDirectmonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectmonitorTaskRequest self = new CreateDirectmonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDirectmonitorTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDirectmonitorTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDirectmonitorTaskRequest setSubmitType(String submitType) {
        this.submitType = submitType;
        return this;
    }
    public String getSubmitType() {
        return this.submitType;
    }

    public CreateDirectmonitorTaskRequest setSubmitContent(String submitContent) {
        this.submitContent = submitContent;
        return this;
    }
    public String getSubmitContent() {
        return this.submitContent;
    }

    public CreateDirectmonitorTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateDirectmonitorTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateDirectmonitorTaskRequest setDetailFileType(String detailFileType) {
        this.detailFileType = detailFileType;
        return this;
    }
    public String getDetailFileType() {
        return this.detailFileType;
    }

    public CreateDirectmonitorTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateDirectmonitorTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
