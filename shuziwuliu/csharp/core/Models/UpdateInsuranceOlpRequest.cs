// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateInsuranceOlpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被保人证件号
        [NameInMap("bbr_id_no")]
        [Validation(Required=false, MaxLength=50)]
        public string BbrIdNo { get; set; }

        // 被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=false, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人类型, 1-个人 2-企业
        [NameInMap("bbr_type")]
        [Validation(Required=false, MaxLength=10)]
        public string BbrType { get; set; }

        // 保险公司编码
        [NameInMap("channel_code")]
        [Validation(Required=false, MaxLength=50)]
        public string ChannelCode { get; set; }

        // 保险公司名称
        [NameInMap("channel_name")]
        [Validation(Required=false, MaxLength=100)]
        public string ChannelName { get; set; }

        // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，CLAIMED: 已理赔
        [NameInMap("claim_status")]
        [Validation(Required=false, MaxLength=12)]
        public string ClaimStatus { get; set; }

        // 投保时间
        [NameInMap("insure_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsureDate { get; set; }

        // 保险止期
        [NameInMap("insure_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsureEnd { get; set; }

        // 保险起期
        [NameInMap("insure_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsureStart { get; set; }

        // 存证平台编码
        [NameInMap("platform_consumer_code")]
        [Validation(Required=true, MaxLength=50)]
        public string PlatformConsumerCode { get; set; }

        // 存证平台名称
        [NameInMap("platform_consumer_name")]
        [Validation(Required=false, MaxLength=100)]
        public string PlatformConsumerName { get; set; }

        // 保单文件id，可支持多个，逗号隔开
        [NameInMap("pol_file_ids")]
        [Validation(Required=false, MaxLength=3200)]
        public string PolFileIds { get; set; }

        // 保单号
        [NameInMap("pol_no")]
        [Validation(Required=true, MaxLength=100)]
        public string PolNo { get; set; }

        // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
        [NameInMap("pol_status")]
        [Validation(Required=false, MaxLength=12)]
        public string PolStatus { get; set; }

        // 电子保单url地址	
        [NameInMap("pol_url")]
        [Validation(Required=false, MaxLength=500)]
        public string PolUrl { get; set; }

        // 保费
        // 
        [NameInMap("premium")]
        [Validation(Required=false, MaxLength=20)]
        public string Premium { get; set; }

        // 险种代码
        // 
        [NameInMap("product_code")]
        [Validation(Required=false, MaxLength=50)]
        public string ProductCode { get; set; }

        // 险种名称
        // 
        [NameInMap("product_name")]
        [Validation(Required=false, MaxLength=100)]
        public string ProductName { get; set; }

        // 退保时间
        [NameInMap("surrender_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SurrenderTime { get; set; }

        // 投保人证件号
        [NameInMap("tbr_id_no")]
        [Validation(Required=false, MaxLength=50)]
        public string TbrIdNo { get; set; }

        // 投保人名称
        [NameInMap("tbr_name")]
        [Validation(Required=false, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人类型, 1-个人 2-企业
        [NameInMap("tbr_type")]
        [Validation(Required=false, MaxLength=10)]
        public string TbrType { get; set; }

        // 交易流水号
        [NameInMap("trade_no")]
        [Validation(Required=false, MaxLength=200)]
        public string TradeNo { get; set; }

    }

}
