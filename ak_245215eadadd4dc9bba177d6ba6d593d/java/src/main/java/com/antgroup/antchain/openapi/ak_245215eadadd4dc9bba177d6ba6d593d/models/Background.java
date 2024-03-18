// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class Background extends TeaModel {
    // 背景元素，支持 gif png jpg mp4等格式
    @NameInMap("src_url")
    @Validation(required = true)
    public String srcUrl;

    // 背景缩放比例
    @NameInMap("scale")
    @Validation(required = true)
    public Long scale;

    // 背景图片x坐标位置，距左侧
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 背景图片y坐标位置，距上侧
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    public static Background build(java.util.Map<String, ?> map) throws Exception {
        Background self = new Background();
        return TeaModel.build(map, self);
    }

    public Background setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public Background setScale(Long scale) {
        this.scale = scale;
        return this;
    }
    public Long getScale() {
        return this.scale;
    }

    public Background setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public Background setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

}
