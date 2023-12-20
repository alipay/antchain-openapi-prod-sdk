// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSystemMainBodyRequest extends TeaModel {
    // 签署页码
    @NameInMap("pos_page")
    @Validation(required = true)
    public Long posPage;

    // 签署区位置横坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // 签署区位置纵坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    public static CaSystemMainBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemMainBodyRequest self = new CaSystemMainBodyRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemMainBodyRequest setPosPage(Long posPage) {
        this.posPage = posPage;
        return this;
    }
    public Long getPosPage() {
        return this.posPage;
    }

    public CaSystemMainBodyRequest setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public CaSystemMainBodyRequest setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

}
