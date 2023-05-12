// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DsNameInfo extends TeaModel {
    // ds_name
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    // ds_name_format
    @NameInMap("ds_name_format")
    @Validation(required = true)
    public String dsNameFormat;

    public static DsNameInfo build(java.util.Map<String, ?> map) throws Exception {
        DsNameInfo self = new DsNameInfo();
        return TeaModel.build(map, self);
    }

    public DsNameInfo setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public DsNameInfo setDsNameFormat(String dsNameFormat) {
        this.dsNameFormat = dsNameFormat;
        return this;
    }
    public String getDsNameFormat() {
        return this.dsNameFormat;
    }

}
