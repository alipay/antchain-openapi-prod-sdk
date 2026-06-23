// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商机信息
    public class BusinessRequest : TeaModel {
        // 客户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX公司</para>
        /// </summary>
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 客户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 商机名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("business_name")]
        [Validation(Required=true)]
        public string BusinessName { get; set; }

        // 商机ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("business_status")]
        [Validation(Required=true)]
        public string BusinessStatus { get; set; }

        // 商机说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("business_explain")]
        [Validation(Required=false)]
        public string BusinessExplain { get; set; }

        // 线索来源
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 商机时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("business_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BusinessDate { get; set; }

        // 租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>BCC</para>
        /// </summary>
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 创建人工号
        /// <summary>
        /// <b>Example:</b>
        /// <para>132</para>
        /// </summary>
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 创建人花名
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX</para>
        /// </summary>
        [NameInMap("creator_nick")]
        [Validation(Required=true)]
        public string CreatorNick { get; set; }

    }

}
