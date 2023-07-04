// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据库变更
    public class SQLMigration : TeaModel {
        // 变更名称
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 产品升级变更sql
        [NameInMap("upgrade")]
        [Validation(Required=true)]
        public string Upgrade { get; set; }

        // 回滚变更sql
        [NameInMap("downgrade")]
        [Validation(Required=false)]
        public string Downgrade { get; set; }

    }

}
