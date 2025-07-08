// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CctDataMap extends TeaModel {
    // text
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("text")
    public java.util.List<String> text;

    // PICTURE
    /**
     * <strong>example:</strong>
     * <p>PICTURE</p>
     */
    @NameInMap("picture")
    public java.util.List<String> picture;

    public static CctDataMap build(java.util.Map<String, ?> map) throws Exception {
        CctDataMap self = new CctDataMap();
        return TeaModel.build(map, self);
    }

    public CctDataMap setText(java.util.List<String> text) {
        this.text = text;
        return this;
    }
    public java.util.List<String> getText() {
        return this.text;
    }

    public CctDataMap setPicture(java.util.List<String> picture) {
        this.picture = picture;
        return this;
    }
    public java.util.List<String> getPicture() {
        return this.picture;
    }

}
