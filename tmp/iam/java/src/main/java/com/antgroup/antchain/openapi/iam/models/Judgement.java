// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Judgement extends TeaModel {
    // 唯一ID
    @NameInMap("id")
    public String id;

    // 是否通过
    @NameInMap("pass")
    @Validation(required = true)
    public Boolean pass;

    // 失败原因
    @NameInMap("reason")
    public String reason;

    // 解决方案
    @NameInMap("solution")
    public String solution;

    public static Judgement build(java.util.Map<String, ?> map) throws Exception {
        Judgement self = new Judgement();
        return TeaModel.build(map, self);
    }

    public Judgement setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Judgement setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

    public Judgement setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Judgement setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
