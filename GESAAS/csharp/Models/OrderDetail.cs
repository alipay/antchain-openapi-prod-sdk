// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 订单详情列表
    public class OrderDetail : TeaModel {
        // 券码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1798234932684395</para>
        /// </summary>
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

    }

}
