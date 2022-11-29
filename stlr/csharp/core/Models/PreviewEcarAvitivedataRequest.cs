// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class PreviewEcarAvitivedataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求统计的年份，默认为当前年份
        [NameInMap("year")]
        [Validation(Required=false)]
        public long? Year { get; set; }

        // 统计比较运算是的基准：
        // LastYear(去年同期比较),
        // CriteriaYear(同基准年比较)。
        // 默认与去年同期比较。
        [NameInMap("comparison_standard")]
        [Validation(Required=false)]
        public string ComparisonStandard { get; set; }

    }

}
