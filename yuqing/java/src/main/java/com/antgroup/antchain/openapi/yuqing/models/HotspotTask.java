// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class HotspotTask extends TeaModel {
    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 当前页
    @NameInMap("page_now")
    @Validation(required = true)
    public Long pageNow;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 数据
    @NameInMap("pages")
    @Validation(required = true)
    public java.util.List<HotspotMessage> pages;

    public static HotspotTask build(java.util.Map<String, ?> map) throws Exception {
        HotspotTask self = new HotspotTask();
        return TeaModel.build(map, self);
    }

    public HotspotTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public HotspotTask setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public HotspotTask setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public HotspotTask setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public HotspotTask setPages(java.util.List<HotspotMessage> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<HotspotMessage> getPages() {
        return this.pages;
    }

}
