// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PageReq extends TeaModel {
    // 页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("num")
    @Validation(required = true)
    public Long num;

    // 页大小
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static PageReq build(java.util.Map<String, ?> map) throws Exception {
        PageReq self = new PageReq();
        return TeaModel.build(map, self);
    }

    public PageReq setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public PageReq setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
