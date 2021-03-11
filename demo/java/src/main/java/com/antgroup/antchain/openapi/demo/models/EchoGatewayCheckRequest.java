// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class EchoGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 1
    @NameInMap("input_int")
    @Validation(required = true, maximum = 40, minimum = 10)
    public Long inputInt;

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

    public EchoGatewayCheckRequest setInputDemo(DemoClass inputDemo) {
        this.inputDemo = inputDemo;
        return this;
    }
    public DemoClass getInputDemo() {
        return this.inputDemo;
    }

    public EchoGatewayCheckRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
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

}
