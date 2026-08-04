// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 订单进件请求参数
    public class OrderFullInfoReq : TeaModel {
        // 订单号
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1798234932684395</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>15629827201</para>
        /// </summary>
        [NameInMap("mobile_phone")]
        [Validation(Required=true)]
        public string MobilePhone { get; set; }

        // 产品ID=实际产品ID#版本 prod#1	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>prod#1</para>
        /// </summary>
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商户的统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxx</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户公司名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁云创xxx有限公司</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 业务场景 默认为CHARGING_BY_TERM 
        // CHARGING_BY_ORDER : 整单结算 
        // CHARGING_BY_TERM : 分期结算
        //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
        //  CHARGING_BY_PROFIT : 分润结算
        /// <summary>
        /// <b>Example:</b>
        /// <para>CHARGING_BY_TERM</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>INSTALLMENT</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 签署模式 NONE : 灵活签约
        /// <summary>
        /// <b>Example:</b>
        /// <para>NONE</para>
        /// </summary>
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
