// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthinfologRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开始时间(开始时间-结束时间最大时间为7天)
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true, maximum = 500, minimum = 1)
    public Long pageSize;

    // 设备号
    @NameInMap("serial_no")
    public String serialNo;

    public static QueryHealthinfologRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthinfologRequest self = new QueryHealthinfologRequest();
        return TeaModel.build(map, self);
    }

    public QueryHealthinfologRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHealthinfologRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHealthinfologRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryHealthinfologRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryHealthinfologRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryHealthinfologRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryHealthinfologRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
