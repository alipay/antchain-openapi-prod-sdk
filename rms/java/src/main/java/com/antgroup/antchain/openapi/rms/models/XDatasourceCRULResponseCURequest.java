// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XDatasourceCRULResponseCURequest extends TeaModel {
    //  
    @NameInMap("api_version")
    public String apiVersion;

    //  
    @NameInMap("metadata")
    @Validation(required = true)
    public XResource metadata;

    //  
    @NameInMap("spec")
    @Validation(required = true)
    public XSpec spec;

    public static XDatasourceCRULResponseCURequest build(java.util.Map<String, ?> map) throws Exception {
        XDatasourceCRULResponseCURequest self = new XDatasourceCRULResponseCURequest();
        return TeaModel.build(map, self);
    }

    public XDatasourceCRULResponseCURequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public XDatasourceCRULResponseCURequest setMetadata(XResource metadata) {
        this.metadata = metadata;
        return this;
    }
    public XResource getMetadata() {
        return this.metadata;
    }

    public XDatasourceCRULResponseCURequest setSpec(XSpec spec) {
        this.spec = spec;
        return this;
    }
    public XSpec getSpec() {
        return this.spec;
    }

}
