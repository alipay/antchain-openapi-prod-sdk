// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UserClassifyInfo extends TeaModel {
    // 版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 流量分层
    @NameInMap("rate_classify")
    @Validation(required = true)
    public String rateClassify;

    // 流量扩展分层1
    @NameInMap("classify_ext1")
    public String classifyExt1;

    // 流量扩展分层2
    @NameInMap("classify_ext2")
    public String classifyExt2;

    public static UserClassifyInfo build(java.util.Map<String, ?> map) throws Exception {
        UserClassifyInfo self = new UserClassifyInfo();
        return TeaModel.build(map, self);
    }

    public UserClassifyInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UserClassifyInfo setRateClassify(String rateClassify) {
        this.rateClassify = rateClassify;
        return this;
    }
    public String getRateClassify() {
        return this.rateClassify;
    }

    public UserClassifyInfo setClassifyExt1(String classifyExt1) {
        this.classifyExt1 = classifyExt1;
        return this;
    }
    public String getClassifyExt1() {
        return this.classifyExt1;
    }

    public UserClassifyInfo setClassifyExt2(String classifyExt2) {
        this.classifyExt2 = classifyExt2;
        return this;
    }
    public String getClassifyExt2() {
        return this.classifyExt2;
    }

}
