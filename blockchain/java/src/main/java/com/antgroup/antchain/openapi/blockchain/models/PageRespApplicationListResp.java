// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PageRespApplicationListResp extends TeaModel {
    // 总数
    @NameInMap("total")
    public Long total;

    // 列表数据
    @NameInMap("data_list")
    public java.util.List<ApplicationListResp> dataList;

    public static PageRespApplicationListResp build(java.util.Map<String, ?> map) throws Exception {
        PageRespApplicationListResp self = new PageRespApplicationListResp();
        return TeaModel.build(map, self);
    }

    public PageRespApplicationListResp setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PageRespApplicationListResp setDataList(java.util.List<ApplicationListResp> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ApplicationListResp> getDataList() {
        return this.dataList;
    }

}
