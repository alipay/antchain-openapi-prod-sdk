// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateDivideInfo extends TeaModel {
    // 当前用户履约的租期编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period_num")
    public Long periodNum;

    // 经营分账收入方结果信息
    @NameInMap("operation_divide_trans_in_list")
    public java.util.List<OperationDivideTransInDetailInfo> operationDivideTransInList;

    public static OperateDivideInfo build(java.util.Map<String, ?> map) throws Exception {
        OperateDivideInfo self = new OperateDivideInfo();
        return TeaModel.build(map, self);
    }

    public OperateDivideInfo setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public OperateDivideInfo setOperationDivideTransInList(java.util.List<OperationDivideTransInDetailInfo> operationDivideTransInList) {
        this.operationDivideTransInList = operationDivideTransInList;
        return this;
    }
    public java.util.List<OperationDivideTransInDetailInfo> getOperationDivideTransInList() {
        return this.operationDivideTransInList;
    }

}
