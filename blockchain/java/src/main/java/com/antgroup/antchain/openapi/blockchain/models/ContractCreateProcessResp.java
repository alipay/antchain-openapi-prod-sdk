// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractCreateProcessResp extends TeaModel {
    // 当前进度信息
    /**
     * <strong>example:</strong>
     * <p>SERVICE_START</p>
     */
    @NameInMap("status")
    public String status;

    // 合约部署进度
    @NameInMap("progress_info_list")
    public java.util.List<InstanceProgressInfo> progressInfoList;

    public static ContractCreateProcessResp build(java.util.Map<String, ?> map) throws Exception {
        ContractCreateProcessResp self = new ContractCreateProcessResp();
        return TeaModel.build(map, self);
    }

    public ContractCreateProcessResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContractCreateProcessResp setProgressInfoList(java.util.List<InstanceProgressInfo> progressInfoList) {
        this.progressInfoList = progressInfoList;
        return this;
    }
    public java.util.List<InstanceProgressInfo> getProgressInfoList() {
        return this.progressInfoList;
    }

}
