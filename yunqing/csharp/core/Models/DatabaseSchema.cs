// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据库schema
    public class DatabaseSchema : TeaModel {
        // 数据库方言
        [NameInMap("dialect")]
        [Validation(Required=true)]
        public string Dialect { get; set; }

        // 数据库schema名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 拓扑名称
        [NameInMap("topo_code")]
        [Validation(Required=true)]
        public string TopoCode { get; set; }

        // schema数据库变更
        [NameInMap("sql_migrations")]
        [Validation(Required=true)]
        public List<SQLMigration> SqlMigrations { get; set; }

    }

}
