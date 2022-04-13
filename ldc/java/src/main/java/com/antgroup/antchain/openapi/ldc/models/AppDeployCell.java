// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppDeployCell extends TeaModel {
    // 单元名字
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 执行到当前cell的pod总数
    @NameInMap("partition")
    @Validation(required = true)
    public Long partition;

    // 当前分组发布的pod数
    @NameInMap("release_count")
    @Validation(required = true)
    public Long releaseCount;

    // 当前cell发布的pod列表
    @NameInMap("pod_list")
    @Validation(required = true)
    public java.util.List<PodDetailInfo> podList;

    public static AppDeployCell build(java.util.Map<String, ?> map) throws Exception {
        AppDeployCell self = new AppDeployCell();
        return TeaModel.build(map, self);
    }

    public AppDeployCell setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public AppDeployCell setPartition(Long partition) {
        this.partition = partition;
        return this;
    }
    public Long getPartition() {
        return this.partition;
    }

    public AppDeployCell setReleaseCount(Long releaseCount) {
        this.releaseCount = releaseCount;
        return this;
    }
    public Long getReleaseCount() {
        return this.releaseCount;
    }

    public AppDeployCell setPodList(java.util.List<PodDetailInfo> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<PodDetailInfo> getPodList() {
        return this.podList;
    }

}
