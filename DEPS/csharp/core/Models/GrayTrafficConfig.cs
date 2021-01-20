// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 灰度流量配置
    public class GrayTrafficConfig : TeaModel {
        // 灰度流量类型
        [NameInMap("gray_traffic_type")]
        [Validation(Required=false)]
        public string GrayTrafficType { get; set; }

        // 主机名
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // 匹配规则
        [NameInMap("match_patterns")]
        [Validation(Required=false)]
        public string MatchPatterns { get; set; }

        // 端口号
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 比例
        [NameInMap("proportion")]
        [Validation(Required=false)]
        public string Proportion { get; set; }

        // 目标 uri
        [NameInMap("target_uri")]
        [Validation(Required=false)]
        public string TargetUri { get; set; }

    }

}
