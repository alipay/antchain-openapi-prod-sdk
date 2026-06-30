// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CctDetectCheckLabel extends TeaModel {
    // label
    /**
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // rate
    /**
     * <strong>example:</strong>
     * <p>rate</p>
     */
    @NameInMap("rate")
    @Validation(required = true)
    public Long rate;

    // subLabels
    @NameInMap("sub_labels")
    @Validation(required = true)
    public java.util.List<CctSubCheckLabel> subLabels;

    // details
    /**
     * <strong>example:</strong>
     * <p>details</p>
     */
    @NameInMap("details")
    @Validation(required = true)
    public String details;

    public static CctDetectCheckLabel build(java.util.Map<String, ?> map) throws Exception {
        CctDetectCheckLabel self = new CctDetectCheckLabel();
        return TeaModel.build(map, self);
    }

    public CctDetectCheckLabel setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CctDetectCheckLabel setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public CctDetectCheckLabel setSubLabels(java.util.List<CctSubCheckLabel> subLabels) {
        this.subLabels = subLabels;
        return this;
    }
    public java.util.List<CctSubCheckLabel> getSubLabels() {
        return this.subLabels;
    }

    public CctDetectCheckLabel setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

}
