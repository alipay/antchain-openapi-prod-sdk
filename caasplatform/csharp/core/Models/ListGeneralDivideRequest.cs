// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class ListGeneralDivideRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 分账方ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 分账列表起始序号
        [NameInMap("str_start_index")]
        [Validation(Required=true)]
        public string StrStartIndex { get; set; }

        // 分账明细查询截止序号
        [NameInMap("str_end_index")]
        [Validation(Required=true)]
        public string StrEndIndex { get; set; }

    }

}
