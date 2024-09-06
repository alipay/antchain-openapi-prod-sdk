// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d7c024d004594db188cee2346b384a48.Models
{
    public class QueryAntdigitalMediasmsMsgStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 群发任务id
        [NameInMap("batch_task_id")]
        [Validation(Required=true)]
        public string BatchTaskId { get; set; }

        // 手机号列表
        [NameInMap("phone_no_list")]
        [Validation(Required=true)]
        public List<string> PhoneNoList { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 拓展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
