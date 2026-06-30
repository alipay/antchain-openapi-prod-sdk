// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class Paginator extends TeaModel {
    // 当前页
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 单页项数
    @NameInMap("items_per_page")
    @Validation(required = true)
    public Long itemsPerPage;

    // 总项数
    @NameInMap("items")
    @Validation(required = true)
    public Long items;

    public static Paginator build(java.util.Map<String, ?> map) throws Exception {
        Paginator self = new Paginator();
        return TeaModel.build(map, self);
    }

    public Paginator setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public Paginator setItemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }
    public Long getItemsPerPage() {
        return this.itemsPerPage;
    }

    public Paginator setItems(Long items) {
        this.items = items;
        return this;
    }
    public Long getItems() {
        return this.items;
    }

}
