// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class Dimension extends TeaModel {
    // 维度
    /**
     * <strong>example:</strong>
     * <p>voucher_template_id</p>
     */
    @NameInMap("dimension")
    @Validation(required = true)
    public String dimension;

    // 维度值
    /**
     * <strong>example:</strong>
     * <p>2025122400073001038200J7964H</p>
     */
    @NameInMap("dimension_value")
    @Validation(required = true)
    public String dimensionValue;

    public static Dimension build(java.util.Map<String, ?> map) throws Exception {
        Dimension self = new Dimension();
        return TeaModel.build(map, self);
    }

    public Dimension setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public Dimension setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

}
