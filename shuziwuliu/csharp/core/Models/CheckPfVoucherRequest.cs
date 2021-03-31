// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CheckPfVoucherRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true, MaxLength=80)]
        public string FinancingSubjectDid { get; set; }

        // 运单所属平台did
        [NameInMap("platform_did")]
        [Validation(Required=true, MaxLength=80)]
        public string PlatformDid { get; set; }

        // 凭证类型，支持 WAYBILL(运单)
        [NameInMap("voucher_category")]
        [Validation(Required=true, MaxLength=100)]
        public string VoucherCategory { get; set; }

        // 支持多个，逗号隔开
        [NameInMap("voucher_ids")]
        [Validation(Required=true, MaxLength=3000)]
        public string VoucherIds { get; set; }

    }

}
