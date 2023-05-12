// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ActionInfo extends TeaModel {
    // action_mode
    @NameInMap("action_mode")
    public String actionMode;

    // action_name
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // commit
    @NameInMap("commit")
    @Validation(required = true)
    public String commit;

    // rollback
    @NameInMap("rollback")
    @Validation(required = true)
    public String rollback;

    // ws_tr
    @NameInMap("ws_tr")
    @Validation(required = true)
    public String wsTr;

    public static ActionInfo build(java.util.Map<String, ?> map) throws Exception {
        ActionInfo self = new ActionInfo();
        return TeaModel.build(map, self);
    }

    public ActionInfo setActionMode(String actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public String getActionMode() {
        return this.actionMode;
    }

    public ActionInfo setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ActionInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ActionInfo setCommit(String commit) {
        this.commit = commit;
        return this;
    }
    public String getCommit() {
        return this.commit;
    }

    public ActionInfo setRollback(String rollback) {
        this.rollback = rollback;
        return this;
    }
    public String getRollback() {
        return this.rollback;
    }

    public ActionInfo setWsTr(String wsTr) {
        this.wsTr = wsTr;
        return this;
    }
    public String getWsTr() {
        return this.wsTr;
    }

}
