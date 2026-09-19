// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 账户明细
    public class FundItemDetail : TeaModel {
        // 账户类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（储值卡）
        /// <summary>
        /// <b>Example:</b>
        /// <para>POINT_PACKAGE</para>
        /// </summary>
        [NameInMap("fund_type")]
        [Validation(Required=true)]
        public string FundType { get; set; }

        // 可用金额，不含冻结占用，无可用返回0，单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.68</para>
        /// </summary>
        [NameInMap("available_amount")]
        [Validation(Required=true)]
        public string AvailableAmount { get; set; }

        // 最高可退金额，涵盖了手续费，无可用返回0，单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.68</para>
        /// </summary>
        [NameInMap("can_refund_amount")]
        [Validation(Required=true)]
        public string CanRefundAmount { get; set; }

        // 冻结金额，无冻结返回0，单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.68</para>
        /// </summary>
        [NameInMap("frozen_amount")]
        [Validation(Required=true)]
        public string FrozenAmount { get; set; }

        // 账户归属的入驻id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

    }

}
