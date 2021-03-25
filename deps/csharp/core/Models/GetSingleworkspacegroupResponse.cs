// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetSingleworkspacegroupResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 工作空间组标识。
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // 工作空间组显示名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部署模式。
        [NameInMap("release_mode")]
        [Validation(Required=false)]
        public string ReleaseMode { get; set; }

        // 域名后缀。
        [NameInMap("domain_suffix")]
        [Validation(Required=false)]
        public string DomainSuffix { get; set; }

        // 包含工作空间名称列表。
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<string> Workspaces { get; set; }

    }

}
