// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class OcrLocation extends TeaModel {
    // 表示定位位置的长方形左上顶点的垂直坐标
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("top")
    public String top;

    // 表示定位位置的长方形左上顶点的水平坐标
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("left")
    public String left;

    // 表示定位位置的长方形的宽度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("width")
    public String width;

    // 表示定位位置的长方形的高度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("height")
    public String height;

    public static OcrLocation build(java.util.Map<String, ?> map) throws Exception {
        OcrLocation self = new OcrLocation();
        return TeaModel.build(map, self);
    }

    public OcrLocation setTop(String top) {
        this.top = top;
        return this;
    }
    public String getTop() {
        return this.top;
    }

    public OcrLocation setLeft(String left) {
        this.left = left;
        return this;
    }
    public String getLeft() {
        return this.left;
    }

    public OcrLocation setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public OcrLocation setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

}
