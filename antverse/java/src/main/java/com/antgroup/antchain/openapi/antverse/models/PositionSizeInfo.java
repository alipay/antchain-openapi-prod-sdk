// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class PositionSizeInfo extends TeaModel {
    // 数字人x轴（竖轴）坐标
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 数字人y轴（横轴）坐标
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    // 数字人宽度
    // 
    @NameInMap("width")
    @Validation(required = true)
    public Long width;

    // 数字人高度
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    public static PositionSizeInfo build(java.util.Map<String, ?> map) throws Exception {
        PositionSizeInfo self = new PositionSizeInfo();
        return TeaModel.build(map, self);
    }

    public PositionSizeInfo setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public PositionSizeInfo setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

    public PositionSizeInfo setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public PositionSizeInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
