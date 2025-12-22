// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ReplyDetailInfo extends TeaModel {
    // 回复人名称
    /**
     * <strong>example:</strong>
     * <p>刘*</p>
     */
    @NameInMap("replier_name")
    @Validation(required = true)
    public String replierName;

    // 回复人角色 用户：USER 商家：MERCHANT 系统：SYSTEM 审核小二：AUDITOR 政府单位：GOVERNMENT
    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("replier_role")
    @Validation(required = true)
    public String replierRole;

    // 回复时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2020-02-14 14:23:12 </p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 回复内容
    /**
     * <strong>example:</strong>
     * <p>已退款退货给您，物流单号为：12344444 </p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 回复图片
    @NameInMap("images")
    @Validation(required = true)
    public java.util.List<String> images;

    public static ReplyDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        ReplyDetailInfo self = new ReplyDetailInfo();
        return TeaModel.build(map, self);
    }

    public ReplyDetailInfo setReplierName(String replierName) {
        this.replierName = replierName;
        return this;
    }
    public String getReplierName() {
        return this.replierName;
    }

    public ReplyDetailInfo setReplierRole(String replierRole) {
        this.replierRole = replierRole;
        return this;
    }
    public String getReplierRole() {
        return this.replierRole;
    }

    public ReplyDetailInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ReplyDetailInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplyDetailInfo setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

}
