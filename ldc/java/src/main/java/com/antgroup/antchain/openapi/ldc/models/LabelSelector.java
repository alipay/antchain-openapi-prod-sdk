// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LabelSelector extends TeaModel {
    // matchExpressions is a list of label selector requirements.
    @NameInMap("match_expressions")
    public java.util.List<LabelSelectorRequirement> matchExpressions;

    // matchLabels is a map of {key,value} pairs
    @NameInMap("match_labels")
    public java.util.List<Label> matchLabels;

    public static LabelSelector build(java.util.Map<String, ?> map) throws Exception {
        LabelSelector self = new LabelSelector();
        return TeaModel.build(map, self);
    }

    public LabelSelector setMatchExpressions(java.util.List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public java.util.List<LabelSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public LabelSelector setMatchLabels(java.util.List<Label> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }
    public java.util.List<Label> getMatchLabels() {
        return this.matchLabels;
    }

}
