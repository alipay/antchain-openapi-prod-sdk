// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class NameBean extends TeaModel {
    // 名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 编号
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("no_num")
    public Long noNum;

    public static NameBean build(java.util.Map<String, ?> map) throws Exception {
        NameBean self = new NameBean();
        return TeaModel.build(map, self);
    }

    public NameBean setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NameBean setNoNum(Long noNum) {
        this.noNum = noNum;
        return this;
    }
    public Long getNoNum() {
        return this.noNum;
    }

}
