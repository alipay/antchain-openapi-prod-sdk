// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class UploadAntiImagesyncResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 防伪码码值
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 批次号
        [NameInMap("batch_no")]
        [Validation(Required=false)]
        public string BatchNo { get; set; }

        // 该批次号，已上传底图次数
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

    }

}
