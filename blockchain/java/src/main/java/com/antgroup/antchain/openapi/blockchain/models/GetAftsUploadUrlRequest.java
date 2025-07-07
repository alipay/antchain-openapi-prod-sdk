// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAftsUploadUrlRequest extends TeaModel {
    // 问件类型
    /**
     * <strong>example:</strong>
     * <p>csv</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static GetAftsUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAftsUploadUrlRequest self = new GetAftsUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAftsUploadUrlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
