// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessDocs extends TeaModel {
    // 文档摘要值
    @NameInMap("doc_hash")
    @Validation(required = true)
    public String docHash;

    // 第三方文档id
    @NameInMap("third_doc_id")
    @Validation(required = true)
    public String thirdDocId;

    public static WitnessDocs build(java.util.Map<String, ?> map) throws Exception {
        WitnessDocs self = new WitnessDocs();
        return TeaModel.build(map, self);
    }

    public WitnessDocs setDocHash(String docHash) {
        this.docHash = docHash;
        return this;
    }
    public String getDocHash() {
        return this.docHash;
    }

    public WitnessDocs setThirdDocId(String thirdDocId) {
        this.thirdDocId = thirdDocId;
        return this;
    }
    public String getThirdDocId() {
        return this.thirdDocId;
    }

}
