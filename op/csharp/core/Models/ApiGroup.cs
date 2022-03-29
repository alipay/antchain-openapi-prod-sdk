// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 分组信息
    public class ApiGroup : TeaModel {
        // 分组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 分组描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // api类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public ApiGroupTypeEnum Type { get; set; }

        // 产品
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 套件id
        [NameInMap("api_suite_id")]
        [Validation(Required=true)]
        public string ApiSuiteId { get; set; }

    }

}
