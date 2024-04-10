// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // Zhx ir 结果
    public class ZhxIrResultStruct : TeaModel {
        // 日合计交易金额指数
        [NameInMap("amt_index_v")]
        [Validation(Required=false)]
        public string AmtIndexV { get; set; }

        // 日合计交易笔数指标
        [NameInMap("trans_num_index_v")]
        [Validation(Required=false)]
        public string TransNumIndexV { get; set; }

        // 日合计交易人数指数
        [NameInMap("user_num_index_v")]
        [Validation(Required=false)]
        public string UserNumIndexV { get; set; }

        // 时间
        [NameInMap("dt")]
        [Validation(Required=false)]
        public string Dt { get; set; }

        // 城市等级
        [NameInMap("city_level")]
        [Validation(Required=false)]
        public string CityLevel { get; set; }

    }

}
