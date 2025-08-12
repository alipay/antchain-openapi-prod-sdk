// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class ImportIdmapPsiresultfileResponse : TeaModel {
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

        // 结果文件路径
        [NameInMap("result_file_path")]
        [Validation(Required=false)]
        public string ResultFilePath { get; set; }

        // 结果文件名称
        [NameInMap("result_file_name")]
        [Validation(Required=false)]
        public string ResultFileName { get; set; }

    }

}
