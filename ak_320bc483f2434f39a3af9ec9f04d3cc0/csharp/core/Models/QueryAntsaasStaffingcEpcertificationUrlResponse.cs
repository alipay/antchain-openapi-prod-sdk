// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class QueryAntsaasStaffingcEpcertificationUrlResponse : TeaModel {
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

        // // 响应为表单格式，可嵌入页面，具体以返回的结果为准
        [NameInMap("result_body")]
        [Validation(Required=false)]
        public string ResultBody { get; set; }

        // 订单号（但入参为out_biz_no时传入）
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

    }

}
