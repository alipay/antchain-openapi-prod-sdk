// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ContinuousOtaVersionPredicate extends TeaModel {
    // 匹配类型：ANY、EXACT 或 RANGE；非 eKYT 模块仅支持 ANY 和 EXACT。
    /**
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 精确匹配的版本号，仅在 type 为 EXACT 时使用。
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("exact_version_no")
    public String exactVersionNo;

    // 版本范围下界，仅在 type 为 RANGE 时使用。
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("lower")
    public Bound lower;

    // 版本范围上界，仅在 type 为 RANGE 时使用。
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("upper")
    public Bound upper;

    public static ContinuousOtaVersionPredicate build(java.util.Map<String, ?> map) throws Exception {
        ContinuousOtaVersionPredicate self = new ContinuousOtaVersionPredicate();
        return TeaModel.build(map, self);
    }

    public ContinuousOtaVersionPredicate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContinuousOtaVersionPredicate setExactVersionNo(String exactVersionNo) {
        this.exactVersionNo = exactVersionNo;
        return this;
    }
    public String getExactVersionNo() {
        return this.exactVersionNo;
    }

    public ContinuousOtaVersionPredicate setLower(Bound lower) {
        this.lower = lower;
        return this;
    }
    public Bound getLower() {
        return this.lower;
    }

    public ContinuousOtaVersionPredicate setUpper(Bound upper) {
        this.upper = upper;
        return this;
    }
    public Bound getUpper() {
        return this.upper;
    }

}
