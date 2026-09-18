// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 保单信息
    public class InsureInfo : TeaModel {
        // 保单时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-04-23 12:00:01</para>
        /// </summary>
        [NameInMap("modify_time")]
        [Validation(Required=true)]
        public string ModifyTime { get; set; }

        // 蚂蚁L5产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>base</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 保险产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>A</para>
        /// </summary>
        [NameInMap("insure_product")]
        [Validation(Required=true)]
        public string InsureProduct { get; set; }

        // 保险产品价格
        /// <summary>
        /// <b>Example:</b>
        /// <para>54</para>
        /// </summary>
        [NameInMap("insure_price")]
        [Validation(Required=true)]
        public string InsurePrice { get; set; }

        // 保险品种
        /// <summary>
        /// <b>Example:</b>
        /// <para>基础险</para>
        /// </summary>
        [NameInMap("insure_type")]
        [Validation(Required=true)]
        public string InsureType { get; set; }

        // 付款方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>年付</para>
        /// </summary>
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 保险期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("insure_period")]
        [Validation(Required=true)]
        public string InsurePeriod { get; set; }

        // 保单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>生效中</para>
        /// </summary>
        [NameInMap("policy_status")]
        [Validation(Required=true)]
        public string PolicyStatus { get; set; }

        // 操作类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>投保</para>
        /// </summary>
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 保司信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91440300892305861T</para>
        /// </summary>
        [NameInMap("insure_comp_credit_no")]
        [Validation(Required=true)]
        public string InsureCompCreditNo { get; set; }

    }

}
