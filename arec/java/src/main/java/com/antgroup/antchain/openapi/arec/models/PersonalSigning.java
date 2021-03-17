// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class PersonalSigning extends TeaModel {
    // 数字房产账户 ID
    // 
    @NameInMap("personal_id")
    @Validation(required = true)
    public String personalId;

    // 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
    @NameInMap("personal_seal_id")
    public String personalSealId;

    // 个人签署页码，本签名最终签署到协议哪一页
    @NameInMap("personal_sign_page_no")
    @Validation(required = true)
    public Long personalSignPageNo;

    // 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
    @NameInMap("personal_sign_coordinate_x")
    @Validation(required = true)
    public String personalSignCoordinateX;

    // 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
    @NameInMap("personal_sign_coordinate_y")
    @Validation(required = true)
    public String personalSignCoordinateY;

    public static PersonalSigning build(java.util.Map<String, ?> map) throws Exception {
        PersonalSigning self = new PersonalSigning();
        return TeaModel.build(map, self);
    }

    public PersonalSigning setPersonalId(String personalId) {
        this.personalId = personalId;
        return this;
    }
    public String getPersonalId() {
        return this.personalId;
    }

    public PersonalSigning setPersonalSealId(String personalSealId) {
        this.personalSealId = personalSealId;
        return this;
    }
    public String getPersonalSealId() {
        return this.personalSealId;
    }

    public PersonalSigning setPersonalSignPageNo(Long personalSignPageNo) {
        this.personalSignPageNo = personalSignPageNo;
        return this;
    }
    public Long getPersonalSignPageNo() {
        return this.personalSignPageNo;
    }

    public PersonalSigning setPersonalSignCoordinateX(String personalSignCoordinateX) {
        this.personalSignCoordinateX = personalSignCoordinateX;
        return this;
    }
    public String getPersonalSignCoordinateX() {
        return this.personalSignCoordinateX;
    }

    public PersonalSigning setPersonalSignCoordinateY(String personalSignCoordinateY) {
        this.personalSignCoordinateY = personalSignCoordinateY;
        return this;
    }
    public String getPersonalSignCoordinateY() {
        return this.personalSignCoordinateY;
    }

}
