// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryQmpTenantActionplaninfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 页容量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 渠道code
        [NameInMap("channel_type")]
        [Validation(Required=true)]
        public string ChannelType { get; set; }

        // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
        [NameInMap("industry_tag")]
        [Validation(Required=false)]
        public string IndustryTag { get; set; }

    }

}
