// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidDetail extends TeaModel {
    // 控制者的did描述符
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("controller")
    @Validation(required = true)
    public String controller;

    // did描述符
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxxx</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // did doc
    /**
     * <strong>example:</strong>
     * <p>json字段</p>
     */
    @NameInMap("did_doc")
    @Validation(required = true)
    public String didDoc;

    public static DidDetail build(java.util.Map<String, ?> map) throws Exception {
        DidDetail self = new DidDetail();
        return TeaModel.build(map, self);
    }

    public DidDetail setController(String controller) {
        this.controller = controller;
        return this;
    }
    public String getController() {
        return this.controller;
    }

    public DidDetail setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DidDetail setDidDoc(String didDoc) {
        this.didDoc = didDoc;
        return this;
    }
    public String getDidDoc() {
        return this.didDoc;
    }

}
