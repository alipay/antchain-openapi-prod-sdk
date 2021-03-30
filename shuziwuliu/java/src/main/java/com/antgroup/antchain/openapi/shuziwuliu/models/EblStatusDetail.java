// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class EblStatusDetail extends TeaModel {
    // 当前提单状态
    @NameInMap("current_ebl_status")
    @Validation(required = true)
    public String currentEblStatus;

    // 电子提单编号
    @NameInMap("ebl_no")
    @Validation(required = true)
    public String eblNo;

    // 下一个提单状态
    @NameInMap("next_ebl_status")
    @Validation(required = true)
    public String nextEblStatus;

    public static EblStatusDetail build(java.util.Map<String, ?> map) throws Exception {
        EblStatusDetail self = new EblStatusDetail();
        return TeaModel.build(map, self);
    }

    public EblStatusDetail setCurrentEblStatus(String currentEblStatus) {
        this.currentEblStatus = currentEblStatus;
        return this;
    }
    public String getCurrentEblStatus() {
        return this.currentEblStatus;
    }

    public EblStatusDetail setEblNo(String eblNo) {
        this.eblNo = eblNo;
        return this;
    }
    public String getEblNo() {
        return this.eblNo;
    }

    public EblStatusDetail setNextEblStatus(String nextEblStatus) {
        this.nextEblStatus = nextEblStatus;
        return this;
    }
    public String getNextEblStatus() {
        return this.nextEblStatus;
    }

}
