// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateProductkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 设备端productKey
        // 
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 租户ID
        // 
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 数据模型
        // 
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // sdk前缀
        [NameInMap("sdk_version_prefix")]
        [Validation(Required=false)]
        public string SdkVersionPrefix { get; set; }

        // 制造商
        // 
        [NameInMap("manufacturer")]
        [Validation(Required=false)]
        public string Manufacturer { get; set; }

        // 顾客
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

    }

}
