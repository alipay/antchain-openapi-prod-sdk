// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceModeldataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 数据类型
    // HOT_STORAGE：时序数据
    // ORIGINAL_PROPERTY：原始属性
    // ORIGINAL_EVENT：原始事件
    // ORIGINAL_SERVICE：原始服务
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 返回结果中数据记录的排序方式，取值：
    // ● true：正序。
    // ● false：倒序。
    @NameInMap("asc")
    @Validation(required = true)
    public Boolean asc;

    // 要查询的数据记录的开始时间，必须小于结束时间EndTime。
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 要查询的数据记录的结束时间，必须大于起始时间StartTime。
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 标识符，不同的datatype意思不同
    // HOT_STORAGE：已存储时序数据中的字段标识符。
    // ORIGINAL_PROPERTY：属性标识符
    // ORIGINAL_EVENT：事件标识符
    // ORIGINAL_SERVICE：服务标识符
    @NameInMap("identifier")
    @Validation(required = true)
    public String identifier;

    // 单个字段标识符可返回的数据记录数量，最大值为100。
    // 任意一个字段返回的数据记录数量均不超过该值。
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 要查询数据所属自定义Topic。从user类目开始，输入自定义Topic的后续所有类目。
    // dataType为HOT_STORAGE时需要有值
    @NameInMap("user_topic")
    public String userTopic;

    // 下一页标识。如果存在下一页，服务会返回此Token，下次请求带上即可。
    @NameInMap("next_page_token")
    public String nextPageToken;

    public static QueryDeviceModeldataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceModeldataRequest self = new QueryDeviceModeldataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceModeldataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceModeldataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceModeldataRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public QueryDeviceModeldataRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public QueryDeviceModeldataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryDeviceModeldataRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public QueryDeviceModeldataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDeviceModeldataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceModeldataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceModeldataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceModeldataRequest setUserTopic(String userTopic) {
        this.userTopic = userTopic;
        return this;
    }
    public String getUserTopic() {
        return this.userTopic;
    }

    public QueryDeviceModeldataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

}
