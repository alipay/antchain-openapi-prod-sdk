// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRiskDataScoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 产品码
        [NameInMap("product_codes")]
        [Validation(Required=true)]
        public List<string> ProductCodes { get; set; }

        // 必要入参
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 二级租户
        [NameInMap("sub_tenant")]
        [Validation(Required=true)]
        public string SubTenant { get; set; }

        // 业务唯一标准
        [NameInMap("biz_unique_id")]
        [Validation(Required=false)]
        public string BizUniqueId { get; set; }

        // 加密方式
        [NameInMap("hash_type")]
        [Validation(Required=true)]
        public string HashType { get; set; }

        // 测试标识
        [NameInMap("event_data_type")]
        [Validation(Required=true)]
        public string EventDataType { get; set; }

    }

}
