// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class RealtyBasicInfo extends TeaModel {
    // 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
    @NameInMap("realty_cert_type")
    @Validation(required = true)
    public String realtyCertType;

    // 权证号码
    @NameInMap("realty_cert_no")
    @Validation(required = true)
    public String realtyCertNo;

    // 坐落位置
    @NameInMap("location")
    @Validation(required = true)
    public String location;

    // 权利人列表
    @NameInMap("obligee_list")
    public java.util.List<EntityBasicInfo> obligeeList;

    public static RealtyBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        RealtyBasicInfo self = new RealtyBasicInfo();
        return TeaModel.build(map, self);
    }

    public RealtyBasicInfo setRealtyCertType(String realtyCertType) {
        this.realtyCertType = realtyCertType;
        return this;
    }
    public String getRealtyCertType() {
        return this.realtyCertType;
    }

    public RealtyBasicInfo setRealtyCertNo(String realtyCertNo) {
        this.realtyCertNo = realtyCertNo;
        return this;
    }
    public String getRealtyCertNo() {
        return this.realtyCertNo;
    }

    public RealtyBasicInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public RealtyBasicInfo setObligeeList(java.util.List<EntityBasicInfo> obligeeList) {
        this.obligeeList = obligeeList;
        return this;
    }
    public java.util.List<EntityBasicInfo> getObligeeList() {
        return this.obligeeList;
    }

}
