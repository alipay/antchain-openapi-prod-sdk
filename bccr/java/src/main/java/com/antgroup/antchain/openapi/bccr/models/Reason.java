// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class Reason extends TeaModel {
    // 事由ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("reason_id")
    @Validation(required = true)
    public String reasonId;

    // 事由名称
    /**
     * <strong>example:</strong>
     * <p>商标权/名誉权/著作权</p>
     */
    @NameInMap("reason_name")
    @Validation(required = true)
    public String reasonName;

    // 附件文字说明
    /**
     * <strong>example:</strong>
     * <p>这是一个说明</p>
     */
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 排序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sort")
    @Validation(required = true)
    public Long sort;

    // 是否必须上传附件
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_need_attachment")
    @Validation(required = true)
    public Boolean isNeedAttachment;

    public static Reason build(java.util.Map<String, ?> map) throws Exception {
        Reason self = new Reason();
        return TeaModel.build(map, self);
    }

    public Reason setReasonId(String reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    public String getReasonId() {
        return this.reasonId;
    }

    public Reason setReasonName(String reasonName) {
        this.reasonName = reasonName;
        return this;
    }
    public String getReasonName() {
        return this.reasonName;
    }

    public Reason setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Reason setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public Reason setIsNeedAttachment(Boolean isNeedAttachment) {
        this.isNeedAttachment = isNeedAttachment;
        return this;
    }
    public Boolean getIsNeedAttachment() {
        return this.isNeedAttachment;
    }

}
