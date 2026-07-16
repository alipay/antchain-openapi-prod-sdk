// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // (异步)解约申请信息对象
    public class AgreementTerminateApplyInfo : TeaModel {
        // 订单ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240505151148001384</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 解约申请号
        /// <summary>
        /// <b>Example:</b>
        /// <para>A123435454</para>
        /// </summary>
        [NameInMap("terminate_apply_id")]
        [Validation(Required=false)]
        public string TerminateApplyId { get; set; }

        // 订单创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-01-01 12:00:01</para>
        /// </summary>
        [NameInMap("order_gmt_create")]
        [Validation(Required=false)]
        public string OrderGmtCreate { get; set; }

        // 解约申请时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-01-01 11:12:00</para>
        /// </summary>
        [NameInMap("gmt_terminate_apply")]
        [Validation(Required=false)]
        public string GmtTerminateApply { get; set; }

        // 处理状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("handle_status")]
        [Validation(Required=false)]
        public string HandleStatus { get; set; }

        // 商家处理超时时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("merchant_handle_duration")]
        [Validation(Required=false)]
        public string MerchantHandleDuration { get; set; }

        // 商家处理超时时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>DAY</para>
        /// </summary>
        [NameInMap("merchant_handle_duration_type")]
        [Validation(Required=false)]
        public string MerchantHandleDurationType { get; set; }

    }

}
