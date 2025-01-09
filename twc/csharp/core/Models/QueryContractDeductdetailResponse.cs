// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractDeductdetailResponse : TeaModel {
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

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 用户支付宝uid
        [NameInMap("alipay_user_id")]
        [Validation(Required=false)]
        public string AlipayUserId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 订单创建时间
        [NameInMap("order_create_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderCreateDate { get; set; }

        // 订单状态
        [NameInMap("order_status_code")]
        [Validation(Required=false)]
        public string OrderStatusCode { get; set; }

        // 订单子状态
        [NameInMap("order_sub_status_code")]
        [Validation(Required=false)]
        public string OrderSubStatusCode { get; set; }

        // 总金额，单位为分
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 商户smid
        [NameInMap("alipay_smid")]
        [Validation(Required=false)]
        public string AlipaySmid { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 用户支付宝代扣签约协议号
        [NameInMap("alipay_agreement_no")]
        [Validation(Required=false)]
        public string AlipayAgreementNo { get; set; }

        // 履约记录
        [NameInMap("fulfillment_list")]
        [Validation(Required=false)]
        public List<string> FulfillmentList { get; set; }

    }

}
