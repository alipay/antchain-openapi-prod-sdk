// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Card extends TeaModel {
    // 名称（该页面的名称，可能做展示用）
    /**
     * <strong>example:</strong>
     * <p>名称（该页面的名称，可能做展示用）</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
    /**
     * <strong>example:</strong>
     * <p>如果一层有多个卡片，那么这个名称就作为tab的头名称展示</p>
     */
    @NameInMap("tab_show_name")
    @Validation(required = true)
    public String tabShowName;

    // 当前模版所有需要填充元素
    /**
     * <strong>example:</strong>
     * <p>当前模版所有需要填充元素</p>
     */
    @NameInMap("key_values")
    @Validation(required = true)
    public Pair keyValues;

    // true：是，false：不是
    // 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
    /**
     * <strong>example:</strong>
     * <p>是否作同一个父节点的默认展示</p>
     */
    @NameInMap("is_selected")
    @Validation(required = true)
    public String isSelected;

    // 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/
    /**
     * <strong>example:</strong>
     * <p>[selectCard1,input1]</p>
     */
    @NameInMap("return_value_key")
    @Validation(required = true)
    public java.util.List<String> returnValueKey;

    public static Card build(java.util.Map<String, ?> map) throws Exception {
        Card self = new Card();
        return TeaModel.build(map, self);
    }

    public Card setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Card setTabShowName(String tabShowName) {
        this.tabShowName = tabShowName;
        return this;
    }
    public String getTabShowName() {
        return this.tabShowName;
    }

    public Card setKeyValues(Pair keyValues) {
        this.keyValues = keyValues;
        return this;
    }
    public Pair getKeyValues() {
        return this.keyValues;
    }

    public Card setIsSelected(String isSelected) {
        this.isSelected = isSelected;
        return this;
    }
    public String getIsSelected() {
        return this.isSelected;
    }

    public Card setReturnValueKey(java.util.List<String> returnValueKey) {
        this.returnValueKey = returnValueKey;
        return this;
    }
    public java.util.List<String> getReturnValueKey() {
        return this.returnValueKey;
    }

}
