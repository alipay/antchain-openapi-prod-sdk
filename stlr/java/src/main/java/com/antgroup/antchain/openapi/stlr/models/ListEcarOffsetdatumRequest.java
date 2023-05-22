// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarOffsetdatumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 碳补偿项目编码
    @NameInMap("project_no")
    public String projectNo;

    // 账户DID
    @NameInMap("account_did")
    public String accountDid;

    // 发生开始时间
    @NameInMap("occurrent_start_time")
    public String occurrentStartTime;

    // 数据发生截止时间
    @NameInMap("occurrent_end_time")
    public String occurrentEndTime;

    // 碳普惠平台编码
    @NameInMap("carbon_offset_platform_no")
    public String carbonOffsetPlatformNo;

    // 发生场景编码，需指定相关碳普惠平台的场景编码，可以指定多个场景
    @NameInMap("scenario_code")
    public java.util.List<String> scenarioCode;

    // 分页查询数据时的页码，从1开始，不传入时默认值为1
    @NameInMap("current")
    public Long current;

    // 每页数据量，默认值为20，取值范围为[10,100]
    @NameInMap("page_size")
    public Long pageSize;

    public static ListEcarOffsetdatumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcarOffsetdatumRequest self = new ListEcarOffsetdatumRequest();
        return TeaModel.build(map, self);
    }

    public ListEcarOffsetdatumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListEcarOffsetdatumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListEcarOffsetdatumRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public ListEcarOffsetdatumRequest setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public ListEcarOffsetdatumRequest setOccurrentStartTime(String occurrentStartTime) {
        this.occurrentStartTime = occurrentStartTime;
        return this;
    }
    public String getOccurrentStartTime() {
        return this.occurrentStartTime;
    }

    public ListEcarOffsetdatumRequest setOccurrentEndTime(String occurrentEndTime) {
        this.occurrentEndTime = occurrentEndTime;
        return this;
    }
    public String getOccurrentEndTime() {
        return this.occurrentEndTime;
    }

    public ListEcarOffsetdatumRequest setCarbonOffsetPlatformNo(String carbonOffsetPlatformNo) {
        this.carbonOffsetPlatformNo = carbonOffsetPlatformNo;
        return this;
    }
    public String getCarbonOffsetPlatformNo() {
        return this.carbonOffsetPlatformNo;
    }

    public ListEcarOffsetdatumRequest setScenarioCode(java.util.List<String> scenarioCode) {
        this.scenarioCode = scenarioCode;
        return this;
    }
    public java.util.List<String> getScenarioCode() {
        return this.scenarioCode;
    }

    public ListEcarOffsetdatumRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListEcarOffsetdatumRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
