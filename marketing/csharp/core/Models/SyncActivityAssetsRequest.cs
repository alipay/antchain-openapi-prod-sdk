// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class SyncActivityAssetsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 情报标识
        [NameInMap("information_id")]
        [Validation(Required=true)]
        public string InformationId { get; set; }

        // 附件信息
        [NameInMap("attachments")]
        [Validation(Required=true)]
        public List<Attachment> Attachments { get; set; }

        // 资产详情列表
        [NameInMap("assets")]
        [Validation(Required=true)]
        public List<Asset> Assets { get; set; }

    }

}
