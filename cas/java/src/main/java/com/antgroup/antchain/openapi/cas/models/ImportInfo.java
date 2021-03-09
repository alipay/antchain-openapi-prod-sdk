// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportInfo extends TeaModel {
    // 已导入的workspace name
    @NameInMap("imported_workspace_name")
    public String importedWorkspaceName;

    // vpc是否已导入workspace
    @NameInMap("is_imported")
    public Boolean isImported;

    // 是否可以删除已导入的workspace
    @NameInMap("is_unimportable")
    public Boolean isUnimportable;

    // 不可删除已导入workspace的原因
    @NameInMap("unimportable_reason")
    public String unimportableReason;

    public static ImportInfo build(java.util.Map<String, ?> map) throws Exception {
        ImportInfo self = new ImportInfo();
        return TeaModel.build(map, self);
    }

    public ImportInfo setImportedWorkspaceName(String importedWorkspaceName) {
        this.importedWorkspaceName = importedWorkspaceName;
        return this;
    }
    public String getImportedWorkspaceName() {
        return this.importedWorkspaceName;
    }

    public ImportInfo setIsImported(Boolean isImported) {
        this.isImported = isImported;
        return this;
    }
    public Boolean getIsImported() {
        return this.isImported;
    }

    public ImportInfo setIsUnimportable(Boolean isUnimportable) {
        this.isUnimportable = isUnimportable;
        return this;
    }
    public Boolean getIsUnimportable() {
        return this.isUnimportable;
    }

    public ImportInfo setUnimportableReason(String unimportableReason) {
        this.unimportableReason = unimportableReason;
        return this;
    }
    public String getUnimportableReason() {
        return this.unimportableReason;
    }

}
