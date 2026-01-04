// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class FileReq extends TeaModel {
    // 导入文件地址
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>文件名称</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件类型，不设置使用全局类型
    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件标签列表（用于AI参考）
    @NameInMap("tag_list")
    public java.util.List<String> tagList;

    public static FileReq build(java.util.Map<String, ?> map) throws Exception {
        FileReq self = new FileReq();
        return TeaModel.build(map, self);
    }

    public FileReq setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FileReq setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileReq setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public FileReq setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

}
