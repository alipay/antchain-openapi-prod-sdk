// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class CheckOmngRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 手机号
        [NameInMap("mobile_phone")]
        [Validation(Required=true)]
        public string MobilePhone { get; set; }

        // 产品ID=实际产品ID#版本
        // prod#1
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商户的统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户公司名字
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 业务场景
        // 默认为CHARGING_BY_TERM
        // 
        //  CHARGING_BY_ORDER : 整单结算 
        // CHARGING_BY_TERM : 分期结算
        //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算 
        // CHARGING_BY_PROFIT : 分润结算
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 业务类型
        // LEASE : 租赁 （默认） 
        // INSTALLMENT: 分期付款
        // 
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 签署模式
        //  NONE : 灵活签约
        [NameInMap("sign_mode")]
        [Validation(Required=true)]
        public string SignMode { get; set; }

        // 主订单信息
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public OrderInfoReq OrderInfo { get; set; }

        // 订单还款计划
        [NameInMap("promise_info")]
        [Validation(Required=true)]
        public OrderPromise PromiseInfo { get; set; }

    }

}
