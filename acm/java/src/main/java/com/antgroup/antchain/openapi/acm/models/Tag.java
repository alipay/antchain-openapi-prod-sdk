// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    // 标签类型
    @NameInMap("tag_type")
    @Validation(required = true)
    public String tagType;

    // 标签值
    @NameInMap("tag_value")
    @Validation(required = true)
    public String tagValue;

    public static Tag build(java.util.Map<String, ?> map) throws Exception {
        Tag self = new Tag();
        return TeaModel.build(map, self);
    }

    public Tag setTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }
    public String getTagType() {
        return this.tagType;
    }

    public Tag setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
