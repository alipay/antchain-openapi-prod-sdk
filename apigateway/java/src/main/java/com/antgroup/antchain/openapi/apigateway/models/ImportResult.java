// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ImportResult extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // 覆盖报错的配置
    @NameInMap("error_config")
    public String errorConfig;

    // error_message
    @NameInMap("error_message")
    public String errorMessage;

    // API的ID
    @NameInMap("id")
    public String id;

    // API的名称
    @NameInMap("name")
    public String name;

    // 覆盖成功的标识
    @NameInMap("success")
    public Boolean success;

    // 覆盖失败的配置名称
    @NameInMap("config_name")
    public String configName;

    public static ImportResult build(java.util.Map<String, ?> map) throws Exception {
        ImportResult self = new ImportResult();
        return TeaModel.build(map, self);
    }

    public ImportResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportResult setErrorConfig(String errorConfig) {
        this.errorConfig = errorConfig;
        return this;
    }
    public String getErrorConfig() {
        return this.errorConfig;
    }

    public ImportResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ImportResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportResult setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

}
