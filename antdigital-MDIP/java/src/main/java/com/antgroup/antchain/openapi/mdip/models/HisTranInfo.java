// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdip.models;

import com.aliyun.tea.*;

public class HisTranInfo extends TeaModel {
    // 维修单号
    @NameInMap("repair_no")
    public String repairNo;

    // 购买日期
    @NameInMap("buy_date")
    public String buyDate;

    // 商品型号
    @NameInMap("comm_type")
    public String commType;

    // 商品金额
    @NameInMap("comm_amount")
    public String commAmount;

    // 维修时间
    @NameInMap("repair_time")
    public String repairTime;

    // 是否联保
    @NameInMap("is_joint")
    public String isJoint;

    // 合计费用(每笔历史交易的合计费用)
    @NameInMap("total_cost")
    public String totalCost;

    public static HisTranInfo build(java.util.Map<String, ?> map) throws Exception {
        HisTranInfo self = new HisTranInfo();
        return TeaModel.build(map, self);
    }

    public HisTranInfo setRepairNo(String repairNo) {
        this.repairNo = repairNo;
        return this;
    }
    public String getRepairNo() {
        return this.repairNo;
    }

    public HisTranInfo setBuyDate(String buyDate) {
        this.buyDate = buyDate;
        return this;
    }
    public String getBuyDate() {
        return this.buyDate;
    }

    public HisTranInfo setCommType(String commType) {
        this.commType = commType;
        return this;
    }
    public String getCommType() {
        return this.commType;
    }

    public HisTranInfo setCommAmount(String commAmount) {
        this.commAmount = commAmount;
        return this;
    }
    public String getCommAmount() {
        return this.commAmount;
    }

    public HisTranInfo setRepairTime(String repairTime) {
        this.repairTime = repairTime;
        return this;
    }
    public String getRepairTime() {
        return this.repairTime;
    }

    public HisTranInfo setIsJoint(String isJoint) {
        this.isJoint = isJoint;
        return this;
    }
    public String getIsJoint() {
        return this.isJoint;
    }

    public HisTranInfo setTotalCost(String totalCost) {
        this.totalCost = totalCost;
        return this;
    }
    public String getTotalCost() {
        return this.totalCost;
    }

}
