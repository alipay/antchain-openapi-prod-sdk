// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotsuccessProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 来自listCategories有效组合
        [NameInMap("service_form")]
        [Validation(Required=true)]
        public string ServiceForm { get; set; }

        // 枚举:LICENSE,INSTANCE
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public string AuthorizationMode { get; set; }

        // 来自listCategories的activationTypes
        [NameInMap("activation_type")]
        [Validation(Required=true)]
        public string ActivationType { get; set; }

        // 来自品类目录
        [NameInMap("network_mode")]
        [Validation(Required=false)]
        public string NetworkMode { get; set; }

        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        [NameInMap("long_memory_enabled")]
        [Validation(Required=false)]
        public bool? LongMemoryEnabled { get; set; }

    }

}
