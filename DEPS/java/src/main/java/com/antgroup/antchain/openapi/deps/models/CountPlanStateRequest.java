// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountPlanStateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // gmt_create_end
    @NameInMap("gmt_create_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreateEnd;

    // gmtCreateStart
    @NameInMap("gmt_create_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreateStart;

    // initial_by_tag
    @NameInMap("initial_by_tag")
    public String initialByTag;

    // name
    @NameInMap("name")
    public String name;

    // ops_modes
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

    // plan ids
    @NameInMap("plan_ids")
    public java.util.List<String> planIds;

    // plan_time_serials_id
    @NameInMap("plan_time_serials_id")
    public String planTimeSerialsId;

    // release_modes
    @NameInMap("release_modes")
    public java.util.List<String> releaseModes;

    // service_name
    @NameInMap("service_name")
    public String serviceName;

    // states
    @NameInMap("states")
    public java.util.List<String> states;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CountPlanStateRequest build(java.util.Map<String, ?> map) throws Exception {
        CountPlanStateRequest self = new CountPlanStateRequest();
        return TeaModel.build(map, self);
    }

    public CountPlanStateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountPlanStateRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public CountPlanStateRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public CountPlanStateRequest setInitialByTag(String initialByTag) {
        this.initialByTag = initialByTag;
        return this;
    }
    public String getInitialByTag() {
        return this.initialByTag;
    }

    public CountPlanStateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CountPlanStateRequest setOpsModes(java.util.List<String> opsModes) {
        this.opsModes = opsModes;
        return this;
    }
    public java.util.List<String> getOpsModes() {
        return this.opsModes;
    }

    public CountPlanStateRequest setOpsTypes(java.util.List<String> opsTypes) {
        this.opsTypes = opsTypes;
        return this;
    }
    public java.util.List<String> getOpsTypes() {
        return this.opsTypes;
    }

    public CountPlanStateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public CountPlanStateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CountPlanStateRequest setPlanIds(java.util.List<String> planIds) {
        this.planIds = planIds;
        return this;
    }
    public java.util.List<String> getPlanIds() {
        return this.planIds;
    }

    public CountPlanStateRequest setPlanTimeSerialsId(String planTimeSerialsId) {
        this.planTimeSerialsId = planTimeSerialsId;
        return this;
    }
    public String getPlanTimeSerialsId() {
        return this.planTimeSerialsId;
    }

    public CountPlanStateRequest setReleaseModes(java.util.List<String> releaseModes) {
        this.releaseModes = releaseModes;
        return this;
    }
    public java.util.List<String> getReleaseModes() {
        return this.releaseModes;
    }

    public CountPlanStateRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CountPlanStateRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

    public CountPlanStateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
