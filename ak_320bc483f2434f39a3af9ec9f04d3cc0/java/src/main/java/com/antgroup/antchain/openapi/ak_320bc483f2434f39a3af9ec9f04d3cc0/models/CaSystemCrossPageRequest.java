// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSystemCrossPageRequest extends TeaModel {
    // 签署页码
    @NameInMap("pos_page_start")
    @Validation(required = true)
    public Long posPageStart;

    // 结束页码（供骑缝章使用）
    @NameInMap("pos_page_end")
    @Validation(required = true)
    public Long posPageEnd;

    // 签署区位置横坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public Long posX;

    // 签署区位置纵坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public Long posY;

    public static CaSystemCrossPageRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemCrossPageRequest self = new CaSystemCrossPageRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemCrossPageRequest setPosPageStart(Long posPageStart) {
        this.posPageStart = posPageStart;
        return this;
    }
    public Long getPosPageStart() {
        return this.posPageStart;
    }

    public CaSystemCrossPageRequest setPosPageEnd(Long posPageEnd) {
        this.posPageEnd = posPageEnd;
        return this;
    }
    public Long getPosPageEnd() {
        return this.posPageEnd;
    }

    public CaSystemCrossPageRequest setPosX(Long posX) {
        this.posX = posX;
        return this;
    }
    public Long getPosX() {
        return this.posX;
    }

    public CaSystemCrossPageRequest setPosY(Long posY) {
        this.posY = posY;
        return this;
    }
    public Long getPosY() {
        return this.posY;
    }

}
