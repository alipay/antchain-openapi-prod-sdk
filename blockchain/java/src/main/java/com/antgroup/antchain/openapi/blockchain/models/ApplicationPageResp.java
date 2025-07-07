// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationPageResp extends TeaModel {
    // 应用授权列表
    @NameInMap("list")
    public java.util.List<ApplicationPageListResp> list;

    // 总数
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("total")
    public Long total;

    public static ApplicationPageResp build(java.util.Map<String, ?> map) throws Exception {
        ApplicationPageResp self = new ApplicationPageResp();
        return TeaModel.build(map, self);
    }

    public ApplicationPageResp setList(java.util.List<ApplicationPageListResp> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApplicationPageListResp> getList() {
        return this.list;
    }

    public ApplicationPageResp setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
