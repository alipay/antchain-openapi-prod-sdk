// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class FolderPath extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // v
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static FolderPath build(java.util.Map<String, ?> map) throws Exception {
        FolderPath self = new FolderPath();
        return TeaModel.build(map, self);
    }

    public FolderPath setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public FolderPath setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FolderPath setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
