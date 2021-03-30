// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class FlowNode extends TeaModel {
    // 序号
    @NameInMap("index")
    public Long index;

    // 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
    //  
    //    
    //     
    @NameInMap("type")
    public String type;

    // 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
    @NameInMap("state")
    public String state;

    // 操作时间，单位：ms
    @NameInMap("operate_time")
    public Long operateTime;

    // 备注
    @NameInMap("comment")
    public String comment;

    public static FlowNode build(java.util.Map<String, ?> map) throws Exception {
        FlowNode self = new FlowNode();
        return TeaModel.build(map, self);
    }

    public FlowNode setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public FlowNode setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FlowNode setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public FlowNode setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public FlowNode setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
