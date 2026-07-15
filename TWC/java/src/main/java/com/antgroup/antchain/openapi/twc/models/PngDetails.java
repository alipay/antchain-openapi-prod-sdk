// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PngDetails extends TeaModel {
    // 明细唯一id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 图片 osskey
    /**
     * <strong>example:</strong>
     * <p>ESIGN/ato/ca_png/ORG/111.png</p>
     */
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    public static PngDetails build(java.util.Map<String, ?> map) throws Exception {
        PngDetails self = new PngDetails();
        return TeaModel.build(map, self);
    }

    public PngDetails setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PngDetails setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
