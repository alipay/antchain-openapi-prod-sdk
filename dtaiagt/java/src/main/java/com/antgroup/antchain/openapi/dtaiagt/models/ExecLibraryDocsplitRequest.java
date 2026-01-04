// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ExecLibraryDocsplitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    // 使用的切分器名称
    @NameInMap("splitter")
    @Validation(required = true)
    public String splitter;

    // 切片类型
    @NameInMap("section_type")
    @Validation(required = true)
    public String sectionType;

    // 切分字数（智能分片/按规则分片）
    @NameInMap("chunk_size")
    @Validation(required = true)
    public Long chunkSize;

    // 块之间的最大重叠字符数（智能分片）
    @NameInMap("chunk_overlap")
    @Validation(required = true)
    public Long chunkOverlap;

    // 最小标题级别，0为全部拍平（智能分片）
    @NameInMap("min_leve")
    public Long minLeve;

    // 自定义切分规则正则表达式（按规则分片）
    @NameInMap("regex")
    @Validation(required = true)
    public String regex;

    // 任务名称
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 文件信息列表
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<FileReq> files;

    public static ExecLibraryDocsplitRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLibraryDocsplitRequest self = new ExecLibraryDocsplitRequest();
        return TeaModel.build(map, self);
    }

    public ExecLibraryDocsplitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecLibraryDocsplitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecLibraryDocsplitRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public ExecLibraryDocsplitRequest setSplitter(String splitter) {
        this.splitter = splitter;
        return this;
    }
    public String getSplitter() {
        return this.splitter;
    }

    public ExecLibraryDocsplitRequest setSectionType(String sectionType) {
        this.sectionType = sectionType;
        return this;
    }
    public String getSectionType() {
        return this.sectionType;
    }

    public ExecLibraryDocsplitRequest setChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Long getChunkSize() {
        return this.chunkSize;
    }

    public ExecLibraryDocsplitRequest setChunkOverlap(Long chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Long getChunkOverlap() {
        return this.chunkOverlap;
    }

    public ExecLibraryDocsplitRequest setMinLeve(Long minLeve) {
        this.minLeve = minLeve;
        return this;
    }
    public Long getMinLeve() {
        return this.minLeve;
    }

    public ExecLibraryDocsplitRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public ExecLibraryDocsplitRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ExecLibraryDocsplitRequest setFiles(java.util.List<FileReq> files) {
        this.files = files;
        return this;
    }
    public java.util.List<FileReq> getFiles() {
        return this.files;
    }

}
