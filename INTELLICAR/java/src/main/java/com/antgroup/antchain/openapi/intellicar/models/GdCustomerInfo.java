// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdCustomerInfo extends TeaModel {
    // 时间范围（查询年度数据时，返回该字段）
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("time_range")
    public String timeRange;

    // 数据总数
    /**
     * <strong>example:</strong>
     * <p>638</p>
     */
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 当前展示页
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 数据总页数
    /**
     * <strong>example:</strong>
     * <p>638</p>
     */
    @NameInMap("pages")
    @Validation(required = true)
    public Long pages;

    // 每页显示数据条数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 数据集合
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<GdCustomersRecord> records;

    public static GdCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
        GdCustomerInfo self = new GdCustomerInfo();
        return TeaModel.build(map, self);
    }

    public GdCustomerInfo setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public GdCustomerInfo setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GdCustomerInfo setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GdCustomerInfo setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public GdCustomerInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GdCustomerInfo setRecords(java.util.List<GdCustomersRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GdCustomersRecord> getRecords() {
        return this.records;
    }

}
