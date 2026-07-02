// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class Peripheral extends TeaModel {
    // 外围设备Id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("peripheral_id")
    @Validation(required = true)
    public String peripheralId;

    // 数据模型id
    // 
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("peripheral_data_model_id")
    @Validation(required = true)
    public String peripheralDataModelId;

    // 场景码
    // 
    /**
     * <strong>example:</strong>
     * <p>scene1</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 外围设备名称
    // 
    /**
     * <strong>example:</strong>
     * <p>锂电池1 </p>
     */
    @NameInMap("peripheral_name")
    public String peripheralName;

    // 厂商名称
    // 
    /**
     * <strong>example:</strong>
     * <p>宁德时代1</p>
     */
    @NameInMap("corp_name")
    public String corpName;

    // 链上外围设备Id
    // 
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("chain_peripheral_id")
    @Validation(required = true)
    public String chainPeripheralId;

    // 链上哈希
    /**
     * <strong>example:</strong>
     * <p>txhash123</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>1605076751000</p>
     */
    @NameInMap("tx_time")
    @Validation(required = true)
    public Long txTime;

    // 设备类型编码，必填，对应资管平台中的设备类型 
    // 
    // 枚举值：
    // 
    // 车辆 1000 
    // 车辆 四轮车 1001 
    // 车辆 四轮车 纯电四轮车 1002 
    // 车辆 四轮车 混动四轮车 1003 
    // 车辆 四轮车 燃油四轮车 1004 
    // 车辆 两轮车 1011 
    // 车辆 两轮车 两轮单车 1012 
    // 车辆 两轮车 两轮助力车 1013 
    // 
    // 换电柜 2000 
    // 换电柜 二轮车换电柜 2001 
    // 
    // 电池 3000 
    // 电池 磷酸铁电池 3001 
    // 电池 三元锂电池 3002 
    // 
    // 回收设备 4000 
    // 
    // 垃圾分类回收 4001 
    // 
    // 洗车机 5000
    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("device_type_code")
    @Validation(required = true)
    public Long deviceTypeCode;

    // 单价，单位分
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("initial_price")
    @Validation(required = true)
    public Long initialPrice;

    // 出厂时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("factory_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 投放时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("release_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    public static Peripheral build(java.util.Map<String, ?> map) throws Exception {
        Peripheral self = new Peripheral();
        return TeaModel.build(map, self);
    }

    public Peripheral setPeripheralId(String peripheralId) {
        this.peripheralId = peripheralId;
        return this;
    }
    public String getPeripheralId() {
        return this.peripheralId;
    }

    public Peripheral setPeripheralDataModelId(String peripheralDataModelId) {
        this.peripheralDataModelId = peripheralDataModelId;
        return this;
    }
    public String getPeripheralDataModelId() {
        return this.peripheralDataModelId;
    }

    public Peripheral setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public Peripheral setPeripheralName(String peripheralName) {
        this.peripheralName = peripheralName;
        return this;
    }
    public String getPeripheralName() {
        return this.peripheralName;
    }

    public Peripheral setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public Peripheral setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

    public Peripheral setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public Peripheral setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

    public Peripheral setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public Peripheral setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public Peripheral setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public Peripheral setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

}
