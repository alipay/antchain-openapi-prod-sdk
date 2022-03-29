// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XCalculationExpression extends TeaModel {
    // x
    @NameInMap("function")
    public String function;

    // x
    @NameInMap("parameters")
    public java.util.List<XCalculationParameter> parameters;

    // PromQL
    @NameInMap("query")
    public String query;

    //  
    @NameInMap("query_metadatas")
    public java.util.List<XMetricQueryMetadata> queryMetadatas;

    // calculation type
    @NameInMap("type")
    public String type;

    public static XCalculationExpression build(java.util.Map<String, ?> map) throws Exception {
        XCalculationExpression self = new XCalculationExpression();
        return TeaModel.build(map, self);
    }

    public XCalculationExpression setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public XCalculationExpression setParameters(java.util.List<XCalculationParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<XCalculationParameter> getParameters() {
        return this.parameters;
    }

    public XCalculationExpression setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public XCalculationExpression setQueryMetadatas(java.util.List<XMetricQueryMetadata> queryMetadatas) {
        this.queryMetadatas = queryMetadatas;
        return this;
    }
    public java.util.List<XMetricQueryMetadata> getQueryMetadatas() {
        return this.queryMetadatas;
    }

    public XCalculationExpression setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
