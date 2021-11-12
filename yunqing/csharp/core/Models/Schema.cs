// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 数据库schema
    public class Schema : TeaModel {
        // schema所属的数据库实例信息。
        [NameInMap("database")]
        [Validation(Required=false)]
        public Database Database { get; set; }

        // schema名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 资源所属的资源池id。
        [NameInMap("resource_pool_id")]
        [Validation(Required=false)]
        public string ResourcePoolId { get; set; }

    }

}
