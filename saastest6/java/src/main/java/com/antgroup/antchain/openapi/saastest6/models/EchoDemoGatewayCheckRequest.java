// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saastest6.models;

import com.aliyun.tea.*;

public class EchoDemoGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // demo
    @NameInMap("input_demo")
    public DemoClass inputDemo;

    // echo
    @NameInMap("input_string")
    @Validation(maxLength = 20, minLength = 1)
    public String inputString;

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

    public static EchoDemoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        EchoDemoGatewayCheckRequest self = new EchoDemoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public EchoDemoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EchoDemoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EchoDemoGatewayCheckRequest setInputDemo(DemoClass inputDemo) {
        this.inputDemo = inputDemo;
        return this;
    }
    public DemoClass getInputDemo() {
        return this.inputDemo;
    }

    public EchoDemoGatewayCheckRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
    }

    public EchoDemoGatewayCheckRequest setInputArray(java.util.List<TestStruct> inputArray) {
        this.inputArray = inputArray;
        return this;
    }
    public java.util.List<TestStruct> getInputArray() {
        return this.inputArray;
    }

    public EchoDemoGatewayCheckRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public EchoDemoGatewayCheckRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public EchoDemoGatewayCheckRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public EchoDemoGatewayCheckRequest setInputInt(Long inputInt) {
        this.inputInt = inputInt;
        return this;
    }
    public Long getInputInt() {
        return this.inputInt;
    }

    public EchoDemoGatewayCheckRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
