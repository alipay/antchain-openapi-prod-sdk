// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 套餐内商品订单结构
    public class ComboCommodityOrder : TeaModel {
        // 商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KXSFFM00264687</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>COMPLETE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 实例ID列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0BLOCKCHAINAXAXVZSE1ZXEMO6HM2S</para>
        /// </summary>
        [NameInMap("instance_ids")]
        [Validation(Required=true)]
        public List<string> InstanceIds { get; set; }

    }

}
