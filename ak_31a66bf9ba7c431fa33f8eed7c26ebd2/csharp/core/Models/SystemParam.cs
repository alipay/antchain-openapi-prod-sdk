// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31a66bf9ba7c431fa33f8eed7c26ebd2.Models
{
    // 标准系统参数
    public class SystemParam : TeaModel {
        // 合作伙伴
        [NameInMap("partner")]
        [Validation(Required=true)]
        public string Partner { get; set; }

        // 业务场景单元
        [NameInMap("function")]
        [Validation(Required=true)]
        public string Function { get; set; }

        // 业务幂等号
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
