// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryNotaryFeedetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公证处ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 公证书类型
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 纸质公证书份数
        [NameInMap("copies")]
        [Validation(Required=false)]
        public long? Copies { get; set; }

        // 证据列表
        [NameInMap("evid_info_list")]
        [Validation(Required=true)]
        public List<EvidInfo> EvidInfoList { get; set; }

    }

}
