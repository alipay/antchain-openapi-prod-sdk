// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdPotentialCustomerInfo extends TeaModel {
    // 时间范围（查询月度或年度数据时，返回该字段）
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("time_range")
    public String timeRange;

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
    public java.util.List<GdPotentialCustomerRecord> records;

    public static GdPotentialCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
        GdPotentialCustomerInfo self = new GdPotentialCustomerInfo();
        return TeaModel.build(map, self);
    }

    public GdPotentialCustomerInfo setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public GdPotentialCustomerInfo setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GdPotentialCustomerInfo setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GdPotentialCustomerInfo setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public GdPotentialCustomerInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GdPotentialCustomerInfo setRecords(java.util.List<GdPotentialCustomerRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GdPotentialCustomerRecord> getRecords() {
        return this.records;
    }

}
