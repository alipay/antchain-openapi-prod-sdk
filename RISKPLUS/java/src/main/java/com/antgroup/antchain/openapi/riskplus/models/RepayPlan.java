// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayPlan extends TeaModel {
    // 期次号，还款期次序号
    /**
     * <strong>example:</strong>
     * <p>2023343380112</p>
     */
    @NameInMap("term_no")
    @Validation(required = true)
    public String termNo;

    // 本期开始时间，格式：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("term_start")
    public String termStart;

    // 本期结束时间，格式：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>1999-01-01</p>
     */
    @NameInMap("term_end")
    @Validation(required = true)
    public String termEnd;

    // 本期本金，单位：元，2 位小数
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("term_prin")
    @Validation(required = true)
    public String termPrin;

    // 本期利息，单位：元，2 位小数
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("term_int")
    @Validation(required = true)
    public String termInt;

    public static RepayPlan build(java.util.Map<String, ?> map) throws Exception {
        RepayPlan self = new RepayPlan();
        return TeaModel.build(map, self);
    }

    public RepayPlan setTermNo(String termNo) {
        this.termNo = termNo;
        return this;
    }
    public String getTermNo() {
        return this.termNo;
    }

    public RepayPlan setTermStart(String termStart) {
        this.termStart = termStart;
        return this;
    }
    public String getTermStart() {
        return this.termStart;
    }

    public RepayPlan setTermEnd(String termEnd) {
        this.termEnd = termEnd;
        return this;
    }
    public String getTermEnd() {
        return this.termEnd;
    }

    public RepayPlan setTermPrin(String termPrin) {
        this.termPrin = termPrin;
        return this;
    }
    public String getTermPrin() {
        return this.termPrin;
    }

    public RepayPlan setTermInt(String termInt) {
        this.termInt = termInt;
        return this;
    }
    public String getTermInt() {
        return this.termInt;
    }

}
