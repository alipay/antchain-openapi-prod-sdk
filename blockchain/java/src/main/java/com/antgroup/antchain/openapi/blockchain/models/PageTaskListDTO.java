// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PageTaskListDTO extends TeaModel {
    // 任务列表集合
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<TaskListInfoDTO> content;

    // 总记录条目
    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("total_elements")
    @Validation(required = true)
    public Long totalElements;

    // 记录总页数
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total_pages")
    @Validation(required = true)
    public Long totalPages;

    // 页码
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    // 每页记录条目
    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 每页元素个数
    @NameInMap("number_of_elements")
    @Validation(required = true)
    public Long numberOfElements;

    public static PageTaskListDTO build(java.util.Map<String, ?> map) throws Exception {
        PageTaskListDTO self = new PageTaskListDTO();
        return TeaModel.build(map, self);
    }

    public PageTaskListDTO setContent(java.util.List<TaskListInfoDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<TaskListInfoDTO> getContent() {
        return this.content;
    }

    public PageTaskListDTO setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public PageTaskListDTO setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public PageTaskListDTO setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public PageTaskListDTO setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public PageTaskListDTO setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

}
