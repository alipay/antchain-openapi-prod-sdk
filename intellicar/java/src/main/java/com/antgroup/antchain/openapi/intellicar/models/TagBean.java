// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class TagBean extends TeaModel {
    // 标签编码
    /**
     * <strong>example:</strong>
     * <p>01qe000</p>
     */
    @NameInMap("tid")
    public String tid;

    // 标签类目
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("category")
    public String category;

    // 标签名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("tname")
    public String tname;

    // 标签值名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("tvname")
    public String tvname;

    public static TagBean build(java.util.Map<String, ?> map) throws Exception {
        TagBean self = new TagBean();
        return TeaModel.build(map, self);
    }

    public TagBean setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

    public TagBean setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public TagBean setTname(String tname) {
        this.tname = tname;
        return this;
    }
    public String getTname() {
        return this.tname;
    }

    public TagBean setTvname(String tvname) {
        this.tvname = tvname;
        return this;
    }
    public String getTvname() {
        return this.tvname;
    }

}
