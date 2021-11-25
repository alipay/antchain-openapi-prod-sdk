// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class BatchcreateWorkersAttendanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 农民工考勤信息
    @NameInMap("attendance_list")
    @Validation(required = true)
    public java.util.List<WorkersCheckAttendance> attendanceList;

    public static BatchcreateWorkersAttendanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateWorkersAttendanceRequest self = new BatchcreateWorkersAttendanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateWorkersAttendanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateWorkersAttendanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateWorkersAttendanceRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public BatchcreateWorkersAttendanceRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public BatchcreateWorkersAttendanceRequest setAttendanceList(java.util.List<WorkersCheckAttendance> attendanceList) {
        this.attendanceList = attendanceList;
        return this;
    }
    public java.util.List<WorkersCheckAttendance> getAttendanceList() {
        return this.attendanceList;
    }

}
