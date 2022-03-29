// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api套件信息
    public class ApiSuite : TeaModel {
        // 产品码
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 套件版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 是否发布
        [NameInMap("released")]
        [Validation(Required=true)]
        public bool? Released { get; set; }

        // 版本号
        [NameInMap("version_alias")]
        [Validation(Required=true)]
        public string VersionAlias { get; set; }

    }

}
