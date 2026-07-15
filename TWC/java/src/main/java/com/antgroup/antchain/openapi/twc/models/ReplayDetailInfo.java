// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ReplayDetailInfo extends TeaModel {
    // 回复人名称
    /**
     * <strong>example:</strong>
     * <p>刘*</p>
     */
    @NameInMap("replier_name")
    @Validation(required = true)
    public String replierName;

    // 回复人角色
    // 用户：USER
    // 商家：MERCHANT
    // 系统：SYSTEM
    // 审核小二：AUDITOR
    // 政府单位：GOVERNMENT
    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("replier_role")
    @Validation(required = true)
    public String replierRole;

    // 回复时间
    /**
     * <strong>example:</strong>
     * <p>2020-02-14 14:23:12</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 回复内容
    /**
     * <strong>example:</strong>
     * <p>已退款退货给您，物流单号为：12344444</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 回复图片
    /**
     * <strong>example:</strong>
     * <p><a href="http://mdn.alipay.com/wsdk/img?fileid=A*ME4GQq2j-5oAAAAAAAAAAAAAAQAAAQ&t=83fed12ef006ebcd8df04dfe79faad6c&bi=openpunsh&ts=0&zoom=original">http://mdn.alipay.com/wsdk/img?fileid=A*ME4GQq2j-5oAAAAAAAAAAAAAAQAAAQ&amp;t=83fed12ef006ebcd8df04dfe79faad6c&amp;bi=openpunsh&amp;ts=0&amp;zoom=original</a></p>
     */
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
