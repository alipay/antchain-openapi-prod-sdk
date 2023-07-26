// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractTemplateResp extends TeaModel {
    // 模板标识
    @NameInMap("template_id")
    public String templateId;

    // 合约名称
    @NameInMap("name")
    public String name;

    // 缩略图url
    @NameInMap("thumb_url")
    public String thumbUrl;

    // 合约描述
    @NameInMap("description")
    public String description;

    // 是否已开通合约
    @NameInMap("open")
    public Boolean open;

    // 后续展示：购买用户头像
    @NameInMap("avatar_logo_list")
    public java.util.List<String> avatarLogoList;

    public static ContractTemplateResp build(java.util.Map<String, ?> map) throws Exception {
        ContractTemplateResp self = new ContractTemplateResp();
        return TeaModel.build(map, self);
    }

    public ContractTemplateResp setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ContractTemplateResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractTemplateResp setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }
    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public ContractTemplateResp setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ContractTemplateResp setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public ContractTemplateResp setAvatarLogoList(java.util.List<String> avatarLogoList) {
        this.avatarLogoList = avatarLogoList;
        return this;
    }
    public java.util.List<String> getAvatarLogoList() {
        return this.avatarLogoList;
    }

}
