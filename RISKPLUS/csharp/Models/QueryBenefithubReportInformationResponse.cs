// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryBenefithubReportInformationResponse : TeaModel {
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

        // 用户id
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 平台code
        [NameInMap("platform_code")]
        [Validation(Required=false)]
        public string PlatformCode { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 报案号
        [NameInMap("report_no")]
        [Validation(Required=false)]
        public string ReportNo { get; set; }

        // 报告生成时间
        [NameInMap("report_time")]
        [Validation(Required=false)]
        public string ReportTime { get; set; }

        // 报案到期时间
        [NameInMap("report_end_time")]
        [Validation(Required=false)]
        public string ReportEndTime { get; set; }

        // 报告内容
        [NameInMap("report_content")]
        [Validation(Required=false)]
        public string ReportContent { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 用户姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 身份证号
        [NameInMap("id_card")]
        [Validation(Required=false)]
        public string IdCard { get; set; }

    }

}
