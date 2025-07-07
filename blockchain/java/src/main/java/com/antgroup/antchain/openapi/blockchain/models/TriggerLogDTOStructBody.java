// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TriggerLogDTOStructBody extends TeaModel {
    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("modify_time")
    public String modifyTime;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("status")
    public String status;

    // uuid
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("uuid")
    public String uuid;

    // 位置
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("position")
    public PositionStructBody position;

    public static TriggerLogDTOStructBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerLogDTOStructBody self = new TriggerLogDTOStructBody();
        return TeaModel.build(map, self);
    }

    public TriggerLogDTOStructBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TriggerLogDTOStructBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public TriggerLogDTOStructBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TriggerLogDTOStructBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TriggerLogDTOStructBody setPosition(PositionStructBody position) {
        this.position = position;
        return this;
    }
    public PositionStructBody getPosition() {
        return this.position;
    }

}
