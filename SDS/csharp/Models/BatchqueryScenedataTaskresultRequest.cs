// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class BatchqueryScenedataTaskresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次号
        [NameInMap("batch_no")]
        [Validation(Required=true, MaxLength=64)]
        public string BatchNo { get; set; }

        // 游标，上一次的最后一条
        [NameInMap("cursor")]
        [Validation(Required=false, MaxLength=256)]
        public string Cursor { get; set; }

        // 本次同步数量
        [NameInMap("sync_num")]
        [Validation(Required=false)]
        public long? SyncNum { get; set; }

    }

}
