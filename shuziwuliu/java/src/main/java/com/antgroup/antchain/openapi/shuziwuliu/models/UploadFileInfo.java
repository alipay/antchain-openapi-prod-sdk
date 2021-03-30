// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadFileInfo extends TeaModel {
    // 文件id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件hash
    @NameInMap("file_hash")
    @Validation(required = true)
    public String fileHash;

    public static UploadFileInfo build(java.util.Map<String, ?> map) throws Exception {
        UploadFileInfo self = new UploadFileInfo();
        return TeaModel.build(map, self);
    }

    public UploadFileInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadFileInfo setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

}
