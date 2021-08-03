// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class TdmCpfEncodeNameVO extends TeaModel {
    // 公积金中心编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 公积金中心名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static TdmCpfEncodeNameVO build(java.util.Map<String, ?> map) throws Exception {
        TdmCpfEncodeNameVO self = new TdmCpfEncodeNameVO();
        return TeaModel.build(map, self);
    }

    public TdmCpfEncodeNameVO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TdmCpfEncodeNameVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
