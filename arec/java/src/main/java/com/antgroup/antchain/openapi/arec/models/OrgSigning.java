// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class OrgSigning extends TeaModel {
    // 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
    @NameInMap("org_seal_id")
    public String orgSealId;

    // 机构签署页码，从第1页开始
    // 
    // 
    @NameInMap("org_sign_page_no")
    @Validation(required = true)
    public Long orgSignPageNo;

    // 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
    // 
    // 
    @NameInMap("org_sign_coordinate_x")
    @Validation(required = true)
    public String orgSignCoordinateX;

    // 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
    @NameInMap("org_sign_coordinate_y")
    @Validation(required = true)
    public String orgSignCoordinateY;

    public static OrgSigning build(java.util.Map<String, ?> map) throws Exception {
        OrgSigning self = new OrgSigning();
        return TeaModel.build(map, self);
    }

    public OrgSigning setOrgSealId(String orgSealId) {
        this.orgSealId = orgSealId;
        return this;
    }
    public String getOrgSealId() {
        return this.orgSealId;
    }

    public OrgSigning setOrgSignPageNo(Long orgSignPageNo) {
        this.orgSignPageNo = orgSignPageNo;
        return this;
    }
    public Long getOrgSignPageNo() {
        return this.orgSignPageNo;
    }

    public OrgSigning setOrgSignCoordinateX(String orgSignCoordinateX) {
        this.orgSignCoordinateX = orgSignCoordinateX;
        return this;
    }
    public String getOrgSignCoordinateX() {
        return this.orgSignCoordinateX;
    }

    public OrgSigning setOrgSignCoordinateY(String orgSignCoordinateY) {
        this.orgSignCoordinateY = orgSignCoordinateY;
        return this;
    }
    public String getOrgSignCoordinateY() {
        return this.orgSignCoordinateY;
    }

}
