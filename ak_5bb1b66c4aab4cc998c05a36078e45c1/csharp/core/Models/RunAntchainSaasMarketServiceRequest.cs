// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class RunAntchainSaasMarketServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务方传入，幂等用。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // saas产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 服务code
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // 子服务code
        [NameInMap("sub_service_code")]
        [Validation(Required=false)]
        public string SubServiceCode { get; set; }

        // 服务版本
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

        // 业务参数，map格式
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<KeyValuePair> Params { get; set; }

        // 服务调用结果
        [NameInMap("result_data")]
        [Validation(Required=false)]
        public List<KeyValuePair> ResultData { get; set; }

    }

}
