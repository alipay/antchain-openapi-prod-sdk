// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4a6e73bdbcb54f7dac260ad8ddbfd24a.models;

import com.aliyun.tea.*;

public class SpProvider extends TeaModel {
    // 供应商编号
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 供应商名称
    @NameInMap("sup_name")
    @Validation(required = true)
    public String supName;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件code
    @NameInMap("file_code")
    @Validation(required = true)
    public String fileCode;

    // hash的值
    @NameInMap("hash_code")
    @Validation(required = true)
    public String hashCode;

    // 开始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 结束日期
    @NameInMap("closing_date")
    @Validation(required = true)
    public String closingDate;

    // 文件路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 2021-03-04 11:16:23
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    // 创建者
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    public static SpProvider build(java.util.Map<String, ?> map) throws Exception {
        SpProvider self = new SpProvider();
        return TeaModel.build(map, self);
    }

    public SpProvider setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public SpProvider setSupName(String supName) {
        this.supName = supName;
        return this;
    }
    public String getSupName() {
        return this.supName;
    }

    public SpProvider setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SpProvider setFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }
    public String getFileCode() {
        return this.fileCode;
    }

    public SpProvider setHashCode(String hashCode) {
        this.hashCode = hashCode;
        return this;
    }
    public String getHashCode() {
        return this.hashCode;
    }

    public SpProvider setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public SpProvider setClosingDate(String closingDate) {
        this.closingDate = closingDate;
        return this;
    }
    public String getClosingDate() {
        return this.closingDate;
    }

    public SpProvider setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SpProvider setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public SpProvider setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

}
