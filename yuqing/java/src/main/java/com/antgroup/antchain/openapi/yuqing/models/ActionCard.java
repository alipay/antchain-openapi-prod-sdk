// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class ActionCard extends TeaModel {
    // 标题
    @NameInMap("title")
    public String title;

    // 内容
    @NameInMap("text")
    public String text;

    // btn_orientation
    @NameInMap("btn_orientation")
    public String btnOrientation;

    // 简单标题
    @NameInMap("single_title")
    public String singleTitle;

    // 简单地址
    @NameInMap("single_url")
    public String singleUrl;

    // 点击
    @NameInMap("btns")
    public java.util.List<Btn> btns;

    public static ActionCard build(java.util.Map<String, ?> map) throws Exception {
        ActionCard self = new ActionCard();
        return TeaModel.build(map, self);
    }

    public ActionCard setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ActionCard setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ActionCard setBtnOrientation(String btnOrientation) {
        this.btnOrientation = btnOrientation;
        return this;
    }
    public String getBtnOrientation() {
        return this.btnOrientation;
    }

    public ActionCard setSingleTitle(String singleTitle) {
        this.singleTitle = singleTitle;
        return this;
    }
    public String getSingleTitle() {
        return this.singleTitle;
    }

    public ActionCard setSingleUrl(String singleUrl) {
        this.singleUrl = singleUrl;
        return this;
    }
    public String getSingleUrl() {
        return this.singleUrl;
    }

    public ActionCard setBtns(java.util.List<Btn> btns) {
        this.btns = btns;
        return this;
    }
    public java.util.List<Btn> getBtns() {
        return this.btns;
    }

}
