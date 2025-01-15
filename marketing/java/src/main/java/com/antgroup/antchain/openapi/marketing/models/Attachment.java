// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class Attachment extends TeaModel {
    // 文件唯一标识，作为幂等字段
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件名称，用作展示
    @NameInMap("filename")
    public String filename;

    // 访问地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static Attachment build(java.util.Map<String, ?> map) throws Exception {
        Attachment self = new Attachment();
        return TeaModel.build(map, self);
    }

    public Attachment setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public Attachment setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public Attachment setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
