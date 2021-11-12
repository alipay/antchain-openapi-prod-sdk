// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ImportSolutioninstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
        [NameInMap("box_data")]
        [Validation(Required=true)]
        public string BoxData { get; set; }

        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=true)]
        public string WorkNo { get; set; }

        // 花名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
