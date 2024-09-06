// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class ContentSend extends TeaModel {
    // 单条手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 最多支持 10 个变量
    // 文字变量在使用时有长度限制： 
    // “纯中文变量 不超过 10 个字”
    // “数字 字母 英文符号 不超过 20 位” 
    // “纯数字 不超过 20 位”
    // 有序的变量列表，按顺序替换报备的模板彩信文本帧中的变量，列表长度和变量个数不一致会导致替换变量错误
    @NameInMap("template_param_list")
    @Validation(required = true)
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
