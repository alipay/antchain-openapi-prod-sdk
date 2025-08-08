// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class EblStatusDeatil extends TeaModel {
    // 当前提单状态
    /**
     * <strong>example:</strong>
     * <p>endorsed</p>
     */
    @NameInMap("current_ebl_status")
    @Validation(required = true)
    public String currentEblStatus;

    // 电子提单编号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("ebl_no")
    @Validation(required = true)
    public String eblNo;

    // 下一个提单状态
    /**
     * <strong>example:</strong>
     * <p>surrendered</p>
     */
    @NameInMap("next_ebl_status")
    @Validation(required = true)
    public String nextEblStatus;

    public static EblStatusDeatil build(java.util.Map<String, ?> map) throws Exception {
        EblStatusDeatil self = new EblStatusDeatil();
        return TeaModel.build(map, self);
    }

    public EblStatusDeatil setCurrentEblStatus(String currentEblStatus) {
        this.currentEblStatus = currentEblStatus;
        return this;
    }
    public String getCurrentEblStatus() {
        return this.currentEblStatus;
    }

    public EblStatusDeatil setEblNo(String eblNo) {
        this.eblNo = eblNo;
        return this;
    }
    public String getEblNo() {
        return this.eblNo;
    }

    public EblStatusDeatil setNextEblStatus(String nextEblStatus) {
        this.nextEblStatus = nextEblStatus;
        return this;
    }
    public String getNextEblStatus() {
        return this.nextEblStatus;
    }

}
