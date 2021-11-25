// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class FileDefine extends TeaModel {
    // 调用方设定，保证文件唯一性。
    // 
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件大小
    @NameInMap("size")
    public Long size;

    // 文件key
    @NameInMap("osskey")
    @Validation(required = true)
    public String osskey;

    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 预览链接
    @NameInMap("url")
    public String url;

    public static FileDefine build(java.util.Map<String, ?> map) throws Exception {
        FileDefine self = new FileDefine();
        return TeaModel.build(map, self);
    }

    public FileDefine setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FileDefine setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileDefine setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public FileDefine setOsskey(String osskey) {
        this.osskey = osskey;
        return this;
    }
    public String getOsskey() {
        return this.osskey;
    }

    public FileDefine setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FileDefine setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
