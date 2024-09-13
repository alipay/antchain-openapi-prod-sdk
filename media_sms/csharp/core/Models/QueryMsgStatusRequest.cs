// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    public class QueryMsgStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建批量发送任务
        // 时返回的批量发送
        // 任务id
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
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
