// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class SplitRule extends TeaModel {
    // db_split_rule
    @NameInMap("db_split_rule")
    @Validation(required = true)
    public Long dbSplitRule;

    // db_split_template
    @NameInMap("db_split_template")
    public String dbSplitTemplate;

    // table_split_rule
    @NameInMap("table_split_rule")
    @Validation(required = true)
    public Long tableSplitRule;

    // table_split_template
    @NameInMap("table_split_template")
    public String tableSplitTemplate;

    public static SplitRule build(java.util.Map<String, ?> map) throws Exception {
        SplitRule self = new SplitRule();
        return TeaModel.build(map, self);
    }

    public SplitRule setDbSplitRule(Long dbSplitRule) {
        this.dbSplitRule = dbSplitRule;
        return this;
    }
    public Long getDbSplitRule() {
        return this.dbSplitRule;
    }

    public SplitRule setDbSplitTemplate(String dbSplitTemplate) {
        this.dbSplitTemplate = dbSplitTemplate;
        return this;
    }
    public String getDbSplitTemplate() {
        return this.dbSplitTemplate;
    }

    public SplitRule setTableSplitRule(Long tableSplitRule) {
        this.tableSplitRule = tableSplitRule;
        return this;
    }
    public Long getTableSplitRule() {
        return this.tableSplitRule;
    }

    public SplitRule setTableSplitTemplate(String tableSplitTemplate) {
        this.tableSplitTemplate = tableSplitTemplate;
        return this;
    }
    public String getTableSplitTemplate() {
        return this.tableSplitTemplate;
    }

}
