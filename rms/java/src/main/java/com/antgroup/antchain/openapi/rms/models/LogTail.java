// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class LogTail extends TeaModel {
    // 代理IP
    @NameInMap("agent")
    @Validation(required = true)
    public String agent;

    // 应用名
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 日志行数据
    @NameInMap("lines")
    @Validation(required = true)
    public java.util.List<String> lines;

    // collectId
    @NameInMap("nc")
    @Validation(required = true)
    public String nc;

    public static LogTail build(java.util.Map<String, ?> map) throws Exception {
        LogTail self = new LogTail();
        return TeaModel.build(map, self);
    }

    public LogTail setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public LogTail setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public LogTail setLines(java.util.List<String> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<String> getLines() {
        return this.lines;
    }

    public LogTail setNc(String nc) {
        this.nc = nc;
        return this;
    }
    public String getNc() {
        return this.nc;
    }

}
