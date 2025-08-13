// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OnlinePressureTestTask extends TeaModel {
    // DATE
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间	
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 产线场景码	
    // 
    /**
     * <strong>example:</strong>
     * <p>MAYI-0001 </p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串	
    // 
    /**
     * <strong>example:</strong>
     * <p>[ {&quot;componentId&quot;: &quot;864964060327592&quot;} {&quot;componentId&quot;: &quot;864964060327592&quot;} ]</p>
     */
    @NameInMap("component_id_list")
    @Validation(required = true)
    public String componentIdList;

    // 客户侧的压测报告	
    // 
    /**
     * <strong>example:</strong>
     * <p>[ { &quot;name&quot;:&quot;流量消耗&quot;, &quot;consumption&quot;:&quot;100KB&quot;, &quot;asExpected&quot;:true }, { &quot;name&quot;:&quot;功耗&quot;, &quot;consumption&quot;:&quot;25mA&quot;, &quot;asExpected&quot;:true }, { &quot;name&quot;:&quot;OTA升级&quot; &quot;asExpected&quot;:true } ] } </p>
     */
    @NameInMap("customer_pt_report")
    public String customerPtReport;

    // 压测开始时间	
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("pt_start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String ptStartTime;

    // 压测结束时间	
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("pt_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String ptEndTime;

    // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过	
    // 
    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("pt_status")
    @Validation(required = true)
    public String ptStatus;

    // 关联SIT环境的工单ID	
    // 
    /**
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("work_order_id")
    public String workOrderId;

    // 关联SIT环境的项目ID	
    // 
    /**
     * <strong>example:</strong>
     * <p>11223344</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 产线压测任务ID
    /**
     * <strong>example:</strong>
     * <p>11223344566</p>
     */
    @NameInMap("pt_task_id")
    @Validation(required = true)
    public String ptTaskId;

    // 压测不通过的原因
    /**
     * <strong>example:</strong>
     * <p>数据验签失败</p>
     */
    @NameInMap("failure_reason")
    @Validation(required = true)
    public String failureReason;

    // 拓展信息
    /**
     * <strong>example:</strong>
     * <p>{...}</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

    public static OnlinePressureTestTask build(java.util.Map<String, ?> map) throws Exception {
        OnlinePressureTestTask self = new OnlinePressureTestTask();
        return TeaModel.build(map, self);
    }

    public OnlinePressureTestTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OnlinePressureTestTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OnlinePressureTestTask setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public OnlinePressureTestTask setComponentIdList(String componentIdList) {
        this.componentIdList = componentIdList;
        return this;
    }
    public String getComponentIdList() {
        return this.componentIdList;
    }

    public OnlinePressureTestTask setCustomerPtReport(String customerPtReport) {
        this.customerPtReport = customerPtReport;
        return this;
    }
    public String getCustomerPtReport() {
        return this.customerPtReport;
    }

    public OnlinePressureTestTask setPtStartTime(String ptStartTime) {
        this.ptStartTime = ptStartTime;
        return this;
    }
    public String getPtStartTime() {
        return this.ptStartTime;
    }

    public OnlinePressureTestTask setPtEndTime(String ptEndTime) {
        this.ptEndTime = ptEndTime;
        return this;
    }
    public String getPtEndTime() {
        return this.ptEndTime;
    }

    public OnlinePressureTestTask setPtStatus(String ptStatus) {
        this.ptStatus = ptStatus;
        return this;
    }
    public String getPtStatus() {
        return this.ptStatus;
    }

    public OnlinePressureTestTask setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

    public OnlinePressureTestTask setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public OnlinePressureTestTask setPtTaskId(String ptTaskId) {
        this.ptTaskId = ptTaskId;
        return this;
    }
    public String getPtTaskId() {
        return this.ptTaskId;
    }

    public OnlinePressureTestTask setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    public String getFailureReason() {
        return this.failureReason;
    }

    public OnlinePressureTestTask setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
