// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckStatusRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证核验数据组
        [NameInMap("notary_check_meta_list")]
        [Validation(Required=true)]
        public List<NotaryCheckMeta> NotaryCheckMetaList { get; set; }

    }

}
