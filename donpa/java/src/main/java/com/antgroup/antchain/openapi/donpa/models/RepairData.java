// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class RepairData extends TeaModel {
    // 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
    @NameInMap("repair_status")
    @Validation(required = true)
    public String repairStatus;

    // 身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 姓名：显示的姓名为修复请求的 待修复人名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 案件编号，特定使用运营商页面平台产生
    @NameInMap("case_no")
    public String caseNo;

    // 修复号码数量
    @NameInMap("result_list_number")
    @Validation(required = true)
    public Long resultListNumber;

    public static RepairData build(java.util.Map<String, ?> map) throws Exception {
        RepairData self = new RepairData();
        return TeaModel.build(map, self);
    }

    public RepairData setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
        return this;
    }
    public String getRepairStatus() {
        return this.repairStatus;
    }

    public RepairData setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public RepairData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public RepairData setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public RepairData setResultListNumber(Long resultListNumber) {
        this.resultListNumber = resultListNumber;
        return this;
    }
    public Long getResultListNumber() {
        return this.resultListNumber;
    }

}
