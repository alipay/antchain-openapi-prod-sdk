// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UniqueDim extends TeaModel {
    // 列名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 左起第几个
    @NameInMap("left_index")
    @Validation(required = true)
    public Long leftIndex;

    // 左起字符串
    @NameInMap("left")
    public String left;

    // 右至字符串
    @NameInMap("right")
    public String right;

    // 列值翻译
    @NameInMap("translate")
    public Translate translate;

    public static UniqueDim build(java.util.Map<String, ?> map) throws Exception {
        UniqueDim self = new UniqueDim();
        return TeaModel.build(map, self);
    }

    public UniqueDim setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UniqueDim setLeftIndex(Long leftIndex) {
        this.leftIndex = leftIndex;
        return this;
    }
    public Long getLeftIndex() {
        return this.leftIndex;
    }

    public UniqueDim setLeft(String left) {
        this.left = left;
        return this;
    }
    public String getLeft() {
        return this.left;
    }

    public UniqueDim setRight(String right) {
        this.right = right;
        return this;
    }
    public String getRight() {
        return this.right;
    }

    public UniqueDim setTranslate(Translate translate) {
        this.translate = translate;
        return this;
    }
    public Translate getTranslate() {
        return this.translate;
    }

}
