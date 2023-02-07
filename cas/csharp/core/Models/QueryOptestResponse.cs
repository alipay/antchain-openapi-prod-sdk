// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryOptestResponse : TeaModel {
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

        // str
        [NameInMap("str")]
        [Validation(Required=false)]
        public string Str { get; set; }

        // lon
        [NameInMap("lon")]
        [Validation(Required=false)]
        public long? Lon { get; set; }

        // stru
        [NameInMap("stru")]
        [Validation(Required=false)]
        public VPC Stru { get; set; }

        // arr_str
        [NameInMap("arr_str")]
        [Validation(Required=false)]
        public List<string> ArrStr { get; set; }

        // arr_stru
        [NameInMap("arr_stru")]
        [Validation(Required=false)]
        public List<VPC> ArrStru { get; set; }

    }

}
