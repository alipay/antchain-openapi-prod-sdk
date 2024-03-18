// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class AvatarProfileResult extends TeaModel {
    // 数字人形象数量
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 查询页面索引，不分页无
    @NameInMap("page_index")
    public Long pageIndex;

    // 数字人形象列表
    @NameInMap("item_list")
    @Validation(required = true)
    public AvatarProfile itemList;

    public static AvatarProfileResult build(java.util.Map<String, ?> map) throws Exception {
        AvatarProfileResult self = new AvatarProfileResult();
        return TeaModel.build(map, self);
    }

    public AvatarProfileResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public AvatarProfileResult setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public AvatarProfileResult setItemList(AvatarProfile itemList) {
        this.itemList = itemList;
        return this;
    }
    public AvatarProfile getItemList() {
        return this.itemList;
    }

}
