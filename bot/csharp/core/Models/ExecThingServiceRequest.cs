// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecThingServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 服务标识
        [NameInMap("identifier")]
        [Validation(Required=true)]
        public string Identifier { get; set; }

        // 可信设备唯一ID
        [NameInMap("entity_id_list")]
        [Validation(Required=true)]
        public List<string> EntityIdList { get; set; }

        // 物模型服务入参
        [NameInMap("input_data")]
        [Validation(Required=false)]
        public string InputData { get; set; }

        // 实体类型
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public string EntityType { get; set; }

        // 是否使用trustiotId
        [NameInMap("use_trustiot_id")]
        [Validation(Required=true)]
        public bool? UseTrustiotId { get; set; }

    }

}
