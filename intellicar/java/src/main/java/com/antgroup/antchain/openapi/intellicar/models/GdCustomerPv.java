// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdCustomerPv extends TeaModel {
    // 重叠指数pv历史指数数量（时间类型为季度、半年、年时，不展示）
    /**
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 重叠指数pv指数数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 重叠指数pv指数排序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sort")
    @Validation(required = true)
    public Long sort;

    public static GdCustomerPv build(java.util.Map<String, ?> map) throws Exception {
        GdCustomerPv self = new GdCustomerPv();
        return TeaModel.build(map, self);
    }

    public GdCustomerPv setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GdCustomerPv setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GdCustomerPv setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

}
