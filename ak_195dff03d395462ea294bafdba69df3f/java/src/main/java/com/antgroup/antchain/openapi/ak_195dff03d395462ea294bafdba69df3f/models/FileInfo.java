// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>asasd.jpg</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件key
    /**
     * <strong>example:</strong>
     * <p>adadqweqw12sads1</p>
     */
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileInfo setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
