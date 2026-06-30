// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcLinkUrl extends TeaModel {
    // 根据传输的操作类型，返回对应的URL地址
    /**
     * <strong>example:</strong>
     * <p>SQ202301291615023</p>
     */
    @NameInMap("url_id")
    public String urlId;

    // 免登场景下，给到开放银行和对公认证中心的链接ID,如果对方没有，没办法以免登的形式进入银行页面。
    /**
     * <strong>example:</strong>
     * <p>APPL20200826000000250721</p>
     */
    @NameInMap("h5id")
    public String h5id;

    // 免登场景下，给到对公认证中心的数据，后续KYB需要拿到这个数据进行校验，否则会无法跳转指定地址。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("state")
    public String state;

    public static EcLinkUrl build(java.util.Map<String, ?> map) throws Exception {
        EcLinkUrl self = new EcLinkUrl();
        return TeaModel.build(map, self);
    }

    public EcLinkUrl setUrlId(String urlId) {
        this.urlId = urlId;
        return this;
    }
    public String getUrlId() {
        return this.urlId;
    }

    public EcLinkUrl setH5id(String h5id) {
        this.h5id = h5id;
        return this;
    }
    public String getH5id() {
        return this.h5id;
    }

    public EcLinkUrl setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
