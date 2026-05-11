// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yfptspu.models;

import com.aliyun.tea.*;

public class SumBean extends TeaModel {
    // 元素名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("e_name")
    public String eName;

    // 数量
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("num")
    public Long num;

    // test
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("info")
    @Validation(required = true)
    public ResultTests info;

    public static SumBean build(java.util.Map<String, ?> map) throws Exception {
        SumBean self = new SumBean();
        return TeaModel.build(map, self);
    }

    public SumBean setEName(String eName) {
        this.eName = eName;
        return this;
    }
    public String getEName() {
        return this.eName;
    }

    public SumBean setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public SumBean setInfo(ResultTests info) {
        this.info = info;
        return this;
    }
    public ResultTests getInfo() {
        return this.info;
    }

}
