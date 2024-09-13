// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ContentSend extends TeaModel {
    // 单条手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 变量⻓度限制：
    // “纯中⽂ 不超过 10 个字”；“数字 字⺟ 英⽂符号 不超过20 位”； “纯数字 不超过20 位” ；
    // 有序的变量值列表，按顺序替换报备的模板短信⽂本帧中的变量，列表⻓度和变量个数不⼀致会导致替换变量错误
    @NameInMap("template_param_list")
    public java.util.List<String> templateParamList;

    public static ContentSend build(java.util.Map<String, ?> map) throws Exception {
        ContentSend self = new ContentSend();
        return TeaModel.build(map, self);
    }

    public ContentSend setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContentSend setTemplateParamList(java.util.List<String> templateParamList) {
        this.templateParamList = templateParamList;
        return this;
    }
    public java.util.List<String> getTemplateParamList() {
        return this.templateParamList;
    }

}
