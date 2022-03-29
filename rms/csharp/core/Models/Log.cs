// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 自定义监控日志
    public class Log : TeaModel {
        // 应用名列表
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<string> Apps { get; set; }

        // 采集日志文件
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 日志编码
        [NameInMap("charset")]
        [Validation(Required=false)]
        public string Charset { get; set; }

        // 日志限制流量，单位KB/min
        [NameInMap("agent_limit_k_b")]
        [Validation(Required=false)]
        public long? AgentLimitKB { get; set; }

        // 日志路径软连接描述
        [NameInMap("symlink_path")]
        [Validation(Required=false)]
        public string SymlinkPath { get; set; }

    }

}
