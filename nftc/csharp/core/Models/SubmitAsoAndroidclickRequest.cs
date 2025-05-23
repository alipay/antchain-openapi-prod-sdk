// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class SubmitAsoAndroidclickRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 提交的批量数据
        [NameInMap("data_list")]
        [Validation(Required=true)]
        public List<Data> DataList { get; set; }

        // 数据来源:qimai
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
