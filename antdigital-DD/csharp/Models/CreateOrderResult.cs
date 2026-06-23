// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 下单返回接口
    public class CreateOrderResult : TeaModel {
        // 下单时指定的业务流水号。二级订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088****</para>
        /// </summary>
        [NameInMap("bsn_no")]
        [Validation(Required=true)]
        public string BsnNo { get; set; }

        // 一级订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088*****</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 二级订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088*****</para>
        /// </summary>
        [NameInMap("normal_order_line_id")]
        [Validation(Required=true)]
        public string NormalOrderLineId { get; set; }

        // 订单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORDER_INIT</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 实例列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0****</para>
        /// </summary>
        [NameInMap("instance_ids")]
        [Validation(Required=true)]
        public string InstanceIds { get; set; }

        // 订购错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>订购错误码</para>
        /// </summary>
        [NameInMap("order_error_code")]
        [Validation(Required=true)]
        public string OrderErrorCode { get; set; }

        // 订购错误描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>订购错误描述</para>
        /// </summary>
        [NameInMap("order_error_description")]
        [Validation(Required=true)]
        public string OrderErrorDescription { get; set; }

    }

}
