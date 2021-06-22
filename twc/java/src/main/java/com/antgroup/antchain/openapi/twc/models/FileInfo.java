// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    // 文件key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public FileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
