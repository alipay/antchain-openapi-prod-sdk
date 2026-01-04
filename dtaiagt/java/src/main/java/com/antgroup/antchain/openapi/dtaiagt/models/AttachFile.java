// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AttachFile extends TeaModel {
    // 文件Id
    // 
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件名称
    // 
    /**
     * <strong>example:</strong>
     * <p>文件名称</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件类型
    // 
    /**
     * <strong>example:</strong>
     * <p>txt</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件来源
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("file_source")
    @Validation(required = true)
    public String fileSource;

    // 文件链接
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;http://...&quot; </p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 文件总结
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;文件摘要&quot; </p>
     */
    @NameInMap("file_summary")
    @Validation(required = true)
    public String fileSummary;

    // 上传时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("operate_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String operateTime;

    // Map<String, String>	扩展信息
    // 
    /**
     * <strong>example:</strong>
     * <p>{} </p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 文件大小
    // 
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("file_size")
    @Validation(required = true)
    public String fileSize;

    // 内容库 dbId, 用于检索
    // 
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    public static AttachFile build(java.util.Map<String, ?> map) throws Exception {
        AttachFile self = new AttachFile();
        return TeaModel.build(map, self);
    }

    public AttachFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AttachFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AttachFile setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public AttachFile setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public AttachFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AttachFile setFileSummary(String fileSummary) {
        this.fileSummary = fileSummary;
        return this;
    }
    public String getFileSummary() {
        return this.fileSummary;
    }

    public AttachFile setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public AttachFile setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public AttachFile setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public AttachFile setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

}
