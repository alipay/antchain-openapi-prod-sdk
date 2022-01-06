// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class PublishDataItem extends TeaModel {
    // 推送目标 cell
    @NameInMap("cell")
    public String cell;

    // 推送值
    @NameInMap("data")
    public String data;

    public static PublishDataItem build(java.util.Map<String, ?> map) throws Exception {
        PublishDataItem self = new PublishDataItem();
        return TeaModel.build(map, self);
    }

    public PublishDataItem setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public PublishDataItem setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
