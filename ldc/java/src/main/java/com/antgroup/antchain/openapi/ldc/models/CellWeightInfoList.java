// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellWeightInfoList extends TeaModel {
    // weight info list.
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<CellWeightInfo> data;

    public static CellWeightInfoList build(java.util.Map<String, ?> map) throws Exception {
        CellWeightInfoList self = new CellWeightInfoList();
        return TeaModel.build(map, self);
    }

    public CellWeightInfoList setData(java.util.List<CellWeightInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CellWeightInfo> getData() {
        return this.data;
    }

}
