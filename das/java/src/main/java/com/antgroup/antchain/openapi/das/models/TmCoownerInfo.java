// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class TmCoownerInfo extends TeaModel {
    // 共有人中文名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("coowner_name_cn")
    public String coownerNameCn;

    // 共有人中文地址
    /**
     * <strong>example:</strong>
     * <p>中文地址信息</p>
     */
    @NameInMap("coowner_addr_cn")
    public String coownerAddrCn;

    // 共有人英文名称
    /**
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("coowner_name_en")
    public String coownerNameEn;

    // 共有人英文地址
    /**
     * <strong>example:</strong>
     * <p>英文地址信息</p>
     */
    @NameInMap("coowner_addr_en")
    public String coownerAddrEn;

    public static TmCoownerInfo build(java.util.Map<String, ?> map) throws Exception {
        TmCoownerInfo self = new TmCoownerInfo();
        return TeaModel.build(map, self);
    }

    public TmCoownerInfo setCoownerNameCn(String coownerNameCn) {
        this.coownerNameCn = coownerNameCn;
        return this;
    }
    public String getCoownerNameCn() {
        return this.coownerNameCn;
    }

    public TmCoownerInfo setCoownerAddrCn(String coownerAddrCn) {
        this.coownerAddrCn = coownerAddrCn;
        return this;
    }
    public String getCoownerAddrCn() {
        return this.coownerAddrCn;
    }

    public TmCoownerInfo setCoownerNameEn(String coownerNameEn) {
        this.coownerNameEn = coownerNameEn;
        return this;
    }
    public String getCoownerNameEn() {
        return this.coownerNameEn;
    }

    public TmCoownerInfo setCoownerAddrEn(String coownerAddrEn) {
        this.coownerAddrEn = coownerAddrEn;
        return this;
    }
    public String getCoownerAddrEn() {
        return this.coownerAddrEn;
    }

}
