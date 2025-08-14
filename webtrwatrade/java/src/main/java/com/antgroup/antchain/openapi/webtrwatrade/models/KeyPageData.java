// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class KeyPageData extends TeaModel {
    // 总记录
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 总页数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 当前页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 密钥列表
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<KeyVO> records;

    public static KeyPageData build(java.util.Map<String, ?> map) throws Exception {
        KeyPageData self = new KeyPageData();
        return TeaModel.build(map, self);
    }

    public KeyPageData setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public KeyPageData setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public KeyPageData setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public KeyPageData setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public KeyPageData setRecords(java.util.List<KeyVO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<KeyVO> getRecords() {
        return this.records;
    }

}
