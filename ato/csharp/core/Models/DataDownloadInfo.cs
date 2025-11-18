// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 数据下载信息
    public class DataDownloadInfo : TeaModel {
        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 流水号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        //  状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // TRADE_PROMISE_BILL: 交易履约账单
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 筛选开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 筛选结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 任务创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 下载结果
        [NameInMap("result_info")]
        [Validation(Required=false)]
        public string ResultInfo { get; set; }

        // 融资类型
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 放款渠道
        [NameInMap("loan_channel")]
        [Validation(Required=false)]
        public string LoanChannel { get; set; }

    }

}
