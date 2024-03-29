// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusteCellStatus extends TeaModel {
    // 部署单元所在集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 部署单元名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 联邦资源的分发状态，空字符串代表成功，否则为错误码
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 详细错误信息
    @NameInMap("message")
    public String message;

    public static ClusteCellStatus build(java.util.Map<String, ?> map) throws Exception {
        ClusteCellStatus self = new ClusteCellStatus();
        return TeaModel.build(map, self);
    }

    public ClusteCellStatus setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ClusteCellStatus setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ClusteCellStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClusteCellStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
