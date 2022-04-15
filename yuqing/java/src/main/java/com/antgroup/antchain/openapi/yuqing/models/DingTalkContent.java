// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class DingTalkContent extends TeaModel {
    // webHook
    @NameInMap("web_hook")
    public String webHook;

    // 消息类型
    @NameInMap("msgtype")
    public String msgtype;

    // 文字
    @NameInMap("text")
    public Text text;

    // 链接
    @NameInMap("link")
    public Link link;

    // markdown
    @NameInMap("markdown")
    public Markdown markdown;

    // actionCard
    @NameInMap("action_card")
    public ActionCard actionCard;

    // feedCard
    @NameInMap("feed_card")
    public FeedCard feedCard;

    // at
    @NameInMap("at")
    public At at;

    public static DingTalkContent build(java.util.Map<String, ?> map) throws Exception {
        DingTalkContent self = new DingTalkContent();
        return TeaModel.build(map, self);
    }

    public DingTalkContent setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

    public DingTalkContent setMsgtype(String msgtype) {
        this.msgtype = msgtype;
        return this;
    }
    public String getMsgtype() {
        return this.msgtype;
    }

    public DingTalkContent setText(Text text) {
        this.text = text;
        return this;
    }
    public Text getText() {
        return this.text;
    }

    public DingTalkContent setLink(Link link) {
        this.link = link;
        return this;
    }
    public Link getLink() {
        return this.link;
    }

    public DingTalkContent setMarkdown(Markdown markdown) {
        this.markdown = markdown;
        return this;
    }
    public Markdown getMarkdown() {
        return this.markdown;
    }

    public DingTalkContent setActionCard(ActionCard actionCard) {
        this.actionCard = actionCard;
        return this;
    }
    public ActionCard getActionCard() {
        return this.actionCard;
    }

    public DingTalkContent setFeedCard(FeedCard feedCard) {
        this.feedCard = feedCard;
        return this;
    }
    public FeedCard getFeedCard() {
        return this.feedCard;
    }

    public DingTalkContent setAt(At at) {
        this.at = at;
        return this;
    }
    public At getAt() {
        return this.at;
    }

}
