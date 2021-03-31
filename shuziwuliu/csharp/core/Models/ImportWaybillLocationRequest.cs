// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ImportWaybillLocationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 描述信息
        // 
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 运单轨迹信息
        [NameInMap("location")]
        [Validation(Required=true)]
        public List<LogisticLocation> Location { get; set; }

        // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
        // 
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 运单id
        // 
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

    }

}
