// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Block extends TeaModel {
    // 区块头
    @NameInMap("header")
    @Validation(required = true)
    public BlockHeader header;

    // 区块体
    @NameInMap("body")
    @Validation(required = true)
    public BlockBody body;

    public static Block build(java.util.Map<String, ?> map) throws Exception {
        Block self = new Block();
        return TeaModel.build(map, self);
    }

    public Block setHeader(BlockHeader header) {
        this.header = header;
        return this;
    }
    public BlockHeader getHeader() {
        return this.header;
    }

    public Block setBody(BlockBody body) {
        this.body = body;
        return this;
    }
    public BlockBody getBody() {
        return this.body;
    }

}
