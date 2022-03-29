// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Log extends TeaModel {
    // 应用名列表
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<String> apps;

    // 采集日志文件
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 日志编码
    @NameInMap("charset")
    public String charset;

    // 日志限制流量，单位KB/min
    @NameInMap("agent_limit_k_b")
    public Long agentLimitKB;

    // 日志路径软连接描述
    @NameInMap("symlink_path")
    public String symlinkPath;

    public static Log build(java.util.Map<String, ?> map) throws Exception {
        Log self = new Log();
        return TeaModel.build(map, self);
    }

    public Log setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public Log setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public Log setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public Log setAgentLimitKB(Long agentLimitKB) {
        this.agentLimitKB = agentLimitKB;
        return this;
    }
    public Long getAgentLimitKB() {
        return this.agentLimitKB;
    }

    public Log setSymlinkPath(String symlinkPath) {
        this.symlinkPath = symlinkPath;
        return this;
    }
    public String getSymlinkPath() {
        return this.symlinkPath;
    }

}
