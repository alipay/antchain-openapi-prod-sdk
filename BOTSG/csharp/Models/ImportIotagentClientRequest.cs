// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    public class ImportIotagentClientRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备标识列表
        [NameInMap("uid_list")]
        [Validation(Required=true)]
        public List<string> UidList { get; set; }

        // 实例Id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // SKU名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // 模版智能体ID
        [NameInMap("template_agent_id")]
        [Validation(Required=true)]
        public string TemplateAgentId { get; set; }

        // 智能体话题
        [NameInMap("agent_topic")]
        [Validation(Required=true)]
        public string AgentTopic { get; set; }

    }

}
