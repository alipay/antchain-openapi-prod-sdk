// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DataDownloadInfo extends TeaModel {
    // 商户社会统一信用代码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 流水号
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("biz_no")
    public String bizNo;

    //  状态
    /**
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("status")
    public String status;

    // TRADE_PROMISE_BILL: 交易履约账单
    /**
     * <strong>example:</strong>
     * <p>交易履约账单</p>
     */
    @NameInMap("type")
    public String type;

    // 筛选开始时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17</p>
     */
    @NameInMap("start_time")
    public String startTime;

    // 筛选结束时间
    /**
     * <strong>example:</strong>
     * <p>2024-11-17</p>
     */
    @NameInMap("end_time")
    public String endTime;

    // 任务创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 下载结果
    /**
     * <strong>example:</strong>
     * <p>下载结果</p>
     */
    @NameInMap("result_info")
    public String resultInfo;

    public static DataDownloadInfo build(java.util.Map<String, ?> map) throws Exception {
        DataDownloadInfo self = new DataDownloadInfo();
        return TeaModel.build(map, self);
    }

    public DataDownloadInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DataDownloadInfo setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public DataDownloadInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataDownloadInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataDownloadInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DataDownloadInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DataDownloadInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DataDownloadInfo setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }
    public String getResultInfo() {
        return this.resultInfo;
    }

}
