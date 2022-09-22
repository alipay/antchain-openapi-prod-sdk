// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListEmergencyPlansRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 预案名称
    @NameInMap("name")
    public String name;

    // 当前第几页
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 预案id，只有传预案id时才返回预案参数
    @NameInMap("emergency_plan_id")
    public String emergencyPlanId;

    public static ListEmergencyPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEmergencyPlansRequest self = new ListEmergencyPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListEmergencyPlansRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListEmergencyPlansRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEmergencyPlansRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEmergencyPlansRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEmergencyPlansRequest setEmergencyPlanId(String emergencyPlanId) {
        this.emergencyPlanId = emergencyPlanId;
        return this;
    }
    public String getEmergencyPlanId() {
        return this.emergencyPlanId;
    }

}
