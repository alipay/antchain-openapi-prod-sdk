// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // cell页面数据
    public class CellPageDTO : TeaModel {
        // cell数据
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<CellDO> Content { get; set; }

        // 页号
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总量
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
