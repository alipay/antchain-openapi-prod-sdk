// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class DetailBlockchainBotIotsuccessProductResponse : TeaModel {
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

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        [NameInMap("service_form")]
        [Validation(Required=true)]
        public string ServiceForm { get; set; }

        // 枚举:LICENSE,INSTANCE
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public string AuthorizationMode { get; set; }

        [NameInMap("activation_type")]
        [Validation(Required=true)]
        public string ActivationType { get; set; }

        [NameInMap("network_mode")]
        [Validation(Required=false)]
        public string NetworkMode { get; set; }

        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        [NameInMap("long_memory_enabled")]
        [Validation(Required=true)]
        public bool? LongMemoryEnabled { get; set; }

        [NameInMap("created_at")]
        [Validation(Required=true)]
        public string CreatedAt { get; set; }

        [NameInMap("default_template")]
        [Validation(Required=true)]
        public OpenApiTemplateInfo DefaultTemplate { get; set; }

        [NameInMap("plugins")]
        [Validation(Required=true)]
        public List<OpenApiPluginInfo> Plugins { get; set; }

    }

}
