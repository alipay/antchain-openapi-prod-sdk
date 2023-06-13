// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ConfirmCollectorUploadfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上报文件任务ID，blockchain.bot.collector.uploadfileurl.create接口中获取
        [NameInMap("upload_id")]
        [Validation(Required=true)]
        public string UploadId { get; set; }

        // 上报数据的总数，用于和CSV文件中的数据进行核验
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
