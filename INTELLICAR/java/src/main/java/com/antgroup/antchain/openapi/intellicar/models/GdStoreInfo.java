// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdStoreInfo extends TeaModel {
    // 数据总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 当前展示页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 数据总页数
    @NameInMap("pages")
    @Validation(required = true)
    public Long pages;

    // 每页显示数据条数
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 数据集合
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<GdStoreRecord> records;

    public static GdStoreInfo build(java.util.Map<String, ?> map) throws Exception {
        GdStoreInfo self = new GdStoreInfo();
        return TeaModel.build(map, self);
    }

    public GdStoreInfo setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GdStoreInfo setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GdStoreInfo setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public GdStoreInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GdStoreInfo setRecords(java.util.List<GdStoreRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GdStoreRecord> getRecords() {
        return this.records;
    }

}
