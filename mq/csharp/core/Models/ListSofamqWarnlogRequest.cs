// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqWarnlogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标单元
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // Group ID
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 报警规则 ID
        [NameInMap("warn_id")]
        [Validation(Required=false)]
        public long? WarnId { get; set; }

    }

}
