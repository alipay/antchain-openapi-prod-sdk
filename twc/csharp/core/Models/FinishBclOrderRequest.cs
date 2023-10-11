// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class FinishBclOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租赁宝plus服务返回的订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 资方尾款金额，单位为分且最小值：1（租赁单有融资时必传）
        [NameInMap("investor_final_payment")]
        [Validation(Required=false)]
        public long? InvestorFinalPayment { get; set; }

        // 买家还款金额，单位分（提前还款，到期买断，到期归还场景必传）
        [NameInMap("buyer_repay_amount")]
        [Validation(Required=false)]
        public long? BuyerRepayAmount { get; set; }

        // 幂等号，用来保证请求幂等性，标识一次完结请求，确保同笔订单下该值唯一。
        // 注意：
        // ● clientToken只支持ASCII字符，且不能超过64个字符；
        // ● 针对同一次完结请求如果调用接口失败或异常了，重试时要保证该值不变；
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 完结场景：
        // ● BUYER_PRE_REPAY：买家提前还款 
        // ● BUYER_DUE_GIVE_BACK：买家到期归还
        // ● BUYER_DUE_BUYOUT：买家到期买断 
        // ● BUYER_BAD_DEBT：买家坏账
        // ● BUYER_CANCEL_AGREEMENT：买家解约
        // ● MERCHANT_CANCEL_ORDER：商家取消订单
        [NameInMap("finish_scene")]
        [Validation(Required=true)]
        public string FinishScene { get; set; }

        // 完结的分期信息（买家到期归还和买家到期买断场景不传，其他场景必传）
        [NameInMap("finish_installments")]
        [Validation(Required=false)]
        public List<BclFinishInstallment> FinishInstallments { get; set; }

    }

}
