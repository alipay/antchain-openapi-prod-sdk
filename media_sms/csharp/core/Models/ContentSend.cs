// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 发送内容
    public class ContentSend : TeaModel {
        // 单条手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 变量⻓度限制：
        // “纯中⽂ 不超过 10 个字”；“数字 字⺟ 英⽂符号 不超过20 位”； “纯数字 不超过20 位” ；
        // 有序的变量值列表，按顺序替换报备的模板短信⽂本帧中的变量，列表⻓度和变量个数不⼀致会导致替换变量错误
        [NameInMap("template_param_list")]
        [Validation(Required=false)]
        public List<string> TemplateParamList { get; set; }

    }

}
