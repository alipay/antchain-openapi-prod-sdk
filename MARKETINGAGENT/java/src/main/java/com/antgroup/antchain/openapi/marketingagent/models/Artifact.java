// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    // The content of the artifact. Must contain at least one part.
    @NameInMap("parts")
    public java.util.List<Part> parts;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setParts(java.util.List<Part> parts) {
        this.parts = parts;
        return this;
    }
    public java.util.List<Part> getParts() {
        return this.parts;
    }

}
