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

        // log_sample
        [NameInMap("log_sample")]
        [Validation(Required=false)]
        public string LogSample { get; set; }

        // logBeginRegex
        [NameInMap("log_begin_regex")]
        [Validation(Required=false)]
        public string LogBeginRegex { get; set; }

        // regex
        [NameInMap("regex")]
        [Validation(Required=false)]
        public string Regex { get; set; }

        // op不支持map，请传入一个可以序列化成map的字符串
        [NameInMap("docker_include_label")]
        [Validation(Required=false)]
        public string DockerIncludeLabel { get; set; }

        // OP不支持map，请传入一个可以序列化的JSON
        [NameInMap("docker_exclude_label")]
        [Validation(Required=false)]
        public string DockerExcludeLabel { get; set; }

        // file_path_blacklist
        [NameInMap("file_path_blacklist")]
        [Validation(Required=false)]
        public List<string> FilePathBlacklist { get; set; }

        // 正则表达式必填，用于提取内容
        [NameInMap("key")]
        [Validation(Required=false)]
        public List<string> Key { get; set; }

    }

}
