// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineInstVO extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // machine_id
    @NameInMap("machine_id")
    public String machineId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // parent_id
    @NameInMap("parent_id")
    public String parentId;

    // gmt_started
    @NameInMap("gmt_started")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtStarted;

    // business_key
    @NameInMap("business_key")
    public String businessKey;

    // start_params
    @NameInMap("start_params")
    public String startParams;

    // gmt_end
    @NameInMap("gmt_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtEnd;

    // excep
    @NameInMap("excep")
    public String excep;

    // end_params
    @NameInMap("end_params")
    public String endParams;

    // status
    @NameInMap("status")
    public String status;

    // compensation_status
    @NameInMap("compensation_status")
    public String compensationStatus;

    // is_running
    @NameInMap("is_running")
    public Boolean isRunning;

    // gmt_updated
    @NameInMap("gmt_updated")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtUpdated;

    public static ApiflowMachineInstVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineInstVO self = new ApiflowMachineInstVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineInstVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ApiflowMachineInstVO setMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public ApiflowMachineInstVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiflowMachineInstVO setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public ApiflowMachineInstVO setGmtStarted(String gmtStarted) {
        this.gmtStarted = gmtStarted;
        return this;
    }
    public String getGmtStarted() {
        return this.gmtStarted;
    }

    public ApiflowMachineInstVO setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }
    public String getBusinessKey() {
        return this.businessKey;
    }

    public ApiflowMachineInstVO setStartParams(String startParams) {
        this.startParams = startParams;
        return this;
    }
    public String getStartParams() {
        return this.startParams;
    }

    public ApiflowMachineInstVO setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public ApiflowMachineInstVO setExcep(String excep) {
        this.excep = excep;
        return this;
    }
    public String getExcep() {
        return this.excep;
    }

    public ApiflowMachineInstVO setEndParams(String endParams) {
        this.endParams = endParams;
        return this;
    }
    public String getEndParams() {
        return this.endParams;
    }

    public ApiflowMachineInstVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiflowMachineInstVO setCompensationStatus(String compensationStatus) {
        this.compensationStatus = compensationStatus;
        return this;
    }
    public String getCompensationStatus() {
        return this.compensationStatus;
    }

    public ApiflowMachineInstVO setIsRunning(Boolean isRunning) {
        this.isRunning = isRunning;
        return this;
    }
    public Boolean getIsRunning() {
        return this.isRunning;
    }

    public ApiflowMachineInstVO setGmtUpdated(String gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
        return this;
    }
    public String getGmtUpdated() {
        return this.gmtUpdated;
    }

}
