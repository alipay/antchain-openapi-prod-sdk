// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class GetHealthcodeResponse : TeaModel {
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

        // 1：绿色 2：黄色 3：红色
        [NameInMap("health_code")]
        [Validation(Required=false)]
        public string HealthCode { get; set; }

        // 健康码失败原因
        [NameInMap("health_factor")]
        [Validation(Required=false)]
        public string HealthFactor { get; set; }

        // 行程码信息
        // 1:没去过疫情区，绿码;
        // 2:去过疫情区，红码;
        // 3:其他，黄码;
        // 0:行程信息不全;
        // -1查询失败;
        [NameInMap("travel_code")]
        [Validation(Required=false)]
        public string TravelCode { get; set; }

        // 检测类型
        [NameInMap("report_type")]
        [Validation(Required=false)]
        public string ReportType { get; set; }

        // 检测结果
        [NameInMap("report_result")]
        [Validation(Required=false)]
        public string ReportResult { get; set; }

        // 检测机构
        [NameInMap("report_organization")]
        [Validation(Required=false)]
        public string ReportOrganization { get; set; }

        // 检测时间
        [NameInMap("report_time")]
        [Validation(Required=false)]
        public string ReportTime { get; set; }

        // 疫苗接种信息：
        // 0查询失败 1未接种 2已接种一针 3完成接种
        [NameInMap("vaccination_code")]
        [Validation(Required=false)]
        public string VaccinationCode { get; set; }

    }

}
