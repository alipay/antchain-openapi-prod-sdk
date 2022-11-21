// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // meter 数据项
    public class MeterDataItemModel : TeaModel {
        // 计量项名称
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 计量项值
        [NameInMap("item_value")]
        [Validation(Required=true)]
        public long? ItemValue { get; set; }

    }

}
