// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    //  每月的排放数据
    public class AnnualMonthEmissionDatum : TeaModel {
        // 统计的年份
        [NameInMap("year")]
        [Validation(Required=true)]
        public string Year { get; set; }

        // 统计的月份
        [NameInMap("month")]
        [Validation(Required=true)]
        public string Month { get; set; }

        // 统计排放量
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
