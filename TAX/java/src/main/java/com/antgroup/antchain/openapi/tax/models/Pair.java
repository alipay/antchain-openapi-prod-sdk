// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Pair extends TeaModel {
    // left
    /**
     * <strong>example:</strong>
     * <p>left</p>
     */
    @NameInMap("left")
    @Validation(required = true)
    public String left;

    // right
    /**
     * <strong>example:</strong>
     * <p>right</p>
     */
    @NameInMap("right")
    @Validation(required = true)
    public Key right;

    public static Pair build(java.util.Map<String, ?> map) throws Exception {
        Pair self = new Pair();
        return TeaModel.build(map, self);
    }

    public Pair setLeft(String left) {
        this.left = left;
        return this;
    }
    public String getLeft() {
        return this.left;
    }

    public Pair setRight(Key right) {
        this.right = right;
        return this;
    }
    public Key getRight() {
        return this.right;
    }

}
