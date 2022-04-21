// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 授权扩展信息
    public class StandardAuthExtendInfoRequest : TeaModel {
        // 协议列表
        [NameInMap("agreement_list")]
        [Validation(Required=true)]
        public List<AgreementExtRequest> AgreementList { get; set; }

        // 地区请求
        [NameInMap("districtext_request")]
        [Validation(Required=true)]
        public DistrictExtRequest DistrictextRequest { get; set; }

    }

}
