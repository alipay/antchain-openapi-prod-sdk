// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CommonResponsePageableStructBody extends TeaModel {
    // 页面规格
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public String pageSize;

    // 当前页码
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("current")
    public String current;

    // 总条数
    /**
     * <strong>example:</strong>
     * <p>total</p>
     */
    @NameInMap("total")
    public String total;

    // 失败日志数组
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("list")
    public java.util.List<TriggerLogDTOStructBody> list;

    public static CommonResponsePageableStructBody build(java.util.Map<String, ?> map) throws Exception {
        CommonResponsePageableStructBody self = new CommonResponsePageableStructBody();
        return TeaModel.build(map, self);
    }

    public CommonResponsePageableStructBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public CommonResponsePageableStructBody setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public CommonResponsePageableStructBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public CommonResponsePageableStructBody setList(java.util.List<TriggerLogDTOStructBody> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TriggerLogDTOStructBody> getList() {
        return this.list;
    }

}
