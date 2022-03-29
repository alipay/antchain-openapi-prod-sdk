// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SaveSchema extends TeaModel {
    // capacity
    @NameInMap("capacity")
    @Validation(required = true)
    public Long capacity;

    // reserved
    @NameInMap("reserved")
    @Validation(required = true)
    public String reserved;

    // max_key_size
    @NameInMap("max_key_size")
    @Validation(required = true)
    public Long maxKeySize;

    public static SaveSchema build(java.util.Map<String, ?> map) throws Exception {
        SaveSchema self = new SaveSchema();
        return TeaModel.build(map, self);
    }

    public SaveSchema setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public SaveSchema setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public SaveSchema setMaxKeySize(Long maxKeySize) {
        this.maxKeySize = maxKeySize;
        return this;
    }
    public Long getMaxKeySize() {
        return this.maxKeySize;
    }

}
