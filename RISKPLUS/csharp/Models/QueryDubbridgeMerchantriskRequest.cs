// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeMerchantriskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请单号
        [NameInMap("apply_no")]
        [Validation(Required=true)]
        public string ApplyNo { get; set; }

        // 渠道租户
        [NameInMap("channel_tenant")]
        [Validation(Required=true)]
        public string ChannelTenant { get; set; }

        // 来源类型
        [NameInMap("source_type")]
        [Validation(Required=false)]
        public string SourceType { get; set; }

    }

}
