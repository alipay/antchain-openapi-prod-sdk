// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Trigger extends TeaModel {
    // value_field
    @NameInMap("value_field")
    @Validation(required = true)
    public String valueField;

    // value_index
    @NameInMap("value_index")
    @Validation(required = true)
    public Long valueIndex;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // n
    @NameInMap("n")
    @Validation(required = true)
    public Long n;

    // compare
    @NameInMap("compare")
    @Validation(required = true)
    public String compare;

    // compare_percent
    @NameInMap("compare_percent")
    @Validation(required = true)
    public String comparePercent;

    // threshold
    @NameInMap("threshold")
    @Validation(required = true)
    public Threshold threshold;

    // threshold_copy
    @NameInMap("threshold_copy")
    @Validation(required = true)
    public Threshold thresholdCopy;

    // value_is_percent
    @NameInMap("value_is_percent")
    @Validation(required = true)
    public Boolean valueIsPercent;

    public static Trigger build(java.util.Map<String, ?> map) throws Exception {
        Trigger self = new Trigger();
        return TeaModel.build(map, self);
    }

    public Trigger setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }
    public String getValueField() {
        return this.valueField;
    }

    public Trigger setValueIndex(Long valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
    public Long getValueIndex() {
        return this.valueIndex;
    }

    public Trigger setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Trigger setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public Trigger setCompare(String compare) {
        this.compare = compare;
        return this;
    }
    public String getCompare() {
        return this.compare;
    }

    public Trigger setComparePercent(String comparePercent) {
        this.comparePercent = comparePercent;
        return this;
    }
    public String getComparePercent() {
        return this.comparePercent;
    }

    public Trigger setThreshold(Threshold threshold) {
        this.threshold = threshold;
        return this;
    }
    public Threshold getThreshold() {
        return this.threshold;
    }

    public Trigger setThresholdCopy(Threshold thresholdCopy) {
        this.thresholdCopy = thresholdCopy;
        return this;
    }
    public Threshold getThresholdCopy() {
        return this.thresholdCopy;
    }

    public Trigger setValueIsPercent(Boolean valueIsPercent) {
        this.valueIsPercent = valueIsPercent;
        return this;
    }
    public Boolean getValueIsPercent() {
        return this.valueIsPercent;
    }

}
