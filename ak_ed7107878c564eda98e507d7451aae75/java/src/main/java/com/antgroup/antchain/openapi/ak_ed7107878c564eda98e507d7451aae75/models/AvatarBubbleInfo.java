// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarBubbleInfo extends TeaModel {
    // 气泡标题
    /**
     * <strong>example:</strong>
     * <p>点我</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 气泡类型
    /**
     * <strong>example:</strong>
     * <p>KNOWLEDGE,LINK,TEL,OUT_BIZ_ID</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 知识点id
    /**
     * <strong>example:</strong>
     * <p>72300001</p>
     */
    @NameInMap("know_id")
    public String knowId;

    // 电话号码
    /**
     * <strong>example:</strong>
     * <p>13260088903</p>
     */
    @NameInMap("tel")
    public String tel;

    // 外部链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.123.com">www.123.com</a></p>
     */
    @NameInMap("link")
    public String link;

    public static AvatarBubbleInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarBubbleInfo self = new AvatarBubbleInfo();
        return TeaModel.build(map, self);
    }

    public AvatarBubbleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AvatarBubbleInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AvatarBubbleInfo setKnowId(String knowId) {
        this.knowId = knowId;
        return this;
    }
    public String getKnowId() {
        return this.knowId;
    }

    public AvatarBubbleInfo setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

    public AvatarBubbleInfo setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

}
