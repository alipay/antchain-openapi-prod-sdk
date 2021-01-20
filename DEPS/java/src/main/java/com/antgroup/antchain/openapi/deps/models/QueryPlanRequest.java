// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryPlanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // gmtCreateEnd
    @NameInMap("gmt_create_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreateEnd;

    // gmtCreateStart
    @NameInMap("gmt_create_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreateStart;

    // initialByTag
    @NameInMap("initial_by_tag")
    public String initialByTag;

    // name
    @NameInMap("name")
    public String name;

    // opsModes
    @NameInMap("ops_modes")
    public java.util.List<String> opsModes;

    // ops_types
    @NameInMap("ops_types")
    public java.util.List<String> opsTypes;

    // page no
    @NameInMap("page_no")
    public Long pageNo;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // plan_ids
    @NameInMap("plan_ids")
    public java.util.List<String> planIds;

    // plan_time_serials_id
    @NameInMap("plan_time_serials_id")
    public String planTimeSerialsId;

    // releaseModes
    @NameInMap("release_modes")
    public java.util.List<String> releaseModes;

    // serviceName
    @NameInMap("service_name")
    public String serviceName;

    // states
    @NameInMap("states")
    public java.util.List<String> states;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPlanRequest self = new QueryPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPlanRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public QueryPlanRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public QueryPlanRequest setInitialByTag(String initialByTag) {
        this.initialByTag = initialByTag;
        return this;
    }
    public String getInitialByTag() {
        return this.initialByTag;
    }

    public QueryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryPlanRequest setOpsModes(java.util.List<String> opsModes) {
        this.opsModes = opsModes;
        return this;
    }
    public java.util.List<String> getOpsModes() {
        return this.opsModes;
    }

    public QueryPlanRequest setOpsTypes(java.util.List<String> opsTypes) {
        this.opsTypes = opsTypes;
        return this;
    }
    public java.util.List<String> getOpsTypes() {
        return this.opsTypes;
    }

    public QueryPlanRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryPlanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPlanRequest setPlanIds(java.util.List<String> planIds) {
        this.planIds = planIds;
        return this;
    }
    public java.util.List<String> getPlanIds() {
        return this.planIds;
    }

    public QueryPlanRequest setPlanTimeSerialsId(String planTimeSerialsId) {
        this.planTimeSerialsId = planTimeSerialsId;
        return this;
    }
    public String getPlanTimeSerialsId() {
        return this.planTimeSerialsId;
    }

    public QueryPlanRequest setReleaseModes(java.util.List<String> releaseModes) {
        this.releaseModes = releaseModes;
        return this;
    }
    public java.util.List<String> getReleaseModes() {
        return this.releaseModes;
    }

    public QueryPlanRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryPlanRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

    public QueryPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
