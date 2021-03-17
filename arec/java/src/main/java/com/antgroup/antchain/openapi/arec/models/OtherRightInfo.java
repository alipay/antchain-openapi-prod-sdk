// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class OtherRightInfo extends TeaModel {
    // 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
    @NameInMap("realty_cert_type")
    @Validation(required = true)
    public String realtyCertType;

    // 权证号码
    @NameInMap("realty_cert_no")
    @Validation(required = true)
    public String realtyCertNo;

    // 权利人
    @NameInMap("obligee")
    @Validation(required = true)
    public EntityBasicInfo obligee;

    // 原他项权证号
    @NameInMap("old_other_realty_cert_no")
    public String oldOtherRealtyCertNo;

    // 坐落
    @NameInMap("location")
    @Validation(required = true)
    public String location;

    // 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
    @NameInMap("new_other_right_cert_type")
    @Validation(required = true)
    public String newOtherRightCertType;

    // 新他项权证号
    @NameInMap("new_other_right_cert_no")
    @Validation(required = true)
    public String newOtherRightCertNo;

    // 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
    @NameInMap("new_other_right_cert_path")
    @Validation(required = true)
    public String newOtherRightCertPath;

    public static OtherRightInfo build(java.util.Map<String, ?> map) throws Exception {
        OtherRightInfo self = new OtherRightInfo();
        return TeaModel.build(map, self);
    }

    public OtherRightInfo setRealtyCertType(String realtyCertType) {
        this.realtyCertType = realtyCertType;
        return this;
    }
    public String getRealtyCertType() {
        return this.realtyCertType;
    }

    public OtherRightInfo setRealtyCertNo(String realtyCertNo) {
        this.realtyCertNo = realtyCertNo;
        return this;
    }
    public String getRealtyCertNo() {
        return this.realtyCertNo;
    }

    public OtherRightInfo setObligee(EntityBasicInfo obligee) {
        this.obligee = obligee;
        return this;
    }
    public EntityBasicInfo getObligee() {
        return this.obligee;
    }

    public OtherRightInfo setOldOtherRealtyCertNo(String oldOtherRealtyCertNo) {
        this.oldOtherRealtyCertNo = oldOtherRealtyCertNo;
        return this;
    }
    public String getOldOtherRealtyCertNo() {
        return this.oldOtherRealtyCertNo;
    }

    public OtherRightInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public OtherRightInfo setNewOtherRightCertType(String newOtherRightCertType) {
        this.newOtherRightCertType = newOtherRightCertType;
        return this;
    }
    public String getNewOtherRightCertType() {
        return this.newOtherRightCertType;
    }

    public OtherRightInfo setNewOtherRightCertNo(String newOtherRightCertNo) {
        this.newOtherRightCertNo = newOtherRightCertNo;
        return this;
    }
    public String getNewOtherRightCertNo() {
        return this.newOtherRightCertNo;
    }

    public OtherRightInfo setNewOtherRightCertPath(String newOtherRightCertPath) {
        this.newOtherRightCertPath = newOtherRightCertPath;
        return this;
    }
    public String getNewOtherRightCertPath() {
        return this.newOtherRightCertPath;
    }

}
