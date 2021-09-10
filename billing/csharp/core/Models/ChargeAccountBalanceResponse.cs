// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class ChargeAccountBalanceResponse : TeaModel {
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

        // 支付宝网关
        [NameInMap("alipay_gateway")]
        [Validation(Required=false)]
        public string AlipayGateway { get; set; }

        // 字符编码格式   _input_charset
        [NameInMap("input_charset")]
        [Validation(Required=false)]
        public string InputCharset { get; set; }

        // 服务器异步通知页面路径
        [NameInMap("notify_url")]
        [Validation(Required=false)]
        public string NotifyUrl { get; set; }

        // 商户网站唯一订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 收款方PID
        [NameInMap("partner")]
        [Validation(Required=false)]
        public string Partner { get; set; }

        // 支付类型
        [NameInMap("payment_type")]
        [Validation(Required=false)]
        public string PaymentType { get; set; }

        // 收银台发起页面跳转同步通知页面路径
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 收款方ID
        [NameInMap("seller_id")]
        [Validation(Required=false)]
        public string SellerId { get; set; }

        // 调用的接口名
        [NameInMap("service")]
        [Validation(Required=false)]
        public string Service { get; set; }

        // 签名
        [NameInMap("sign")]
        [Validation(Required=false)]
        public string Sign { get; set; }

        // 签名类型
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public string SignType { get; set; }

        // 商品名称
        [NameInMap("subject")]
        [Validation(Required=false)]
        public string Subject { get; set; }

        // 交易金额
        [NameInMap("total_fee")]
        [Validation(Required=false)]
        public string TotalFee { get; set; }

    }

}
