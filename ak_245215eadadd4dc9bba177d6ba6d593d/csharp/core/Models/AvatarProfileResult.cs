// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人形象集合
    public class AvatarProfileResult : TeaModel {
        // 数字人形象数量
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 查询页面索引，不分页无
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 数字人形象列表
        [NameInMap("item_list")]
        [Validation(Required=true)]
        public List<AvatarProfile> ItemList { get; set; }

    }

}
