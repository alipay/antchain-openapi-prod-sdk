// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SpuPictureInfo extends TeaModel {
    // spu主图url
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("main_pic")
    @Validation(required = true)
    public String mainPic;

    // spu详情图片url
    @NameInMap("detail_pic")
    public java.util.List<String> detailPic;

    public static SpuPictureInfo build(java.util.Map<String, ?> map) throws Exception {
        SpuPictureInfo self = new SpuPictureInfo();
        return TeaModel.build(map, self);
    }

    public SpuPictureInfo setMainPic(String mainPic) {
        this.mainPic = mainPic;
        return this;
    }
    public String getMainPic() {
        return this.mainPic;
    }

    public SpuPictureInfo setDetailPic(java.util.List<String> detailPic) {
        this.detailPic = detailPic;
        return this;
    }
    public java.util.List<String> getDetailPic() {
        return this.detailPic;
    }

}
