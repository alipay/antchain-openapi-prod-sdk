// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class PreviewDemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字符串入参
    @NameInMap("input_string")
    @Validation(required = true, maxLength = 1000, minLength = 10)
    public String inputString;

    // Long型入参
    @NameInMap("input_number")
    public Long inputNumber;

    // 布尔型入参
    @NameInMap("input_boolean")
    @Validation(required = true)
    public Boolean inputBoolean;

    // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    @NameInMap("input_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String inputDate;

    // 字符串列表入参
    @NameInMap("input_string_list")
    public java.util.List<String> inputStringList;

    // 示例结构体入参
    @NameInMap("input_struct")
    @Validation(required = true)
    public AbcDemoStruct inputStruct;

    // 结构体数组入参
    @NameInMap("input_struct_list")
    @Validation(required = true)
    public java.util.List<AbcDemoStruct> inputStructList;

    // 123
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static PreviewDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewDemoRequest self = new PreviewDemoRequest();
        return TeaModel.build(map, self);
    }

    public PreviewDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewDemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewDemoRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
    }

    public PreviewDemoRequest setInputNumber(Long inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public Long getInputNumber() {
        return this.inputNumber;
    }

    public PreviewDemoRequest setInputBoolean(Boolean inputBoolean) {
        this.inputBoolean = inputBoolean;
        return this;
    }
    public Boolean getInputBoolean() {
        return this.inputBoolean;
    }

    public PreviewDemoRequest setInputDate(String inputDate) {
        this.inputDate = inputDate;
        return this;
    }
    public String getInputDate() {
        return this.inputDate;
    }

    public PreviewDemoRequest setInputStringList(java.util.List<String> inputStringList) {
        this.inputStringList = inputStringList;
        return this;
    }
    public java.util.List<String> getInputStringList() {
        return this.inputStringList;
    }

    public PreviewDemoRequest setInputStruct(AbcDemoStruct inputStruct) {
        this.inputStruct = inputStruct;
        return this;
    }
    public AbcDemoStruct getInputStruct() {
        return this.inputStruct;
    }

    public PreviewDemoRequest setInputStructList(java.util.List<AbcDemoStruct> inputStructList) {
        this.inputStructList = inputStructList;
        return this;
    }
    public java.util.List<AbcDemoStruct> getInputStructList() {
        return this.inputStructList;
    }

    public PreviewDemoRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PreviewDemoRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PreviewDemoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
