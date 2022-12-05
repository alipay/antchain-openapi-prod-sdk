// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 用户活动徽章捐赠记录
    public class ActivityRecordVO : TeaModel {
        // 捐赠类型
        [NameInMap("donate_type")]
        [Validation(Required=false)]
        public string DonateType { get; set; }

        // 捐赠详细（如：积分、金币、豆子）
        [NameInMap("donate_goods_name")]
        [Validation(Required=false)]
        public string DonateGoodsName { get; set; }

        // 数量
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 单位
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 捐赠时间
        [NameInMap("donate_time")]
        [Validation(Required=false)]
        public long? DonateTime { get; set; }

    }

}
