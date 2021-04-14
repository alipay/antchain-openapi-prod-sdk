// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetCourtTextnotaryResponse : TeaModel {
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

        // 业务类型标识
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 数据类型标识
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 文本数据
        [NameInMap("text_content")]
        [Validation(Required=false)]
        public string TextContent { get; set; }

        // 可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

        // 对应的法院编号
        [NameInMap("agency_code")]
        [Validation(Required=false)]
        public string AgencyCode { get; set; }

        // 对应的法院应用ID
        [NameInMap("application_code")]
        [Validation(Required=false)]
        public string ApplicationCode { get; set; }

    }

}
