// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // cloudconfig
    public class CloudConfigEntity : TeaModel {
        // 配置详情
        [NameInMap("cloud_config")]
        [Validation(Required=true)]
        public string CloudConfig { get; set; }

        // 操作时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 操作类型
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // admin
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
