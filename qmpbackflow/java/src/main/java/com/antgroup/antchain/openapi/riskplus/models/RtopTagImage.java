// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopTagImage extends TeaModel {
    // 标签图片表主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 图片
    @NameInMap("image")
    public String image;

    public static RtopTagImage build(java.util.Map<String, ?> map) throws Exception {
        RtopTagImage self = new RtopTagImage();
        return TeaModel.build(map, self);
    }

    public RtopTagImage setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RtopTagImage setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
