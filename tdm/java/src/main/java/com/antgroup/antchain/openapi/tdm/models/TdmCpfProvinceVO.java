// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class TdmCpfProvinceVO extends TeaModel {
    // 省编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 省名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 公积金中心列表
    @NameInMap("areas")
    @Validation(required = true)
    public java.util.List<TdmCpfCitysVO> areas;

    public static TdmCpfProvinceVO build(java.util.Map<String, ?> map) throws Exception {
        TdmCpfProvinceVO self = new TdmCpfProvinceVO();
        return TeaModel.build(map, self);
    }

    public TdmCpfProvinceVO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TdmCpfProvinceVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TdmCpfProvinceVO setAreas(java.util.List<TdmCpfCitysVO> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<TdmCpfCitysVO> getAreas() {
        return this.areas;
    }

}
