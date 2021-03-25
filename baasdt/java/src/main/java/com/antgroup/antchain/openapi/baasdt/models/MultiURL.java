// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class MultiURL extends TeaModel {
    // 上传的图片正常大小
    @NameInMap("normal")
    @Validation(required = true)
    public String normal;

    // style200
    @NameInMap("style_200")
    @Validation(required = true)
    public String style200;

    // style150
    @NameInMap("style_150")
    @Validation(required = true)
    public String style150;

    // style70
    @NameInMap("style_70")
    @Validation(required = true)
    public String style70;

    public static MultiURL build(java.util.Map<String, ?> map) throws Exception {
        MultiURL self = new MultiURL();
        return TeaModel.build(map, self);
    }

    public MultiURL setNormal(String normal) {
        this.normal = normal;
        return this;
    }
    public String getNormal() {
        return this.normal;
    }

    public MultiURL setStyle200(String style200) {
        this.style200 = style200;
        return this;
    }
    public String getStyle200() {
        return this.style200;
    }

    public MultiURL setStyle150(String style150) {
        this.style150 = style150;
        return this;
    }
    public String getStyle150() {
        return this.style150;
    }

    public MultiURL setStyle70(String style70) {
        this.style70 = style70;
        return this;
    }
    public String getStyle70() {
        return this.style70;
    }

}
