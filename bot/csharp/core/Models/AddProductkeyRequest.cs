// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddProductkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备端productKey
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 租户ID
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 数据模型
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // sdk前缀
        [NameInMap("sdk_version_prefix")]
        [Validation(Required=true)]
        public string SdkVersionPrefix { get; set; }

        // 制造商
        [NameInMap("manufacturer")]
        [Validation(Required=true)]
        public string Manufacturer { get; set; }

        // 顾客
        [NameInMap("customer")]
        [Validation(Required=true)]
        public string Customer { get; set; }

    }

}
