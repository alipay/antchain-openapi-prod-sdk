// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_96c72ef879f04758909898e2412a9789.models;

import com.aliyun.tea.*;

public class PreviewAntchainAbcDemoRequest extends TeaModel {
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
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static PreviewAntchainAbcDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewAntchainAbcDemoRequest self = new PreviewAntchainAbcDemoRequest();
        return TeaModel.build(map, self);
    }

    public PreviewAntchainAbcDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewAntchainAbcDemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewAntchainAbcDemoRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
    }

    public PreviewAntchainAbcDemoRequest setInputNumber(Long inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public Long getInputNumber() {
        return this.inputNumber;
    }

    public PreviewAntchainAbcDemoRequest setInputBoolean(Boolean inputBoolean) {
        this.inputBoolean = inputBoolean;
        return this;
    }
    public Boolean getInputBoolean() {
        return this.inputBoolean;
    }

    public PreviewAntchainAbcDemoRequest setInputDate(String inputDate) {
        this.inputDate = inputDate;
        return this;
    }
    public String getInputDate() {
        return this.inputDate;
    }

    public PreviewAntchainAbcDemoRequest setInputStringList(java.util.List<String> inputStringList) {
        this.inputStringList = inputStringList;
        return this;
    }
    public java.util.List<String> getInputStringList() {
        return this.inputStringList;
    }

    public PreviewAntchainAbcDemoRequest setInputStruct(AbcDemoStruct inputStruct) {
        this.inputStruct = inputStruct;
        return this;
    }
    public AbcDemoStruct getInputStruct() {
        return this.inputStruct;
    }

    public PreviewAntchainAbcDemoRequest setInputStructList(java.util.List<AbcDemoStruct> inputStructList) {
        this.inputStructList = inputStructList;
        return this;
    }
    public java.util.List<AbcDemoStruct> getInputStructList() {
        return this.inputStructList;
    }

    public PreviewAntchainAbcDemoRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PreviewAntchainAbcDemoRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PreviewAntchainAbcDemoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
