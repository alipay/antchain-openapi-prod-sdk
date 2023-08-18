// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 存证信息
    public class BclNotaryInfo : TeaModel {
        // 存证类型
        // 1.文件：FILE
        // 2.文本：TEXT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 存证内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 文件下载链接
        // 存证类型为FILE时此参数必填；
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 存证内容hash
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 存证哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 存证阶段描述： 
        // 1.上传履约流水：UPLOAD_PROMISE_FLOW
        // 2.上传物流信息：UPLOAD_LOGISTIC_INFO
        // 3.合同签署后文件存证：SIGNED_CONTRACT_FILE 
        // 4.租赁订单履约中存证：BCL_ORDER_PROMISING
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

    }

}
