// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // meter 数据
    public class MeterDataModel : TeaModel {
        // 时间
        [NameInMap("meter_date")]
        [Validation(Required=true)]
        public string MeterDate { get; set; }

        // 计量数据项
        [NameInMap("meter_data_item_list")]
        [Validation(Required=true)]
        public List<MeterDataItemModel> MeterDataItemList { get; set; }

    }

}
