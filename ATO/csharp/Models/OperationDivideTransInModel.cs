// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 经营分账收入模型
    public class OperationDivideTransInModel : TeaModel {
        // 分账收入方支付宝用户id, 支付宝2088id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088****1</para>
        /// </summary>
        [NameInMap("trans_in_user_id")]
        [Validation(Required=true, MaxLength=64)]
        public string TransInUserId { get; set; }

        // 分账金额，单位为分
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("divide_amount")]
        [Validation(Required=true)]
        public long? DivideAmount { get; set; }

        // 分账描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>分账给经营商</para>
        /// </summary>
        [NameInMap("desc")]
        [Validation(Required=false, MaxLength=64)]
        public string Desc { get; set; }

    }

}
