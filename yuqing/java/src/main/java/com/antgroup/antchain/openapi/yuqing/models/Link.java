// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Link extends TeaModel {
    // 文字
    @NameInMap("text")
    public String text;

    // 标题
    @NameInMap("title")
    public String title;

    // 图片地址
    @NameInMap("pic_url")
    public String picUrl;

    // 链接
    @NameInMap("message_url")
    public String messageUrl;

    public static Link build(java.util.Map<String, ?> map) throws Exception {
        Link self = new Link();
        return TeaModel.build(map, self);
    }

    public Link setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Link setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Link setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public Link setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl;
        return this;
    }
    public String getMessageUrl() {
        return this.messageUrl;
    }

}
