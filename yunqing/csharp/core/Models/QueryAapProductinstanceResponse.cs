// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class QueryAapProductinstanceResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // prod code
        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        // 产品实例名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=false)]
        public string ProdVersion { get; set; }

        // 拓扑code
        [NameInMap("topology_code")]
        [Validation(Required=false)]
        public string TopologyCode { get; set; }

        // 拓扑名称
        [NameInMap("topology_name")]
        [Validation(Required=false)]
        public string TopologyName { get; set; }

        // 产品实例状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用实例列表
        [NameInMap("app_instances")]
        [Validation(Required=false)]
        public List<ApplicationMeta> AppInstances { get; set; }

    }

}
