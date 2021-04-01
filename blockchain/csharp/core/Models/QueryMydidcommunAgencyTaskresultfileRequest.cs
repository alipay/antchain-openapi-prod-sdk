// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryMydidcommunAgencyTaskresultfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件在数据隐私服务中标示
        [NameInMap("file_mark")]
        [Validation(Required=true)]
        public string FileMark { get; set; }

        // 结果文件拥有者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
