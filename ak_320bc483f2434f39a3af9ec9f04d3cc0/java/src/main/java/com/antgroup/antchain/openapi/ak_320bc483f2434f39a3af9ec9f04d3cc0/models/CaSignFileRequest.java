// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignFileRequest extends TeaModel {
    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static CaSignFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSignFileRequest self = new CaSignFileRequest();
        return TeaModel.build(map, self);
    }

    public CaSignFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CaSignFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
