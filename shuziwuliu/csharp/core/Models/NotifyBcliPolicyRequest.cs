// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class NotifyBcliPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号,格式：日期_身份标识_全局唯一序号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 投保流水号，用于关联保单
        [NameInMap("insure_trade_no")]
        [Validation(Required=true)]
        public string InsureTradeNo { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保额，金额人民币元，精确到小数点后2位
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 保费，金额人民币元，精确到小数点后2位
        [NameInMap("premium")]
        [Validation(Required=true)]
        public string Premium { get; set; }

        // 保险起期 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_start")]
        [Validation(Required=true)]
        public string InsureStart { get; set; }

        // 保险止期 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_end")]
        [Validation(Required=true)]
        public string InsureEnd { get; set; }

        // 电子保单URL,公网可以访问的URL
        [NameInMap("pol_url")]
        [Validation(Required=true)]
        public string PolUrl { get; set; }

    }

}
