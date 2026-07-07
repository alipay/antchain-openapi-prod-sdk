// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DataDepositInfo extends TeaModel {
    // 存证字段值
    @NameInMap("data_value")
    @Validation(required = true)
    public java.util.List<DepositFieldValue> dataValue;

    // 数据存证区块链交易ID
    /**
     * <strong>example:</strong>
     * <p>c5fcc677a0b04c62973c2dbc72jcus83271</p>
     */
    @NameInMap("tx_id")
    public String txId;

    // 数据存证操作用户ID
    /**
     * <strong>example:</strong>
     * <p>user_001</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 存证数据内容
    /**
     * <strong>example:</strong>
     * <p>待补充</p>
     */
    @NameInMap("deposit_content")
    @Validation(required = true)
    public String depositContent;

    // 存证执行状态
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 存证执行(发起)时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static DataDepositInfo build(java.util.Map<String, ?> map) throws Exception {
        DataDepositInfo self = new DataDepositInfo();
        return TeaModel.build(map, self);
    }

    public DataDepositInfo setDataValue(java.util.List<DepositFieldValue> dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public java.util.List<DepositFieldValue> getDataValue() {
        return this.dataValue;
    }

    public DataDepositInfo setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public DataDepositInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DataDepositInfo setDepositContent(String depositContent) {
        this.depositContent = depositContent;
        return this;
    }
    public String getDepositContent() {
        return this.depositContent;
    }

    public DataDepositInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataDepositInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
