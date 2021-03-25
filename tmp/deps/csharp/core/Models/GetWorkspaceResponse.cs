// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetWorkspaceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // workspace 名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // workspace 显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // workspace所在regionId
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 所属租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 最近更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

        // workspace所在zoneId列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

    }

}
