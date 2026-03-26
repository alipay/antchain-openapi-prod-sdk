// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdCustomerUv extends TeaModel {
    // uv指数数量
    /**
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // uv指数数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // uv指数排序
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sort")
    @Validation(required = true)
    public Long sort;

    public static GdCustomerUv build(java.util.Map<String, ?> map) throws Exception {
        GdCustomerUv self = new GdCustomerUv();
        return TeaModel.build(map, self);
    }

    public GdCustomerUv setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GdCustomerUv setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GdCustomerUv setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

}
