// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractAccountsealimageResponse : TeaModel {
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

        // 印章fileKey
        // 
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 印章高度
        // 
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 印章id
        // 
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章下载地址, 有效时间1小时
        // 
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 印章宽度
        // 
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

        // 业务码，0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
