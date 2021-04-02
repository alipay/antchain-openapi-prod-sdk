// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RawData extends TeaModel {
    // 链上设备id
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 数据内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 设备id
    @NameInMap("device_id")
    public String deviceId;

    // 上链哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链时间
    @NameInMap("tx_time")
    @Validation(required = true)
    public Long txTime;

    // 链上外围设备ID
    @NameInMap("chain_peripheral_id")
    public String chainPeripheralId;

    // 外围设备ID
    @NameInMap("peripheral_id")
    public String peripheralId;

    public static RawData build(java.util.Map<String, ?> map) throws Exception {
        RawData self = new RawData();
        return TeaModel.build(map, self);
    }

    public RawData setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public RawData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RawData setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RawData setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public RawData setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

    public RawData setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

    public RawData setPeripheralId(String peripheralId) {
        this.peripheralId = peripheralId;
        return this;
    }
    public String getPeripheralId() {
        return this.peripheralId;
    }

}
