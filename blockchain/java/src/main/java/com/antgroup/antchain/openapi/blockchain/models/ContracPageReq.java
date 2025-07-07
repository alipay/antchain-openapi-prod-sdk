// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContracPageReq extends TeaModel {
    // 合约服务类别
    /**
     * <strong>example:</strong>
     * <p>存证合约</p>
     */
    @NameInMap("type")
    public String type;

    // 页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("num")
    @Validation(required = true)
    public Long num;

    // 页大小
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static ContracPageReq build(java.util.Map<String, ?> map) throws Exception {
        ContracPageReq self = new ContracPageReq();
        return TeaModel.build(map, self);
    }

    public ContracPageReq setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContracPageReq setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public ContracPageReq setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
