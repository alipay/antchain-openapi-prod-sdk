// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class InitPack extends TeaModel {
    // 请求时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // 请求人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("operate")
    @Validation(required = true)
    public String operate;

    // 编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static InitPack build(java.util.Map<String, ?> map) throws Exception {
        InitPack self = new InitPack();
        return TeaModel.build(map, self);
    }

    public InitPack setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InitPack setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public InitPack setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
