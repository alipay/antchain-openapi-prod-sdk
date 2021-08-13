// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UploadIpTradesalesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 上传记录的用户的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // true 只上链不走真实支付，false 上链并链下真实支付账单
        [NameInMap("only_call_blockchain")]
        [Validation(Required=true)]
        public bool? OnlyCallBlockchain { get; set; }

        // 账单结算类型：即时计费0、按周计费1、按月计费2、按季度计费3。默认0
        [NameInMap("billing_type")]
        [Validation(Required=false)]
        public long? BillingType { get; set; }

        // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
        [NameInMap("pay_return_url")]
        [Validation(Required=false)]
        public string PayReturnUrl { get; set; }

        // 授权佣金比例
        [NameInMap("auth_rate")]
        [Validation(Required=false)]
        public string AuthRate { get; set; }

        // 定向授权按量付费单价
        [NameInMap("auth_price")]
        [Validation(Required=false)]
        public string AuthPrice { get; set; }

        // 商品销售数量
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 销售金额
        [NameInMap("total_sales")]
        [Validation(Required=true)]
        public string TotalSales { get; set; }

        // 总的退款金额。不填默认为0
        [NameInMap("total_refund_sales")]
        [Validation(Required=false)]
        public string TotalRefundSales { get; set; }

        // 实付金额（授权交易）
        [NameInMap("total_payment")]
        [Validation(Required=true)]
        public string TotalPayment { get; set; }

        // 销售数据列表
        [NameInMap("ip_sales_info_list")]
        [Validation(Required=true)]
        public List<IPSalesInfo> IpSalesInfoList { get; set; }

    }

}
