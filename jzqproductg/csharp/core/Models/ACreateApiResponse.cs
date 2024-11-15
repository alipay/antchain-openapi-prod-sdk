// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.JZQPRODUCTG.Models
{
    public class ACreateApiResponse : TeaModel {
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

        // 返回描述
        [NameInMap("initdesc")]
        [Validation(Required=false)]
        public string Initdesc { get; set; }

        // 结构体组合返回
        [NameInMap("init_park")]
        [Validation(Required=false)]
        public InitParkDemo InitPark { get; set; }

    }

}
