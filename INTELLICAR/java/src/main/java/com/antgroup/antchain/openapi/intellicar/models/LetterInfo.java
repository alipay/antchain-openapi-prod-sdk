// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class LetterInfo extends TeaModel {
    // name
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static LetterInfo build(java.util.Map<String, ?> map) throws Exception {
        LetterInfo self = new LetterInfo();
        return TeaModel.build(map, self);
    }

    public LetterInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LetterInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
