// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 二级商户信息
    public class SubMerchantParams : TeaModel {
        // 子商户的商户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088123412341234</para>
        /// </summary>
        [NameInMap("sub_merchant_id")]
        [Validation(Required=true)]
        public string SubMerchantId { get; set; }

        // 子商户的商户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>滴滴出行</para>
        /// </summary>
        [NameInMap("sub_merchant_name")]
        [Validation(Required=true)]
        public string SubMerchantName { get; set; }

        // 子商户的服务名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>滴滴出行免密支付</para>
        /// </summary>
        [NameInMap("sub_merchant_service_name")]
        [Validation(Required=true)]
        public string SubMerchantServiceName { get; set; }

        // 子商户的服务描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>免密付车费，单次最高500</para>
        /// </summary>
        [NameInMap("sub_merchant_service_description")]
        [Validation(Required=true)]
        public string SubMerchantServiceDescription { get; set; }

    }

}
