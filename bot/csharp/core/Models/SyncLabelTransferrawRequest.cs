// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SyncLabelTransferrawRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 收集标签数据
        [NameInMap("collect_label_raw_content_list")]
        [Validation(Required=true)]
        public List<CollectLabelRawContent> CollectLabelRawContentList { get; set; }

        // 业务号
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

    }

}
