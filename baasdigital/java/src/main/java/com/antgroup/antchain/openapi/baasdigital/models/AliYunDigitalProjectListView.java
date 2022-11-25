// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class AliYunDigitalProjectListView extends TeaModel {
    // 分页编号
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页行数
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总行数
    @NameInMap("total_size")
    public Long totalSize;

    // 查询结果列表
    @NameInMap("project_list")
    public java.util.List<DigitalProjectList> projectList;

    public static AliYunDigitalProjectListView build(java.util.Map<String, ?> map) throws Exception {
        AliYunDigitalProjectListView self = new AliYunDigitalProjectListView();
        return TeaModel.build(map, self);
    }

    public AliYunDigitalProjectListView setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public AliYunDigitalProjectListView setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AliYunDigitalProjectListView setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public AliYunDigitalProjectListView setProjectList(java.util.List<DigitalProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<DigitalProjectList> getProjectList() {
        return this.projectList;
    }

}
