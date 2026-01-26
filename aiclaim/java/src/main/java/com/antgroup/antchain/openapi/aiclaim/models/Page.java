// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class Page extends TeaModel {
    // 边界框坐标[x1,y1,x2,y2]
    /**
     * <strong>example:</strong>
     * <p>[0,0,999,999]</p>
     */
    @NameInMap("bbox")
    public java.util.List<Long> bbox;

    // 图片文件名
    /**
     * <strong>example:</strong>
     * <p>检验报告.jpg</p>
     */
    @NameInMap("image")
    public String image;

    // 页面索引
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("page_index")
    public Long pageIndex;

    public static Page build(java.util.Map<String, ?> map) throws Exception {
        Page self = new Page();
        return TeaModel.build(map, self);
    }

    public Page setBbox(java.util.List<Long> bbox) {
        this.bbox = bbox;
        return this;
    }
    public java.util.List<Long> getBbox() {
        return this.bbox;
    }

    public Page setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Page setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

}
