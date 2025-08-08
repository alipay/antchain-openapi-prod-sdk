// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadFileInfo extends TeaModel {
    // 文件id
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件hash
    /**
     * <strong>example:</strong>
     * <p>ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52</p>
     */
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
