// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 数据源信息
    public class DataSource : TeaModel {
        // 数据源ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 数据源接口地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
