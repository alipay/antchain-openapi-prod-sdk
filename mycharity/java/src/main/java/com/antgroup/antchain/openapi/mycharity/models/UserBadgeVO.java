// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UserBadgeVO extends TeaModel {
    // 用户徽章id
    @NameInMap("poap_id")
    public String poapId;

    // 徽章hash
    @NameInMap("poap_id_hash")
    public String poapIdHash;

    // 徽章图片
    @NameInMap("logo_url")
    public String logoUrl;

    // 徽章名称
    @NameInMap("name")
    public String name;

    // 徽章简介
    @NameInMap("introduction")
    public String introduction;

    // 品牌商名称
    @NameInMap("brands_name")
    public String brandsName;

    // 公益机构名称
    @NameInMap("org_name")
    public String orgName;

    public static UserBadgeVO build(java.util.Map<String, ?> map) throws Exception {
        UserBadgeVO self = new UserBadgeVO();
        return TeaModel.build(map, self);
    }

    public UserBadgeVO setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

    public UserBadgeVO setPoapIdHash(String poapIdHash) {
        this.poapIdHash = poapIdHash;
        return this;
    }
    public String getPoapIdHash() {
        return this.poapIdHash;
    }

    public UserBadgeVO setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public UserBadgeVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserBadgeVO setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UserBadgeVO setBrandsName(String brandsName) {
        this.brandsName = brandsName;
        return this;
    }
    public String getBrandsName() {
        return this.brandsName;
    }

    public UserBadgeVO setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

}
