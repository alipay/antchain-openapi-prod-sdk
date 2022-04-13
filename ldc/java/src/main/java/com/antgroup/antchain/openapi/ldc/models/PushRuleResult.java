// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PushRuleResult extends TeaModel {
    // site名字
    @NameInMap("name")
    public String name;

    // site描述
    @NameInMap("desc")
    public String desc;

    // 推送成功的zone
    @NameInMap("succeed_list")
    public java.util.List<String> succeedList;

    // 推送失败的zone
    @NameInMap("failed_list")
    public java.util.List<String> failedList;

    public static PushRuleResult build(java.util.Map<String, ?> map) throws Exception {
        PushRuleResult self = new PushRuleResult();
        return TeaModel.build(map, self);
    }

    public PushRuleResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushRuleResult setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PushRuleResult setSucceedList(java.util.List<String> succeedList) {
        this.succeedList = succeedList;
        return this;
    }
    public java.util.List<String> getSucceedList() {
        return this.succeedList;
    }

    public PushRuleResult setFailedList(java.util.List<String> failedList) {
        this.failedList = failedList;
        return this;
    }
    public java.util.List<String> getFailedList() {
        return this.failedList;
    }

}
