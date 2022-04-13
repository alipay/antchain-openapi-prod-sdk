// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Volume extends TeaModel {
    // 主机目录[仅针对HostPath类型volume有效]
    @NameInMap("host_path")
    public String hostPath;

    // Volume名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 关联的资源名称。
    @NameInMap("ref_resource_name")
    public String refResourceName;

    //  LOCAL_STORAGE：主机挂载|CONFIGMAP：配置项|SECRET：保密字典
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // Volume是否只读
    @NameInMap("read_only")
    public Boolean readOnly;

    public static Volume build(java.util.Map<String, ?> map) throws Exception {
        Volume self = new Volume();
        return TeaModel.build(map, self);
    }

    public Volume setHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }
    public String getHostPath() {
        return this.hostPath;
    }

    public Volume setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Volume setRefResourceName(String refResourceName) {
        this.refResourceName = refResourceName;
        return this;
    }
    public String getRefResourceName() {
        return this.refResourceName;
    }

    public Volume setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Volume setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
