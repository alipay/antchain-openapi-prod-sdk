// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerFundmngdatadownloadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 任务类型
        // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROIMSE：融资订单用户履约信息
        // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE_ORDER：融资订单交易履约明细
        // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE:融资订单放款信息
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 融资类型
        // SUPPLY_CHAIN_FINANCE:供应链金融
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 放款渠道（根据枚举返回对应的excel模版，不作为数据筛选项）
        // ALIPAY；
        // BANK；
        [NameInMap("loan_channel")]
        [Validation(Required=false)]
        public string LoanChannel { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
