// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class Residency extends TeaModel {
    // 证件是否最新（1 最新、0非最新）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_newest")
    public String isNewest;

    // 证件是否挂失（1 挂失、0非挂失）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_losted")
    public String isLosted;

    // 证件是否过期（1 过期、0非过期）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_expired")
    public String isExpired;

    // 户籍状态
    // 0 有效
    // 1 有效（户籍迁出，但未迁入）
    // 2 无效（死亡、失踪、迁出、服 兵役、出国境定居、消除重复登记人口、冻结户口、重载注销等）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("residency_status")
    public String residencyStatus;

    public static Residency build(java.util.Map<String, ?> map) throws Exception {
        Residency self = new Residency();
        return TeaModel.build(map, self);
    }

    public Residency setIsNewest(String isNewest) {
        this.isNewest = isNewest;
        return this;
    }
    public String getIsNewest() {
        return this.isNewest;
    }

    public Residency setIsLosted(String isLosted) {
        this.isLosted = isLosted;
        return this;
    }
    public String getIsLosted() {
        return this.isLosted;
    }

    public Residency setIsExpired(String isExpired) {
        this.isExpired = isExpired;
        return this;
    }
    public String getIsExpired() {
        return this.isExpired;
    }

    public Residency setResidencyStatus(String residencyStatus) {
        this.residencyStatus = residencyStatus;
        return this;
    }
    public String getResidencyStatus() {
        return this.residencyStatus;
    }

}
