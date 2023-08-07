// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryMerchantUgcimagesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ugc资产铸造记录id列表
        [NameInMap("record_id_list")]
        [Validation(Required=true)]
        public List<string> RecordIdList { get; set; }

        // 场景
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
