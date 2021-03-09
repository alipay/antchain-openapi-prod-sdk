// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-脱敏功能配置
    public class SLSConfigSensitiveKey : TeaModel {
        // 是否替换该字段中所有的敏感内容。建议设置为true
        [NameInMap("all")]
        [Validation(Required=true)]
        public bool? All { get; set; }

        // 当type设置为const时必须填写
        [NameInMap("const_value")]
        [Validation(Required=false)]
        public string ConstValue { get; set; }

        // 日志Key名称
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 敏感内容的前缀
        [NameInMap("regex_begin")]
        [Validation(Required=true)]
        public string RegexBegin { get; set; }

        // 敏感内容正则表达式。
        [NameInMap("regex_content")]
        [Validation(Required=true)]
        public string RegexContent { get; set; }

        // 脱敏方式，取值为const、md5。
        // 若取值为const，则将敏感内容替换成const字段取值内容。
        // 若取值为md5，则将敏感内容替换为其对应的MD5值。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
