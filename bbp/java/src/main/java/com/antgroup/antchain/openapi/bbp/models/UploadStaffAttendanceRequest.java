// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class UploadStaffAttendanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 考勤信息
    @NameInMap("attendance")
    @Validation(required = true)
    public Attendance attendance;

    // uuid就行
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    public static UploadStaffAttendanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStaffAttendanceRequest self = new UploadStaffAttendanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadStaffAttendanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadStaffAttendanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadStaffAttendanceRequest setAttendance(Attendance attendance) {
        this.attendance = attendance;
        return this;
    }
    public Attendance getAttendance() {
        return this.attendance;
    }

    public UploadStaffAttendanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
