// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class PagequeryPlatformProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 项目状态（ACTIVE：激活；PAUSED：暂停）
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页码(默认为第一页)
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页面显示条数(默认10，最小为5)
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
