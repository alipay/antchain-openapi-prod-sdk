// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-日志配置
    public class SLSConfig : TeaModel {
        // Logtail配置名称，同一Project下配置名必须唯一。
        // 只能包括小写字母、数字、连字符（-）和下划线（_）。
        // 必须以小写字母或者数字开头和结尾。
        // 长度必须为2~128字节。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 配置类型，支持plugin、file。
        [NameInMap("input_type")]
        [Validation(Required=true)]
        public string InputType { get; set; }

        // 输出类型，目前只支持LogService。
        [NameInMap("output_type")]
        [Validation(Required=false)]
        public string OutputType { get; set; }

        // 日志样例
        [NameInMap("log_sample")]
        [Validation(Required=false)]
        public string LogSample { get; set; }

        // 输入类型配置
        [NameInMap("input_detail")]
        [Validation(Required=true)]
        public SLSConfigInputDetail InputDetail { get; set; }

        // 输出类型配置
        [NameInMap("output_detail")]
        [Validation(Required=true)]
        public SLSConfigOutputDetail OutputDetail { get; set; }

    }

}
