// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DataSourceInterface extends TeaModel {
    // 数据源接口访问地址
    /**
     * <strong>example:</strong>
     * <p>https://******</p>
     */
    @NameInMap("address")
    @Validation(required = true, maxLength = 100)
    public String address;

    // 数据源接口请求方法类型
    /**
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("interface_request_method")
    @Validation(required = true, maxLength = 50)
    public String interfaceRequestMethod;

    // 数据源接口入参列表
    @NameInMap("interface_input")
    public java.util.List<InterfaceInput> interfaceInput;

    // 数据源接口出参列表
    @NameInMap("interface_output")
    public java.util.List<InterfaceOutput> interfaceOutput;

    public static DataSourceInterface build(java.util.Map<String, ?> map) throws Exception {
        DataSourceInterface self = new DataSourceInterface();
        return TeaModel.build(map, self);
    }

    public DataSourceInterface setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DataSourceInterface setInterfaceRequestMethod(String interfaceRequestMethod) {
        this.interfaceRequestMethod = interfaceRequestMethod;
        return this;
    }
    public String getInterfaceRequestMethod() {
        return this.interfaceRequestMethod;
    }

    public DataSourceInterface setInterfaceInput(java.util.List<InterfaceInput> interfaceInput) {
        this.interfaceInput = interfaceInput;
        return this;
    }
    public java.util.List<InterfaceInput> getInterfaceInput() {
        return this.interfaceInput;
    }

    public DataSourceInterface setInterfaceOutput(java.util.List<InterfaceOutput> interfaceOutput) {
        this.interfaceOutput = interfaceOutput;
        return this;
    }
    public java.util.List<InterfaceOutput> getInterfaceOutput() {
        return this.interfaceOutput;
    }

}
