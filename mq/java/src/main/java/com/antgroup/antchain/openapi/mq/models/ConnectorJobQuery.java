// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorJobQuery extends TeaModel {
    // 任务名称
    @NameInMap("name")
    public String name;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 排序的列
    @NameInMap("sort_column")
    public String sortColumn;

    // increment代表升序排序，decrement代表降序排序。
    // 
    @NameInMap("sort_type")
    public String sortType;

    // 应用名
    @NameInMap("app")
    public String app;

    // 审批状态
    @NameInMap("process_status")
    public String processStatus;

    public static ConnectorJobQuery build(java.util.Map<String, ?> map) throws Exception {
        ConnectorJobQuery self = new ConnectorJobQuery();
        return TeaModel.build(map, self);
    }

    public ConnectorJobQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectorJobQuery setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConnectorJobQuery setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public ConnectorJobQuery setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ConnectorJobQuery setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ConnectorJobQuery setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

}
