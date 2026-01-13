// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class Part extends TeaModel {
    // the string content of the text part.
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("text")
    public String text;

    public static Part build(java.util.Map<String, ?> map) throws Exception {
        Part self = new Part();
        return TeaModel.build(map, self);
    }

    public Part setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
