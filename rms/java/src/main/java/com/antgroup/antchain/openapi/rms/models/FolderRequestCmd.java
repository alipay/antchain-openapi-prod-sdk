// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class FolderRequestCmd extends TeaModel {
    // custom_plugin_id
    @NameInMap("custom_plugin_id")
    @Validation(required = true)
    public Long customPluginId;

    // folder_id
    @NameInMap("folder_id")
    @Validation(required = true)
    public Long folderId;

    // include_me
    @NameInMap("include_me")
    @Validation(required = true)
    public Boolean includeMe;

    // include_plugin_name
    @NameInMap("include_plugin_name")
    @Validation(required = true)
    public Boolean includePluginName;

    public static FolderRequestCmd build(java.util.Map<String, ?> map) throws Exception {
        FolderRequestCmd self = new FolderRequestCmd();
        return TeaModel.build(map, self);
    }

    public FolderRequestCmd setCustomPluginId(Long customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }
    public Long getCustomPluginId() {
        return this.customPluginId;
    }

    public FolderRequestCmd setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public FolderRequestCmd setIncludeMe(Boolean includeMe) {
        this.includeMe = includeMe;
        return this;
    }
    public Boolean getIncludeMe() {
        return this.includeMe;
    }

    public FolderRequestCmd setIncludePluginName(Boolean includePluginName) {
        this.includePluginName = includePluginName;
        return this;
    }
    public Boolean getIncludePluginName() {
        return this.includePluginName;
    }

}
