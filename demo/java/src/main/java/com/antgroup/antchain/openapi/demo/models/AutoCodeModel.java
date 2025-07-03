// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class AutoCodeModel extends TeaModel {
    // 111
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("model_string_param")
    @Validation(required = true)
    public String modelStringParam;

    // 111
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("model_date_param")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modelDateParam;

    // 111
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("model_array_param")
    @Validation(required = true)
    public java.util.List<String> modelArrayParam;

    public static AutoCodeModel build(java.util.Map<String, ?> map) throws Exception {
        AutoCodeModel self = new AutoCodeModel();
        return TeaModel.build(map, self);
    }

    public AutoCodeModel setModelStringParam(String modelStringParam) {
        this.modelStringParam = modelStringParam;
        return this;
    }
    public String getModelStringParam() {
        return this.modelStringParam;
    }

    public AutoCodeModel setModelDateParam(String modelDateParam) {
        this.modelDateParam = modelDateParam;
        return this;
    }
    public String getModelDateParam() {
        return this.modelDateParam;
    }

    public AutoCodeModel setModelArrayParam(java.util.List<String> modelArrayParam) {
        this.modelArrayParam = modelArrayParam;
        return this;
    }
    public java.util.List<String> getModelArrayParam() {
        return this.modelArrayParam;
    }

}
