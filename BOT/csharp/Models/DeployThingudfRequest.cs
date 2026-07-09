// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class DeployThingudfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // UDF 唯一ID
        [NameInMap("udf_id")]
        [Validation(Required=true)]
        public string UdfId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 物模型功能ID
        [NameInMap("feature_id")]
        [Validation(Required=true)]
        public string FeatureId { get; set; }

        // 租户ID
        [NameInMap("customer_tenant")]
        [Validation(Required=true)]
        public string CustomerTenant { get; set; }

        // UDF类型枚举
        [NameInMap("udf_type")]
        [Validation(Required=true)]
        public string UdfType { get; set; }

        // 物模型UDF实例表
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
