// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 通用base授权
    public class BaseAuthRequest : TeaModel {
        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // xdsadsfsdf
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public StandardAuthExtendInfoRequest ExtendInfo { get; set; }

    }

}
