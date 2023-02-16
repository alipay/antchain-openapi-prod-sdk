// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ehcaiops.models;

import com.aliyun.tea.*;

public class ImportCloudLogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务码
    @NameInMap("bus_code")
    @Validation(required = true)
    public String busCode;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 日志报文
    @NameInMap("log_message")
    @Validation(required = true)
    public String logMessage;

    // 是否批量上传
    @NameInMap("batch_import")
    public Boolean batchImport;

    // 日志行内元素分隔符，默认|
    @NameInMap("element_separator")
    public String elementSeparator;

    // 日志行分隔符，默认$
    @NameInMap("line_separator")
    public String lineSeparator;

    public static ImportCloudLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCloudLogRequest self = new ImportCloudLogRequest();
        return TeaModel.build(map, self);
    }

    public ImportCloudLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportCloudLogRequest setBusCode(String busCode) {
        this.busCode = busCode;
        return this;
    }
    public String getBusCode() {
        return this.busCode;
    }

    public ImportCloudLogRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ImportCloudLogRequest setLogMessage(String logMessage) {
        this.logMessage = logMessage;
        return this;
    }
    public String getLogMessage() {
        return this.logMessage;
    }

    public ImportCloudLogRequest setBatchImport(Boolean batchImport) {
        this.batchImport = batchImport;
        return this;
    }
    public Boolean getBatchImport() {
        return this.batchImport;
    }

    public ImportCloudLogRequest setElementSeparator(String elementSeparator) {
        this.elementSeparator = elementSeparator;
        return this;
    }
    public String getElementSeparator() {
        return this.elementSeparator;
    }

    public ImportCloudLogRequest setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
        return this;
    }
    public String getLineSeparator() {
        return this.lineSeparator;
    }

}
