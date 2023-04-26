// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // id,name
    public class IdListView : TeaModel {
        // 数据id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public long? DataId { get; set; }

        // 数据名称
        [NameInMap("data_name")]
        [Validation(Required=true)]
        public string DataName { get; set; }

    }

}
