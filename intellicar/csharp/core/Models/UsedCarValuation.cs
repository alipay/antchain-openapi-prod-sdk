// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 二手车估价信息
    public class UsedCarValuation : TeaModel {
        // 评估金额(万)
        [NameInMap("referenceprice")]
        [Validation(Required=true)]
        public string Referenceprice { get; set; }

        // 官方报价(参考)(万)
        [NameInMap("newcarprice")]
        [Validation(Required=true)]
        public string Newcarprice { get; set; }

        // 车型图片(参考)
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
        [NameInMap("conditiona")]
        [Validation(Required=true)]
        public string Conditiona { get; set; }

        // 车况正常(万)
        [NameInMap("conditionb")]
        [Validation(Required=true)]
        public string Conditionb { get; set; }

        // 车况差(万)
        [NameInMap("conditionc")]
        [Validation(Required=true)]
        public string Conditionc { get; set; }

    }

}
