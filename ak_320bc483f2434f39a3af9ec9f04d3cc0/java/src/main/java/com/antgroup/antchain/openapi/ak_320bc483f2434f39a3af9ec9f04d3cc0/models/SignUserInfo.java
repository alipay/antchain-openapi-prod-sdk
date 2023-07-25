// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignUserInfo extends TeaModel {
    // 身份证号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 签署区列表
    @NameInMap("sign_area_list")
    @Validation(required = true)
    public java.util.List<SignatoryInfo> signAreaList;

    public static SignUserInfo build(java.util.Map<String, ?> map) throws Exception {
        SignUserInfo self = new SignUserInfo();
        return TeaModel.build(map, self);
    }

    public SignUserInfo setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public SignUserInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SignUserInfo setSignAreaList(java.util.List<SignatoryInfo> signAreaList) {
        this.signAreaList = signAreaList;
        return this;
    }
    public java.util.List<SignatoryInfo> getSignAreaList() {
        return this.signAreaList;
    }

}
