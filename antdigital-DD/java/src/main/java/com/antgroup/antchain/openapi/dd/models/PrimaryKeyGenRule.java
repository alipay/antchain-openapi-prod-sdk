// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PrimaryKeyGenRule extends TeaModel {
    // 规则code
    /**
     * <strong>example:</strong>
     * <p>test;instance</p>
     */
    @NameInMap("rule_code")
    public String ruleCode;

    // 规则名称
    /**
     * <strong>example:</strong>
     * <p>主键规则</p>
     */
    @NameInMap("chinese_name")
    public String chineseName;

    // 规则englishName
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("english_name")
    public String englishName;

    // 规则包括的fiel列表
    /**
     * <strong>example:</strong>
     * <p>field1,field2,field3</p>
     */
    @NameInMap("primary_keys")
    public String primaryKeys;

    public static PrimaryKeyGenRule build(java.util.Map<String, ?> map) throws Exception {
        PrimaryKeyGenRule self = new PrimaryKeyGenRule();
        return TeaModel.build(map, self);
    }

    public PrimaryKeyGenRule setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public PrimaryKeyGenRule setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public PrimaryKeyGenRule setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public PrimaryKeyGenRule setPrimaryKeys(String primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }
    public String getPrimaryKeys() {
        return this.primaryKeys;
    }

}
