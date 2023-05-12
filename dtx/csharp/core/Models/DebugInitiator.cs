// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 联调记录中的发起方信息
    public class DebugInitiator : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 数据源名
        [NameInMap("ds_name")]
        [Validation(Required=true)]
        public string DsName { get; set; }

        // 主事务记录表
        [NameInMap("activity_table_name")]
        [Validation(Required=true)]
        public string ActivityTableName { get; set; }

    }

}
