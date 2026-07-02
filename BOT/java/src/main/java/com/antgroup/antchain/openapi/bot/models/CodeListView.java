// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CodeListView extends TeaModel {
    // 数据code
    /**
     * <strong>example:</strong>
     * <p>ahog</p>
     */
    @NameInMap("data_code")
    @Validation(required = true)
    public String dataCode;

    // 数据名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("data_name")
    @Validation(required = true)
    public String dataName;

    public static CodeListView build(java.util.Map<String, ?> map) throws Exception {
        CodeListView self = new CodeListView();
        return TeaModel.build(map, self);
    }

    public CodeListView setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public CodeListView setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

}
