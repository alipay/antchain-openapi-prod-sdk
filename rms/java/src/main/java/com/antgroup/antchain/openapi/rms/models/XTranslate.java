// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTranslate extends TeaModel {
    //  
    @NameInMap("default_value")
    public String defaultValue;

    //  
    @NameInMap("include_not_matched")
    public Boolean includeNotMatched;

    //  
    @NameInMap("translate_expressions")
    public java.util.List<XTranslateExpression> translateExpressions;

    public static XTranslate build(java.util.Map<String, ?> map) throws Exception {
        XTranslate self = new XTranslate();
        return TeaModel.build(map, self);
    }

    public XTranslate setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public XTranslate setIncludeNotMatched(Boolean includeNotMatched) {
        this.includeNotMatched = includeNotMatched;
        return this;
    }
    public Boolean getIncludeNotMatched() {
        return this.includeNotMatched;
    }

    public XTranslate setTranslateExpressions(java.util.List<XTranslateExpression> translateExpressions) {
        this.translateExpressions = translateExpressions;
        return this;
    }
    public java.util.List<XTranslateExpression> getTranslateExpressions() {
        return this.translateExpressions;
    }

}
