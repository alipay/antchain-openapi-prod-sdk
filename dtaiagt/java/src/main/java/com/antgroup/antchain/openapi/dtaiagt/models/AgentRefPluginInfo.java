// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentRefPluginInfo extends TeaModel {
    // 工具id
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 构建版本号
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;v1.0.0&quot; </p>
     */
    @NameInMap("build_version")
    @Validation(required = true)
    public String buildVersion;

    // 入参预设值表 Map<String,String> 格式
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("param_value_map")
    @Validation(required = true)
    public String paramValueMap;

    // 关联的语料
    @NameInMap("corpus")
    @Validation(required = true)
    public java.util.List<String> corpus;

    public static AgentRefPluginInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentRefPluginInfo self = new AgentRefPluginInfo();
        return TeaModel.build(map, self);
    }

    public AgentRefPluginInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AgentRefPluginInfo setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }
    public String getBuildVersion() {
        return this.buildVersion;
    }

    public AgentRefPluginInfo setParamValueMap(String paramValueMap) {
        this.paramValueMap = paramValueMap;
        return this;
    }
    public String getParamValueMap() {
        return this.paramValueMap;
    }

    public AgentRefPluginInfo setCorpus(java.util.List<String> corpus) {
        this.corpus = corpus;
        return this;
    }
    public java.util.List<String> getCorpus() {
        return this.corpus;
    }

}
