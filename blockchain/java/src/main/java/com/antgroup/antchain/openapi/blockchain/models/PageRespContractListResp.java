// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PageRespContractListResp extends TeaModel {
    // 总数
    @NameInMap("total")
    public Long total;

    // 列表数据
    @NameInMap("data_list")
    public java.util.List<ContractListResp> dataList;

    public static PageRespContractListResp build(java.util.Map<String, ?> map) throws Exception {
        PageRespContractListResp self = new PageRespContractListResp();
        return TeaModel.build(map, self);
    }

    public PageRespContractListResp setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PageRespContractListResp setDataList(java.util.List<ContractListResp> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ContractListResp> getDataList() {
        return this.dataList;
    }

}
