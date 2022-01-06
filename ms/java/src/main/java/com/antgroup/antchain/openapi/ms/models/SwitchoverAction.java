// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SwitchoverAction extends TeaModel {
    // 目标单元
    @NameInMap("dest_cell")
    public String destCell;

    // 来源单元
    @NameInMap("source_cell")
    public String sourceCell;

    public static SwitchoverAction build(java.util.Map<String, ?> map) throws Exception {
        SwitchoverAction self = new SwitchoverAction();
        return TeaModel.build(map, self);
    }

    public SwitchoverAction setDestCell(String destCell) {
        this.destCell = destCell;
        return this;
    }
    public String getDestCell() {
        return this.destCell;
    }

    public SwitchoverAction setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

}
