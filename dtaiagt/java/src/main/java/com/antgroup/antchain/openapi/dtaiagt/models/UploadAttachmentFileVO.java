// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UploadAttachmentFileVO extends TeaModel {
    // 上传结果	
    // 
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("upload_status")
    @Validation(required = true)
    public String uploadStatus;

    // 文件URL
    /**
     * <strong>example:</strong>
     * <p>fileUrl</p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // file_id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>fileType</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件名
    /**
     * <strong>example:</strong>
     * <p>fileName</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 附件大小	
    // 
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 内容库 ID（用于检索）	
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 错误信息	
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;上传失败&quot; </p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static UploadAttachmentFileVO build(java.util.Map<String, ?> map) throws Exception {
        UploadAttachmentFileVO self = new UploadAttachmentFileVO();
        return TeaModel.build(map, self);
    }

    public UploadAttachmentFileVO setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
        return this;
    }
    public String getUploadStatus() {
        return this.uploadStatus;
    }

    public UploadAttachmentFileVO setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadAttachmentFileVO setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadAttachmentFileVO setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadAttachmentFileVO setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadAttachmentFileVO setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public UploadAttachmentFileVO setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public UploadAttachmentFileVO setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
