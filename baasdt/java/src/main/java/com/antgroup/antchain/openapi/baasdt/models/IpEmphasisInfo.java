// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpEmphasisInfo extends TeaModel {
    // ip的链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // ip的描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // ip类型
    @NameInMap("ip_type")
    @Validation(required = true)
    public String ipType;

    // 受众群体（6位数字） 对应c
    @NameInMap("audience_group")
    @Validation(required = true)
    public String audienceGroup;

    // 主图
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 上架状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 归属的账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 创建日期
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // ip名字
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    public static IpEmphasisInfo build(java.util.Map<String, ?> map) throws Exception {
        IpEmphasisInfo self = new IpEmphasisInfo();
        return TeaModel.build(map, self);
    }

    public IpEmphasisInfo setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IpEmphasisInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpEmphasisInfo setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public IpEmphasisInfo setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public IpEmphasisInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public IpEmphasisInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IpEmphasisInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IpEmphasisInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpEmphasisInfo setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

}
