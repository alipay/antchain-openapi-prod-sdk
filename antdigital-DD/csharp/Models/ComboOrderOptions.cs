// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 组合下单配置项
    public class ComboOrderOptions : TeaModel {
        // 是否确认下单，默认false。true：订单状态会从待确认扭转已下单，可直接发起支付。false：不可直接发起支付，需确认后才可发起支付
        /// <summary>
        /// <b>Example:</b>
        /// <para>false</para>
        /// </summary>
        [NameInMap("confirm_ordered")]
        [Validation(Required=false)]
        public bool? ConfirmOrdered { get; set; }

        // 创建订单后未发起支付前是否自动取消订单。false：不会自动取消订单。true：兜底60分钟后自动取消订单
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("auto_cancel_combo_order")]
        [Validation(Required=false)]
        public bool? AutoCancelComboOrder { get; set; }

    }

}
