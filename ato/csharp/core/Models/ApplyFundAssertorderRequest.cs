// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ApplyFundAssertorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权id
        [NameInMap("auth_id")]
        [Validation(Required=true)]
        public string AuthId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户的租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商家统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 异步生成文件任务流水号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 查询开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 查询结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
        [NameInMap("filter_financing_status")]
        [Validation(Required=false)]
        public bool? FilterFinancingStatus { get; set; }

        // 是否过滤已取消订单 （无剩余应还期数），默认值false
        [NameInMap("filter_cance")]
        [Validation(Required=false)]
        public bool? FilterCance { get; set; }

        // 是否过滤提前结清订单,默认值false
        [NameInMap("filter_early_settlement")]
        [Validation(Required=false)]
        public bool? FilterEarlySettlement { get; set; }

        // 是否过滤某一期已逾期的订单,默认值false
        [NameInMap("filter_overdue")]
        [Validation(Required=false)]
        public bool? FilterOverdue { get; set; }

        // 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
        [NameInMap("filter_retry")]
        [Validation(Required=false)]
        public bool? FilterRetry { get; set; }

        // 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
        [NameInMap("filter_today_pay")]
        [Validation(Required=false)]
        public bool? FilterTodayPay { get; set; }

    }

}
