// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class ProfileInfo extends TeaModel {
    // 数字人离画面位置坐标,可以为负数或者出画
    //  数字人在视频生成中的位置
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 数字人离画面位置坐标,可以为负数或者出画
    //  数字人在视频生成中的位置
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
    @NameInMap("w")
    @Validation(required = true)
    public Long w;

    // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
    @NameInMap("h")
    @Validation(required = true)
    public Long h;

    // 数字人视频大小缩放,实际大小为  scale*w   scale*h 
    @NameInMap("scale")
    public String scale;

    public static ProfileInfo build(java.util.Map<String, ?> map) throws Exception {
        ProfileInfo self = new ProfileInfo();
        return TeaModel.build(map, self);
    }

    public ProfileInfo setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public ProfileInfo setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

    public ProfileInfo setW(Long w) {
        this.w = w;
        return this;
    }
    public Long getW() {
        return this.w;
    }

    public ProfileInfo setH(Long h) {
        this.h = h;
        return this;
    }
    public Long getH() {
        return this.h;
    }

    public ProfileInfo setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

}
