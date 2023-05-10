// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryResponsePayload extends TeaModel {
    // code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<SCRealEstateQueryResponseData> data;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // ret_msg
    @NameInMap("ret_msg")
    @Validation(required = true)
    public String retMsg;

    public static SCRealEstateQueryResponsePayload build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryResponsePayload self = new SCRealEstateQueryResponsePayload();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryResponsePayload setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SCRealEstateQueryResponsePayload setData(java.util.List<SCRealEstateQueryResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SCRealEstateQueryResponseData> getData() {
        return this.data;
    }

    public SCRealEstateQueryResponsePayload setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public SCRealEstateQueryResponsePayload setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

}
