// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class EchoGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // input_array
    @NameInMap("input_array")
    @Validation(required = true)
    public java.util.List<TestStruct> inputArray;

    // file_id
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 1
    @NameInMap("input_int")
    @Validation(required = true, maximum = 40, minimum = 10)
    public Long inputInt;

    // 测试一下
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 123
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    public static EchoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        EchoGatewayCheckRequest self = new EchoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public EchoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EchoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EchoGatewayCheckRequest setInputArray(java.util.List<TestStruct> inputArray) {
        this.inputArray = inputArray;
        return this;
    }
    public java.util.List<TestStruct> getInputArray() {
        return this.inputArray;
    }

    public EchoGatewayCheckRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public EchoGatewayCheckRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public EchoGatewayCheckRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public EchoGatewayCheckRequest setInputInt(Long inputInt) {
        this.inputInt = inputInt;
        return this;
    }
    public Long getInputInt() {
        return this.inputInt;
    }

    public EchoGatewayCheckRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public EchoGatewayCheckRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
