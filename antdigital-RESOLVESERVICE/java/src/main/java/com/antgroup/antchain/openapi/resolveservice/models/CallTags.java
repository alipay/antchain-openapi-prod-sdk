// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class CallTags extends TeaModel {
    // 一级标签
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("primary_tag")
    @Validation(required = true)
    public String primaryTag;

    // 二级标签
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("secondary_tag")
    @Validation(required = true)
    public String secondaryTag;

    public static CallTags build(java.util.Map<String, ?> map) throws Exception {
        CallTags self = new CallTags();
        return TeaModel.build(map, self);
    }

    public CallTags setPrimaryTag(String primaryTag) {
        this.primaryTag = primaryTag;
        return this;
    }
    public String getPrimaryTag() {
        return this.primaryTag;
    }

    public CallTags setSecondaryTag(String secondaryTag) {
        this.secondaryTag = secondaryTag;
        return this;
    }
    public String getSecondaryTag() {
        return this.secondaryTag;
    }

}
