// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryOssDownloadjoburlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 获取文件类型：DEVICE_INFO（设备信息）、DEVICE_DATA（状态数据）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 文件所属日期，yyyymmdd
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 请求状态数据是，若导出周期为小时级，则必填；文件所属小时
    @NameInMap("hour")
    public String hour;

    public static QueryOssDownloadjoburlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOssDownloadjoburlRequest self = new QueryOssDownloadjoburlRequest();
        return TeaModel.build(map, self);
    }

    public QueryOssDownloadjoburlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOssDownloadjoburlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOssDownloadjoburlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryOssDownloadjoburlRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryOssDownloadjoburlRequest setHour(String hour) {
        this.hour = hour;
        return this;
    }
    public String getHour() {
        return this.hour;
    }

}
