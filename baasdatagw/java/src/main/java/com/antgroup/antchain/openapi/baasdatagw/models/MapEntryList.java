// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class MapEntryList extends TeaModel {
    // MapEntry列表
    @NameInMap("element")
    public java.util.List<MapEntry> element;

    public static MapEntryList build(java.util.Map<String, ?> map) throws Exception {
        MapEntryList self = new MapEntryList();
        return TeaModel.build(map, self);
    }

    public MapEntryList setElement(java.util.List<MapEntry> element) {
        this.element = element;
        return this;
    }
    public java.util.List<MapEntry> getElement() {
        return this.element;
    }

}
