// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 基本排序model
    public class BaseOrderDO : TeaModel {
        // 排序的字段名称
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 排序的关键字
        [NameInMap("dir")]
        [Validation(Required=false)]
        public string Dir { get; set; }

    }

}
