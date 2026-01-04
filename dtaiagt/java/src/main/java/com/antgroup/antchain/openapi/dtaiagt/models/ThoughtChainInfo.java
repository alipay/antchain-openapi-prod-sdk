// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ThoughtChainInfo extends TeaModel {
    // 思维链id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // "success" | "error" | "loading" | "abort" | "done"
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 内容
    /**
     * <strong>example:</strong>
     * <p>内容</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<ThoughtChainContent> content;

    public static ThoughtChainInfo build(java.util.Map<String, ?> map) throws Exception {
        ThoughtChainInfo self = new ThoughtChainInfo();
        return TeaModel.build(map, self);
    }

    public ThoughtChainInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ThoughtChainInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ThoughtChainInfo setContent(java.util.List<ThoughtChainContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ThoughtChainContent> getContent() {
        return this.content;
    }

}
