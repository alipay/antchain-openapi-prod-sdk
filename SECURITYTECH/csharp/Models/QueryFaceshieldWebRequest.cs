// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryFaceshieldWebRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户id，标识客户来源
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 设备token
        [NameInMap("apdid_token")]
        [Validation(Required=false)]
        public string ApdidToken { get; set; }

        // 切面数据（JSON，详见下方）
        [NameInMap("aop_data")]
        [Validation(Required=false)]
        public string AopData { get; set; }

        // RaaS租户
        // 
        [NameInMap("raas_products")]
        [Validation(Required=true)]
        public string RaasProducts { get; set; }

        // raas二级租户
        // 
        [NameInMap("raas_second_tenant")]
        [Validation(Required=false)]
        public string RaasSecondTenant { get; set; }

    }

}
