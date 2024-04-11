// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class Paster extends TeaModel {
    //  贴片元素离画面位置x坐标
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    //  贴片元素离画面位置y坐标
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    //  贴片元素 url,支持 gif png jpg等图片格式
    @NameInMap("src_url")
    @Validation(required = true)
    public String srcUrl;

    // 贴片元素缩放比例
    @NameInMap("scale")
    @Validation(required = true)
    public String scale;

    public static Paster build(java.util.Map<String, ?> map) throws Exception {
        Paster self = new Paster();
        return TeaModel.build(map, self);
    }

    public Paster setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public Paster setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

    public Paster setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public Paster setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

}
