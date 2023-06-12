// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳补偿活动数据详情
    public class CarbonOffsetActiveDataDetail : TeaModel {
        // 活动数据编号
        [NameInMap("active_data_no")]
        [Validation(Required=true)]
        public string ActiveDataNo { get; set; }

        // 活动数据名称
        [NameInMap("active_data_name")]
        [Validation(Required=false)]
        public string ActiveDataName { get; set; }

        // 活动数据单位
        [NameInMap("active_data_unit")]
        [Validation(Required=false)]
        public string ActiveDataUnit { get; set; }

        // 活动数据描述文案
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 活动数据值
        [NameInMap("active_data_value")]
        [Validation(Required=true)]
        public string ActiveDataValue { get; set; }

    }

}
