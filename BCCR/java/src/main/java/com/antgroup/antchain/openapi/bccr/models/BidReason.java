// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class BidReason extends TeaModel {
    // 事由类别ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 分类名称
    /**
     * <strong>example:</strong>
     * <p>维权/合同纠纷</p>
     */
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>这是一个描述</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 文件上传描述
    /**
     * <strong>example:</strong>
     * <p>这是一个文件上传描述</p>
     */
    @NameInMap("file_upload_desc")
    @Validation(required = true)
    public String fileUploadDesc;

    // 排序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rank")
    @Validation(required = true)
    public Long rank;

    // 是否必须上传证明文件
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_need_testify_file")
    @Validation(required = true)
    public Boolean isNeedTestifyFile;

    // reasonArray
    @NameInMap("reason_array")
    @Validation(required = true)
    public java.util.List<Reason> reasonArray;

    public static BidReason build(java.util.Map<String, ?> map) throws Exception {
        BidReason self = new BidReason();
        return TeaModel.build(map, self);
    }

    public BidReason setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public BidReason setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public BidReason setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public BidReason setFileUploadDesc(String fileUploadDesc) {
        this.fileUploadDesc = fileUploadDesc;
        return this;
    }
    public String getFileUploadDesc() {
        return this.fileUploadDesc;
    }

    public BidReason setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

    public BidReason setIsNeedTestifyFile(Boolean isNeedTestifyFile) {
        this.isNeedTestifyFile = isNeedTestifyFile;
        return this;
    }
    public Boolean getIsNeedTestifyFile() {
        return this.isNeedTestifyFile;
    }

    public BidReason setReasonArray(java.util.List<Reason> reasonArray) {
        this.reasonArray = reasonArray;
        return this;
    }
    public java.util.List<Reason> getReasonArray() {
        return this.reasonArray;
    }

}
