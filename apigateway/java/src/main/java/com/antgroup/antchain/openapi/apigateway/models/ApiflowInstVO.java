// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowInstVO extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // machine_inst_id
    @NameInMap("machine_inst_id")
    public String machineInstId;

    // name
    @NameInMap("name")
    public String name;

    // type
    @NameInMap("type")
    public String type;

    // service_name
    @NameInMap("service_name")
    public String serviceName;

    // service_method
    @NameInMap("service_method")
    public String serviceMethod;

    // service_type
    @NameInMap("service_type")
    public String serviceType;

    // business_key
    @NameInMap("business_key")
    public String businessKey;

    // state_id_compensated_for
    @NameInMap("state_id_compensated_for")
    public String stateIdCompensatedFor;

    // state_id_retried_for
    @NameInMap("state_id_retried_for")
    public String stateIdRetriedFor;

    // gmt_started
    @NameInMap("gmt_started")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtStarted;

    // is_for_update
    @NameInMap("is_for_update")
    public Boolean isForUpdate;

    // input_params
    @NameInMap("input_params")
    public String inputParams;

    // output_params
    @NameInMap("output_params")
    public String outputParams;

    // status
    @NameInMap("status")
    public String status;

    // excep
    @NameInMap("excep")
    public String excep;

    // gmt_updated
    @NameInMap("gmt_updated")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtUpdated;

    // gmt_end
    @NameInMap("gmt_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtEnd;

    public static ApiflowInstVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowInstVO self = new ApiflowInstVO();
        return TeaModel.build(map, self);
    }

    public ApiflowInstVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ApiflowInstVO setMachineInstId(String machineInstId) {
        this.machineInstId = machineInstId;
        return this;
    }
    public String getMachineInstId() {
        return this.machineInstId;
    }

    public ApiflowInstVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiflowInstVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiflowInstVO setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ApiflowInstVO setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        return this;
    }
    public String getServiceMethod() {
        return this.serviceMethod;
    }

    public ApiflowInstVO setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ApiflowInstVO setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }
    public String getBusinessKey() {
        return this.businessKey;
    }

    public ApiflowInstVO setStateIdCompensatedFor(String stateIdCompensatedFor) {
        this.stateIdCompensatedFor = stateIdCompensatedFor;
        return this;
    }
    public String getStateIdCompensatedFor() {
        return this.stateIdCompensatedFor;
    }

    public ApiflowInstVO setStateIdRetriedFor(String stateIdRetriedFor) {
        this.stateIdRetriedFor = stateIdRetriedFor;
        return this;
    }
    public String getStateIdRetriedFor() {
        return this.stateIdRetriedFor;
    }

    public ApiflowInstVO setGmtStarted(String gmtStarted) {
        this.gmtStarted = gmtStarted;
        return this;
    }
    public String getGmtStarted() {
        return this.gmtStarted;
    }

    public ApiflowInstVO setIsForUpdate(Boolean isForUpdate) {
        this.isForUpdate = isForUpdate;
        return this;
    }
    public Boolean getIsForUpdate() {
        return this.isForUpdate;
    }

    public ApiflowInstVO setInputParams(String inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public String getInputParams() {
        return this.inputParams;
    }

    public ApiflowInstVO setOutputParams(String outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public String getOutputParams() {
        return this.outputParams;
    }

    public ApiflowInstVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiflowInstVO setExcep(String excep) {
        this.excep = excep;
        return this;
    }
    public String getExcep() {
        return this.excep;
    }

    public ApiflowInstVO setGmtUpdated(String gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
        return this;
    }
    public String getGmtUpdated() {
        return this.gmtUpdated;
    }

    public ApiflowInstVO setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

}
