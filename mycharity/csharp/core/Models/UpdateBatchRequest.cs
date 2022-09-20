// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class UpdateBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 批次暂停状态 2继续发放（领取中），3暂停发放，4领取完成
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
