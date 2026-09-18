// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoImages extends TeaModel {
    // 营业执照
    /**
     * <strong>example:</strong>
     * <p>营业执照</p>
     */
    @NameInMap("business_license")
    @Validation(required = true)
    public String businessLicense;

    // 门头照
    /**
     * <strong>example:</strong>
     * <p>门头照</p>
     */
    @NameInMap("storefront")
    public String storefront;

    // 环境照
    /**
     * <strong>example:</strong>
     * <p>环境照</p>
     */
    @NameInMap("environment")
    public String environment;

    // 前台照
    /**
     * <strong>example:</strong>
     * <p>前台照</p>
     */
    @NameInMap("front_desk")
    public String frontDesk;

    // 法人身份证人像面
    /**
     * <strong>example:</strong>
     * <p>法人身份证人像面</p>
     */
    @NameInMap("id_card_front")
    public String idCardFront;

    // 法人身份证国徽面
    /**
     * <strong>example:</strong>
     * <p>法人身份证国徽面</p>
     */
    @NameInMap("id_card_back")
    public String idCardBack;

    public static MaoImages build(java.util.Map<String, ?> map) throws Exception {
        MaoImages self = new MaoImages();
        return TeaModel.build(map, self);
    }

    public MaoImages setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
        return this;
    }
    public String getBusinessLicense() {
        return this.businessLicense;
    }

    public MaoImages setStorefront(String storefront) {
        this.storefront = storefront;
        return this;
    }
    public String getStorefront() {
        return this.storefront;
    }

    public MaoImages setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public MaoImages setFrontDesk(String frontDesk) {
        this.frontDesk = frontDesk;
        return this;
    }
    public String getFrontDesk() {
        return this.frontDesk;
    }

    public MaoImages setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront;
        return this;
    }
    public String getIdCardFront() {
        return this.idCardFront;
    }

    public MaoImages setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
        return this;
    }
    public String getIdCardBack() {
        return this.idCardBack;
    }

}
