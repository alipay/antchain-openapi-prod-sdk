// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IdListView extends TeaModel {
    // 数据id
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public Long dataId;

    // 数据名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("data_name")
    @Validation(required = true)
    public String dataName;

    public static IdListView build(java.util.Map<String, ?> map) throws Exception {
        IdListView self = new IdListView();
        return TeaModel.build(map, self);
    }

    public IdListView setDataId(Long dataId) {
        this.dataId = dataId;
        return this;
    }
    public Long getDataId() {
        return this.dataId;
    }

    public IdListView setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

}
