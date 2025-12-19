// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class CrowdStrategyData extends TeaModel {
    // 人群编码
    /**
     * <strong>example:</strong>
     * <p>STRATEGY20251210000001</p>
     */
    @NameInMap("strategy_code")
    @Validation(required = true)
    public String strategyCode;

    // 人群名称
    /**
     * <strong>example:</strong>
     * <p>开发测试人群</p>
     */
    @NameInMap("strategy_name")
    @Validation(required = true)
    public String strategyName;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 人群数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("strategy_count")
    @Validation(required = true)
    public Long strategyCount;

    // 用户数量
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("user_count")
    @Validation(required = true)
    public Long userCount;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>测试银行</p>
     */
    @NameInMap("inst_name")
    public String instName;

    // 日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    public static CrowdStrategyData build(java.util.Map<String, ?> map) throws Exception {
        CrowdStrategyData self = new CrowdStrategyData();
        return TeaModel.build(map, self);
    }

    public CrowdStrategyData setStrategyCode(String strategyCode) {
        this.strategyCode = strategyCode;
        return this;
    }
    public String getStrategyCode() {
        return this.strategyCode;
    }

    public CrowdStrategyData setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CrowdStrategyData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CrowdStrategyData setStrategyCount(Long strategyCount) {
        this.strategyCount = strategyCount;
        return this;
    }
    public Long getStrategyCount() {
        return this.strategyCount;
    }

    public CrowdStrategyData setUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }
    public Long getUserCount() {
        return this.userCount;
    }

    public CrowdStrategyData setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

    public CrowdStrategyData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

}
