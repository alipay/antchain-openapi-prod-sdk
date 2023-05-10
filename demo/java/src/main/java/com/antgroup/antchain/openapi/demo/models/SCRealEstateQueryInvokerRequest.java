// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryInvokerRequest extends TeaModel {
    // header
    @NameInMap("header")
    @Validation(required = true)
    public Header header;

    // body
    @NameInMap("body")
    @Validation(required = true)
    public SCRealEstateQueryBody body;

    public static SCRealEstateQueryInvokerRequest build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryInvokerRequest self = new SCRealEstateQueryInvokerRequest();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryInvokerRequest setHeader(Header header) {
        this.header = header;
        return this;
    }
    public Header getHeader() {
        return this.header;
    }

    public SCRealEstateQueryInvokerRequest setBody(SCRealEstateQueryBody body) {
        this.body = body;
        return this;
    }
    public SCRealEstateQueryBody getBody() {
        return this.body;
    }

}
