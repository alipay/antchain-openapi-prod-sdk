// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 日志配置实体
    public class LogConfigEntity : TeaModel {
        // 配置名称
        [NameInMap("config_name")]
        [Validation(Required=true)]
        public string ConfigName { get; set; }

        // 输入类型
        [NameInMap("input_type")]
        [Validation(Required=true)]
        public string InputType { get; set; }

        // 日志库名称
        [NameInMap("logstore_name")]
        [Validation(Required=true)]
        public string LogstoreName { get; set; }

        // 日志目录
        [NameInMap("log_path")]
        [Validation(Required=true)]
        public string LogPath { get; set; }

        // file_pattern
        [NameInMap("file_pattern")]
        [Validation(Required=false)]
        public string FilePattern { get; set; }

    }

}
