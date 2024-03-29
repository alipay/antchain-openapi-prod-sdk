// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequerySdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页数，默认1
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 页码大小，默认10，最大100
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // sdk版本号
        [NameInMap("sdk_version_str")]
        [Validation(Required=false)]
        public string SdkVersionStr { get; set; }

        // 公司名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}
