// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ReplayDetailInfo extends TeaModel {
    // 回复人名称
    @NameInMap("replier_name")
    @Validation(required = true)
    public String replierName;

    // 回复人角色
    // 用户：USER
    // 商家：MERCHANT
    // 系统：SYSTEM
    // 审核小二：AUDITOR
    // 政府单位：GOVERNMENT
    @NameInMap("replier_role")
    @Validation(required = true)
    public String replierRole;

    // 回复时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 回复内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 回复图片
    @NameInMap("images")
    @Validation(required = true)
    public java.util.List<String> images;

    public static ReplayDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        ReplayDetailInfo self = new ReplayDetailInfo();
        return TeaModel.build(map, self);
    }

    public ReplayDetailInfo setReplierName(String replierName) {
        this.replierName = replierName;
        return this;
    }
    public String getReplierName() {
        return this.replierName;
    }

    public ReplayDetailInfo setReplierRole(String replierRole) {
        this.replierRole = replierRole;
        return this;
    }
    public String getReplierRole() {
        return this.replierRole;
    }

    public ReplayDetailInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ReplayDetailInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplayDetailInfo setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

}
