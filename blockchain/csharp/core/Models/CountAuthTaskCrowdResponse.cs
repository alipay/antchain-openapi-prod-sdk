// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CountAuthTaskCrowdResponse : TeaModel {
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

        // 人群预估数量
        [NameInMap("crowd_count")]
        [Validation(Required=false)]
        public long? CrowdCount { get; set; }

        // 人群导出时间
        [NameInMap("biz_date")]
        [Validation(Required=false)]
        public string BizDate { get; set; }

        // 生效的圈选人群的设置
        [NameInMap("crowd_config_info")]
        [Validation(Required=false)]
        public string CrowdConfigInfo { get; set; }

        // EXPORTING 导出中
        // SUCCESS 导出成功
        // FAIL 导出失败
        [NameInMap("export_status")]
        [Validation(Required=false)]
        public string ExportStatus { get; set; }

    }

}
