// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidAddDoc extends TeaModel {
    // did doc content
    /**
     * <strong>example:</strong>
     * <p>json string</p>
     */
    @NameInMap("doc")
    @Validation(required = true)
    public String doc;

    public static DidAddDoc build(java.util.Map<String, ?> map) throws Exception {
        DidAddDoc self = new DidAddDoc();
        return TeaModel.build(map, self);
    }

    public DidAddDoc setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

}
