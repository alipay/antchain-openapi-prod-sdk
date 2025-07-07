// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeriveDid extends TeaModel {
    // 派生的子did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("childdid")
    @Validation(required = true)
    public String childdid;

    // 子did 的did doc
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("childdiddoc")
    @Validation(required = true)
    public String childdiddoc;

    // 用户输入用于派生子did的派生码
    /**
     * <strong>example:</strong>
     * <p>asdfghj</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static DeriveDid build(java.util.Map<String, ?> map) throws Exception {
        DeriveDid self = new DeriveDid();
        return TeaModel.build(map, self);
    }

    public DeriveDid setChilddid(String childdid) {
        this.childdid = childdid;
        return this;
    }
    public String getChilddid() {
        return this.childdid;
    }

    public DeriveDid setChilddiddoc(String childdiddoc) {
        this.childdiddoc = childdiddoc;
        return this;
    }
    public String getChilddiddoc() {
        return this.childdiddoc;
    }

    public DeriveDid setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
