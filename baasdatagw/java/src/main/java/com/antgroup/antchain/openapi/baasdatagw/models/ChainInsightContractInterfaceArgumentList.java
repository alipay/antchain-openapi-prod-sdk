// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightContractInterfaceArgumentList extends TeaModel {
    // 合约接口参数列表
    @NameInMap("list")
    public java.util.List<ChainInsightContractInterfaceArgument> list;

    public static ChainInsightContractInterfaceArgumentList build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightContractInterfaceArgumentList self = new ChainInsightContractInterfaceArgumentList();
        return TeaModel.build(map, self);
    }

    public ChainInsightContractInterfaceArgumentList setList(java.util.List<ChainInsightContractInterfaceArgument> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightContractInterfaceArgument> getList() {
        return this.list;
    }

}
