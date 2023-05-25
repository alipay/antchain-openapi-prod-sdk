// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ClusterSecurityComponentBrief extends TeaModel {
    // 风险项数量
    @NameInMap("cnt")
    public Long cnt;

    // 组件名称
    @NameInMap("component")
    public String component;

    // 描述
    @NameInMap("content")
    public String content;

    // 日期
    @NameInMap("date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    public static ClusterSecurityComponentBrief build(java.util.Map<String, ?> map) throws Exception {
        ClusterSecurityComponentBrief self = new ClusterSecurityComponentBrief();
        return TeaModel.build(map, self);
    }

    public ClusterSecurityComponentBrief setCnt(Long cnt) {
        this.cnt = cnt;
        return this;
    }
    public Long getCnt() {
        return this.cnt;
    }

    public ClusterSecurityComponentBrief setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ClusterSecurityComponentBrief setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ClusterSecurityComponentBrief setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
