// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 实施内容详情
    public class OpenSubjectCombinationVO : TeaModel {
        // 实施内容id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 实施内容名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 实施内容类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 单位
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 说明
        [NameInMap("note")]
        [Validation(Required=false)]
        public string Note { get; set; }

        // 单价是否固定，0:不固定，1:固定
        [NameInMap("price_determined_flag")]
        [Validation(Required=false)]
        public long? PriceDeterminedFlag { get; set; }

        // 单价
        [NameInMap("price")]
        [Validation(Required=false)]
        public long? Price { get; set; }

        // 预估发放个数
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public long? TotalNum { get; set; }

    }

}
