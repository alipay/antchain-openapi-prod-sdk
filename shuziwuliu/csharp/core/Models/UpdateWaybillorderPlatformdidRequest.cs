// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateWaybillorderPlatformdidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 新平台diid
        [NameInMap("new_platform_did")]
        [Validation(Required=true)]
        public string NewPlatformDid { get; set; }

        // 老平台did
        [NameInMap("old_platform_did")]
        [Validation(Required=true)]
        public string OldPlatformDid { get; set; }

        // 运单号
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

    }

}
