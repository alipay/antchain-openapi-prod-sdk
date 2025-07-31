// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BaddebtQueryModel extends TeaModel {
    // 服务分类，服务二级分类
    /**
     * <strong>example:</strong>
     * <p>category1</p>
     */
    @NameInMap("service_category")
    @Validation(maxLength = 128, minLength = 1)
    public String serviceCategory;

    // 总金额，用户购买或使用服务时产生的具体金额
    /**
     * <strong>example:</strong>
     * <p>36500</p>
     */
    @NameInMap("total_amount")
    @Validation(maximum = 10000000, minimum = 1)
    public Long totalAmount;

    // 商品数量，用户购买或使用服务时产生的具体商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_quantity")
    @Validation(maximum = 10000, minimum = 1)
    public Long totalQuantity;

    // 用户姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    @Validation(maxLength = 128, minLength = 1)
    public String userName;

    // 服务商 pid
    /**
     * <strong>example:</strong>
     * <p>2088xxxxxxxxxxxx</p>
     */
    @NameInMap("isv_pid")
    @Validation(maxLength = 128, minLength = 1)
    public String isvPid;

    // 终端唯一标识
    /**
     * <strong>example:</strong>
     * <p>wcsQ4EKKaasuqLrXO9+xhwEAxxxx</p>
     */
    @NameInMap("apdid")
    @Validation(maxLength = 128, minLength = 1)
    public String apdid;

    public static BaddebtQueryModel build(java.util.Map<String, ?> map) throws Exception {
        BaddebtQueryModel self = new BaddebtQueryModel();
        return TeaModel.build(map, self);
    }

    public BaddebtQueryModel setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
        return this;
    }
    public String getServiceCategory() {
        return this.serviceCategory;
    }

    public BaddebtQueryModel setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public BaddebtQueryModel setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }
    public Long getTotalQuantity() {
        return this.totalQuantity;
    }

    public BaddebtQueryModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BaddebtQueryModel setIsvPid(String isvPid) {
        this.isvPid = isvPid;
        return this;
    }
    public String getIsvPid() {
        return this.isvPid;
    }

    public BaddebtQueryModel setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

}
