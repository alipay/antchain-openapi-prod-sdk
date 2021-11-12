// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据库实例。
    public class Database : TeaModel {
        // acgotonecore_db_-4784849131397729849。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 数据库访问端口。
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 数据库类型。MYSQL  |  OCEANBASE。
        [NameInMap("provider")]
        [Validation(Required=false)]
        public string Provider { get; set; }

        // 实例id。
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 资源池id。
        [NameInMap("resource_pool_id")]
        [Validation(Required=false)]
        public string ResourcePoolId { get; set; }

        // 数据库访问地址。
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
