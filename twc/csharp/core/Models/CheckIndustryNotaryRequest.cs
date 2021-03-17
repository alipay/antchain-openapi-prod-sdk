// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckIndustryNotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 行业类型
        [NameInMap("industry_type")]
        [Validation(Required=true)]
        public string IndustryType { get; set; }

        // 核验数据列表
        [NameInMap("notary_check_meta_list")]
        [Validation(Required=true)]
        public List<NotaryCheckMeta> NotaryCheckMetaList { get; set; }

    }

}
