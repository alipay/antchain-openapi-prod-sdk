// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 人群标签枚举集合对象
    public class CrowdTagEnumResp : TeaModel {
        // 人群标签code
        [NameInMap("crowd_tag")]
        [Validation(Required=true)]
        public string CrowdTag { get; set; }

        // 人群标签枚举列表对象
        [NameInMap("crow_tag_enum_item_list")]
        [Validation(Required=true)]
        public List<CrowdTagEnumItemDTO> CrowTagEnumItemList { get; set; }

    }

}
