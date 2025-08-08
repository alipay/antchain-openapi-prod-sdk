// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class MainItemAdd extends TeaModel {
    // 附加条款代码-参考保司提供样例
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("main_item_add_code")
    public String mainItemAddCode;

    // 附加条款内容-参考保司提供样例
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("main_item_add_content")
    public String mainItemAddContent;

    public static MainItemAdd build(java.util.Map<String, ?> map) throws Exception {
        MainItemAdd self = new MainItemAdd();
        return TeaModel.build(map, self);
    }

    public MainItemAdd setMainItemAddCode(String mainItemAddCode) {
        this.mainItemAddCode = mainItemAddCode;
        return this;
    }
    public String getMainItemAddCode() {
        return this.mainItemAddCode;
    }

    public MainItemAdd setMainItemAddContent(String mainItemAddContent) {
        this.mainItemAddContent = mainItemAddContent;
        return this;
    }
    public String getMainItemAddContent() {
        return this.mainItemAddContent;
    }

}
