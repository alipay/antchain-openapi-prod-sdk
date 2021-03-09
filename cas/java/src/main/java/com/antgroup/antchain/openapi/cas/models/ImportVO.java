// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportVO extends TeaModel {
    // is_imported
    @NameInMap("is_imported")
    @Validation(required = true)
    public Boolean isImported;

    // imported_workspace_name
    @NameInMap("imported_workspace_name")
    @Validation(required = true)
    public String importedWorkspaceName;

    // is_unimportable
    @NameInMap("is_unimportable")
    public Boolean isUnimportable;

    // unimportable_reason
    @NameInMap("unimportable_reason")
    public String unimportableReason;

    public static ImportVO build(java.util.Map<String, ?> map) throws Exception {
        ImportVO self = new ImportVO();
        return TeaModel.build(map, self);
    }

    public ImportVO setIsImported(Boolean isImported) {
        this.isImported = isImported;
        return this;
    }
    public Boolean getIsImported() {
        return this.isImported;
    }

    public ImportVO setImportedWorkspaceName(String importedWorkspaceName) {
        this.importedWorkspaceName = importedWorkspaceName;
        return this;
    }
    public String getImportedWorkspaceName() {
        return this.importedWorkspaceName;
    }

    public ImportVO setIsUnimportable(Boolean isUnimportable) {
        this.isUnimportable = isUnimportable;
        return this;
    }
    public Boolean getIsUnimportable() {
        return this.isUnimportable;
    }

    public ImportVO setUnimportableReason(String unimportableReason) {
        this.unimportableReason = unimportableReason;
        return this;
    }
    public String getUnimportableReason() {
        return this.unimportableReason;
    }

}
