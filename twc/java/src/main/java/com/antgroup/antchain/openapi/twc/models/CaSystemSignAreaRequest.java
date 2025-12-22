// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaSystemSignAreaRequest extends TeaModel {
    // 印章印模oss-fileKey 或者oss可预览下载地址
    /**
     * <strong>example:</strong>
     * <p>ESIGN/ato/ca_png/ORG/111.png</p>
     */
    @NameInMap("seal_pic_addr")
    public String sealPicAddr;

    // 用印对齐类型
    /**
     * <strong>example:</strong>
     * <p>BOTTOM_LEFT</p>
     */
    @NameInMap("location_type")
    @Validation(required = true)
    public String locationType;

    // 章的旋转角度
    @NameInMap("rotate_angle")
    public Long rotateAngle;

    // 签署位置类型	1代表正文章，2代表骑缝章
    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("position_type")
    @Validation(required = true)
    public Long positionType;

    // 指定外部印章类型
    /**
     * <strong>example:</strong>
     * <p>目前支持手签(PERSONAL)或公章(OFFICIAL)</p>
     */
    @NameInMap("external_seal_type")
    public String externalSealType;

    // 骑缝章信息
    @NameInMap("ca_system_cross_page_request")
    public CaSystemCrossPageRequest caSystemCrossPageRequest;

    // 正文章信息
    @NameInMap("ca_system_main_body_request")
    public CaSystemMainBodyRequest caSystemMainBodyRequest;

    public static CaSystemSignAreaRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemSignAreaRequest self = new CaSystemSignAreaRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemSignAreaRequest setSealPicAddr(String sealPicAddr) {
        this.sealPicAddr = sealPicAddr;
        return this;
    }
    public String getSealPicAddr() {
        return this.sealPicAddr;
    }

    public CaSystemSignAreaRequest setLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }
    public String getLocationType() {
        return this.locationType;
    }

    public CaSystemSignAreaRequest setRotateAngle(Long rotateAngle) {
        this.rotateAngle = rotateAngle;
        return this;
    }
    public Long getRotateAngle() {
        return this.rotateAngle;
    }

    public CaSystemSignAreaRequest setPositionType(Long positionType) {
        this.positionType = positionType;
        return this;
    }
    public Long getPositionType() {
        return this.positionType;
    }

    public CaSystemSignAreaRequest setExternalSealType(String externalSealType) {
        this.externalSealType = externalSealType;
        return this;
    }
    public String getExternalSealType() {
        return this.externalSealType;
    }

    public CaSystemSignAreaRequest setCaSystemCrossPageRequest(CaSystemCrossPageRequest caSystemCrossPageRequest) {
        this.caSystemCrossPageRequest = caSystemCrossPageRequest;
        return this;
    }
    public CaSystemCrossPageRequest getCaSystemCrossPageRequest() {
        return this.caSystemCrossPageRequest;
    }

    public CaSystemSignAreaRequest setCaSystemMainBodyRequest(CaSystemMainBodyRequest caSystemMainBodyRequest) {
        this.caSystemMainBodyRequest = caSystemMainBodyRequest;
        return this;
    }
    public CaSystemMainBodyRequest getCaSystemMainBodyRequest() {
        return this.caSystemMainBodyRequest;
    }

}
