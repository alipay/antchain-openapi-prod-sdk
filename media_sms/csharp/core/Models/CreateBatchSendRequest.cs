// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    public class CreateBatchSendRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方群发任务id，不超过70个长度，用于幂等
        [NameInMap("mass_task_id")]
        [Validation(Required=true)]
        public string MassTaskId { get; set; }

        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 变量值需要按模板定义时的变量顺序传递且个数需要对应上
        // 最⼤1000个组包
        [NameInMap("content_list")]
        [Validation(Required=true)]
        public List<ContentSend> ContentList { get; set; }

        // 是否立即发送
        [NameInMap("send_now")]
        [Validation(Required=true)]
        public bool? SendNow { get; set; }

        // 立即发送时，该字段不消费
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public string SendTime { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 拓展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
