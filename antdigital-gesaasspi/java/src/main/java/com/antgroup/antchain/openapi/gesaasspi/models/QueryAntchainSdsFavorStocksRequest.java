// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class QueryAntchainSdsFavorStocksRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 【分页页码】 页码从0开始，默认第0页
    @NameInMap("offset")
    @Validation(required = true)
    public Long offset;

    // 【分页大小】 分页大小，最大10
    @NameInMap("limit")
    @Validation(required = true)
    public Long limit;

    // 【创建批次的商户号】 批次创建方商户号。
    // 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
    @NameInMap("stock_creator_mchid")
    @Validation(required = true)
    public String stockCreatorMchid;

    // 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
    // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
    @NameInMap("create_start_time")
    public String createStartTime;

    // 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
    // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
    @NameInMap("create_end_time")
    public String createEndTime;

    // 【批次状态】 批次状态，枚举值：
    // unactivated：未激活
    // audit：审核中
    // running：运行中
    // stoped：已停止
    // paused：暂停发放
    @NameInMap("status")
    public String status;

    public static QueryAntchainSdsFavorStocksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSdsFavorStocksRequest self = new QueryAntchainSdsFavorStocksRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSdsFavorStocksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSdsFavorStocksRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSdsFavorStocksRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryAntchainSdsFavorStocksRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QueryAntchainSdsFavorStocksRequest setStockCreatorMchid(String stockCreatorMchid) {
        this.stockCreatorMchid = stockCreatorMchid;
        return this;
    }
    public String getStockCreatorMchid() {
        return this.stockCreatorMchid;
    }

    public QueryAntchainSdsFavorStocksRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public QueryAntchainSdsFavorStocksRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public QueryAntchainSdsFavorStocksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
