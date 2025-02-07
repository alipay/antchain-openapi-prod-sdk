// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class FeatureSetInfo extends TeaModel {
    // 特征集编码
    @NameInMap("featureset_code")
    @Validation(required = true)
    public String featuresetCode;

    // 名称
    @NameInMap("featureset_name")
    @Validation(required = true)
    public String featuresetName;

    // 数量
    @NameInMap("nums")
    @Validation(required = true)
    public String nums;

    // 描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    public static FeatureSetInfo build(java.util.Map<String, ?> map) throws Exception {
        FeatureSetInfo self = new FeatureSetInfo();
        return TeaModel.build(map, self);
    }

    public FeatureSetInfo setFeaturesetCode(String featuresetCode) {
        this.featuresetCode = featuresetCode;
        return this;
    }
    public String getFeaturesetCode() {
        return this.featuresetCode;
    }

    public FeatureSetInfo setFeaturesetName(String featuresetName) {
        this.featuresetName = featuresetName;
        return this;
    }
    public String getFeaturesetName() {
        return this.featuresetName;
    }

    public FeatureSetInfo setNums(String nums) {
        this.nums = nums;
        return this;
    }
    public String getNums() {
        return this.nums;
    }

    public FeatureSetInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
