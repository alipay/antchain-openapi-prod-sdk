// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障注入规则配置
    public class FaultInjectRuleConfigModel : TeaModel {
        // 方法名
        [NameInMap("method_name")]
        [Validation(Required=false)]
        public string MethodName { get; set; }

        // 请求类型
        [NameInMap("http_method")]
        [Validation(Required=false)]
        public string HttpMethod { get; set; }

        // 请求路径
        [NameInMap("http_path")]
        [Validation(Required=false)]
        public string HttpPath { get; set; }

        // 故障注入生效端（o:客户端生效/ i:服务端生效）
        [NameInMap("traffic_type")]
        [Validation(Required=false)]
        public string TrafficType { get; set; }

        // 资源标识
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

        // 配置项
        [NameInMap("fault_inject_rule_items")]
        [Validation(Required=false)]
        public List<FaultInjectRuleItemModel> FaultInjectRuleItems { get; set; }

    }

}
