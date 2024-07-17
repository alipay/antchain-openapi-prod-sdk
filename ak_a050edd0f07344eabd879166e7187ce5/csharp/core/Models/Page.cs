// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 其他统计类数据
    public class Page : TeaModel {
        // 页码
        [NameInMap("curreny_page")]
        [Validation(Required=true)]
        public long? CurrenyPage { get; set; }

        // 每页数据个数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总页数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
