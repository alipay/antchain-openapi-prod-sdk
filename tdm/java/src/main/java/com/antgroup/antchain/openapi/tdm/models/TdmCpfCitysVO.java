// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class TdmCpfCitysVO extends TeaModel {
    // 城市编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 城市名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 公积金中心城市列表
    @NameInMap("cpfs")
    @Validation(required = true)
    public java.util.List<TdmCpfEncodeNameVO> cpfs;

    public static TdmCpfCitysVO build(java.util.Map<String, ?> map) throws Exception {
        TdmCpfCitysVO self = new TdmCpfCitysVO();
        return TeaModel.build(map, self);
    }

    public TdmCpfCitysVO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TdmCpfCitysVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TdmCpfCitysVO setCpfs(java.util.List<TdmCpfEncodeNameVO> cpfs) {
        this.cpfs = cpfs;
        return this;
    }
    public java.util.List<TdmCpfEncodeNameVO> getCpfs() {
        return this.cpfs;
    }

}
