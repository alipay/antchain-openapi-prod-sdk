// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class Product extends TeaModel {
    // 产品id
    @NameInMap("id")
    public Long id;

    // 产品名称
    @NameInMap("product_name")
    public String productName;

    // 产品代码
    @NameInMap("product_code")
    public String productCode;

    // 开通状态, T为已开通, F为未开通
    @NameInMap("opening_status")
    public String openingStatus;

    // 运行状态的枚举值:
    // 					running 正在运行
    // 					stopped 已经停止
    // 					starting 正在启动
    // 					start_fail 启动失败
    // 					stopping 正在停止
    // 					stop_fail 停止失败
    // 					arrearage 因为欠费, 已经停止
    // 					stopping_arr 因为欠费, 正在停止
    // 				
    @NameInMap("running_status")
    public String runningStatus;

    public static Product build(java.util.Map<String, ?> map) throws Exception {
        Product self = new Product();
        return TeaModel.build(map, self);
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public Product setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Product setOpeningStatus(String openingStatus) {
        this.openingStatus = openingStatus;
        return this;
    }
    public String getOpeningStatus() {
        return this.openingStatus;
    }

    public Product setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }
    public String getRunningStatus() {
        return this.runningStatus;
    }

}
