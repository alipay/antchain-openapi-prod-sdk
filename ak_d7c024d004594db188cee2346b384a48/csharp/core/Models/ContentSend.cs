// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d7c024d004594db188cee2346b384a48.Models
{
    // 发送内容
    public class ContentSend : TeaModel {
        // 单条手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 最多支持 10 个变量
        // 文字变量在使用时有长度限制： 
        // “纯中文变量 不超过 10 个字”
        // “数字 字母 英文符号 不超过 20 位” 
        // “纯数字 不超过 20 位”
        // 有序的变量列表，按顺序替换报备的模板彩信文本帧中的变量，列表长度和变量个数不一致会导致替换变量错误
        [NameInMap("template_param_list")]
        [Validation(Required=true)]
        public List<string> TemplateParamList { get; set; }

    }

}
