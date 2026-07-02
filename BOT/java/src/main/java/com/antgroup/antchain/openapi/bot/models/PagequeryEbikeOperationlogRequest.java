// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryEbikeOperationlogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第几页
    @NameInMap("page_index")
    @Validation(required = true, minimum = 1)
    public Long pageIndex;

    // 单页记录数
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long pageSize;

    // 开始时间（日志记录的时间）
    @NameInMap("start_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startDate;

    // 结束时间（日志记录的时间）
    @NameInMap("end_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endDate;

    // 小程序AppId
    @NameInMap("app_id")
    public String appId;

    // 用户Id
    @NameInMap("user_id")
    public String userId;

    // 用户手机号，当user_id不为空时，该值无效
    @NameInMap("user_phone")
    public String userPhone;

    // 设备Id
    @NameInMap("device_id")
    public String deviceId;

    // 操作描述
    @NameInMap("operate_desc")
    public String operateDesc;

    // 操作是否成功
    @NameInMap("success")
    public Boolean success;

    // 日志等级（info、warn、error）
    @NameInMap("level")
    public String level;

    public static PagequeryEbikeOperationlogRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryEbikeOperationlogRequest self = new PagequeryEbikeOperationlogRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryEbikeOperationlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryEbikeOperationlogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryEbikeOperationlogRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequeryEbikeOperationlogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryEbikeOperationlogRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public PagequeryEbikeOperationlogRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public PagequeryEbikeOperationlogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PagequeryEbikeOperationlogRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PagequeryEbikeOperationlogRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public PagequeryEbikeOperationlogRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public PagequeryEbikeOperationlogRequest setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
        return this;
    }
    public String getOperateDesc() {
        return this.operateDesc;
    }

    public PagequeryEbikeOperationlogRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryEbikeOperationlogRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}
