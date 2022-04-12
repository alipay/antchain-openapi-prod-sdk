// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class UploadRequestArray extends TeaModel {
    // 文件数据
    @NameInMap("upload_array")
    @Validation(required = true)
    public UploadRequest uploadArray;

    public static UploadRequestArray build(java.util.Map<String, ?> map) throws Exception {
        UploadRequestArray self = new UploadRequestArray();
        return TeaModel.build(map, self);
    }

    public UploadRequestArray setUploadArray(UploadRequest uploadArray) {
        this.uploadArray = uploadArray;
        return this;
    }
    public UploadRequest getUploadArray() {
        return this.uploadArray;
    }

}
