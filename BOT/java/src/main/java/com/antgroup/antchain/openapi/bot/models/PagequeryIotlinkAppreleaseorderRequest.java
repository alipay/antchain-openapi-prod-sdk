// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryIotlinkAppreleaseorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("apk_name")
    public String apkName;

    // 应用版本号
    @NameInMap("apk_version")
    public String apkVersion;

    // 工单id
    @NameInMap("order_id")
    public String orderId;

    // 发布批次状态
    // 升级中：IN_PROGRESS
    // 取消中：CANCELING
    // 部分成功：PARTIAL_SUCCESS
    // 部分失败：PARTIAL_FAILED
    // 部分取消：PARTIAL_CANCELED
    // 全部成功：ALL_SUCCESS
    // 全部失败：ALL_FAILED
    // 全部取消：ALL_CANCELED
    @NameInMap("status")
    public String status;

    // 当前页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 品类code
    @NameInMap("category_code")
    public String categoryCode;

    public static PagequeryIotlinkAppreleaseorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIotlinkAppreleaseorderRequest self = new PagequeryIotlinkAppreleaseorderRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIotlinkAppreleaseorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIotlinkAppreleaseorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIotlinkAppreleaseorderRequest setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public PagequeryIotlinkAppreleaseorderRequest setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public PagequeryIotlinkAppreleaseorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryIotlinkAppreleaseorderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryIotlinkAppreleaseorderRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryIotlinkAppreleaseorderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIotlinkAppreleaseorderRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
