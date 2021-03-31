// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditBalanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货主分布式数字身份
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 支付单运费，运费最多精确到小数点后2位
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 集团平台方分布式数字身份
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 业务发起方分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 产品id 
        // A模式：PRODUCT_MYBANK,  
        // A+模式：PRODUCT_MYBANK_A_PLUS,  
        // B模式：PRODUCT_MYBANK_B,
        // 
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
