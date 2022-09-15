// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class BatchcreateRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次id
        [NameInMap("batch_id")]
        [Validation(Required=true, MaxLength=50)]
        public string BatchId { get; set; }

        // 执行记录数组
        [NameInMap("received_record_list")]
        [Validation(Required=true)]
        public List<ReceivedRecord> ReceivedRecordList { get; set; }

    }

}
