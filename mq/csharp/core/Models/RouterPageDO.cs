// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // router
    public class RouterPageDO : TeaModel {
        // 消息路由信息
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<RouterConfigDO> Content { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总条数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
