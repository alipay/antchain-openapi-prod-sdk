// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainResouceType extends TeaModel {
    // type_id
    /**
     * <strong>example:</strong>
     * <p>type_id</p>
     */
    @NameInMap("type_id")
    public Long typeId;

    // cpu
    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    // memory
    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("memory")
    public Long memory;

    // disk
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("disk")
    public Long disk;

    public static ALiYunChainResouceType build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainResouceType self = new ALiYunChainResouceType();
        return TeaModel.build(map, self);
    }

    public ALiYunChainResouceType setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

    public ALiYunChainResouceType setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public ALiYunChainResouceType setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public ALiYunChainResouceType setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

}
