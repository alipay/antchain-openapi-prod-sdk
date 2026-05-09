// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class RuleItem extends TeaModel {
    // 分账方Id
    /**
     * <strong>example:</strong>
     * <p>ea596f28-4ece-406d-a9e1-86fa83cc505f</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 分账份额，总份额100，保留2位小数
    /**
     * <strong>example:</strong>
     * <p>23.36</p>
     */
    @NameInMap("proportion")
    @Validation(required = true)
    public String proportion;

    public static RuleItem build(java.util.Map<String, ?> map) throws Exception {
        RuleItem self = new RuleItem();
        return TeaModel.build(map, self);
    }

    public RuleItem setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RuleItem setProportion(String proportion) {
        this.proportion = proportion;
        return this;
    }
    public String getProportion() {
        return this.proportion;
    }

}
