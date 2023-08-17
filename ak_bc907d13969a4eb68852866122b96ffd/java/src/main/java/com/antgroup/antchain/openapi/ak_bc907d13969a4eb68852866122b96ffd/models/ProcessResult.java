// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class ProcessResult extends TeaModel {
    // Node
    @NameInMap("node")
    public String node;

    // totalitem
    @NameInMap("totalitem")
    public Long totalitem;

    // finisheditem
    @NameInMap("finisheditem")
    public Long finisheditem;

    // TotalSubTask
    @NameInMap("totalsubtask")
    public Long totalsubtask;

    // FinishedSubTask
    @NameInMap("finishedsubtask")
    public Long finishedsubtask;

    public static ProcessResult build(java.util.Map<String, ?> map) throws Exception {
        ProcessResult self = new ProcessResult();
        return TeaModel.build(map, self);
    }

    public ProcessResult setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public ProcessResult setTotalitem(Long totalitem) {
        this.totalitem = totalitem;
        return this;
    }
    public Long getTotalitem() {
        return this.totalitem;
    }

    public ProcessResult setFinisheditem(Long finisheditem) {
        this.finisheditem = finisheditem;
        return this;
    }
    public Long getFinisheditem() {
        return this.finisheditem;
    }

    public ProcessResult setTotalsubtask(Long totalsubtask) {
        this.totalsubtask = totalsubtask;
        return this;
    }
    public Long getTotalsubtask() {
        return this.totalsubtask;
    }

    public ProcessResult setFinishedsubtask(Long finishedsubtask) {
        this.finishedsubtask = finishedsubtask;
        return this;
    }
    public Long getFinishedsubtask() {
        return this.finishedsubtask;
    }

}
