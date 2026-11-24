// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class CommercialImage extends TeaModel {
    // 图片url
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("pic_url")
    public String picUrl;

    // 图片index
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("pic_index")
    public String picIndex;

    public static CommercialImage build(java.util.Map<String, ?> map) throws Exception {
        CommercialImage self = new CommercialImage();
        return TeaModel.build(map, self);
    }

    public CommercialImage setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public CommercialImage setPicIndex(String picIndex) {
        this.picIndex = picIndex;
        return this;
    }
    public String getPicIndex() {
        return this.picIndex;
    }

}
