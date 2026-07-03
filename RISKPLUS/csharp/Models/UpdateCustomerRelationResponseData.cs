// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢更新渠道返回
    public class UpdateCustomerRelationResponseData : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 渠道编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("channel_code")]
        [Validation(Required=false)]
        public string ChannelCode { get; set; }

        // 渠道id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123AA</para>
        /// </summary>
        [NameInMap("channel_no")]
        [Validation(Required=false)]
        public string ChannelNo { get; set; }

        // 客户号
        /// <summary>
        /// <b>Example:</b>
        /// <para>PCM123</para>
        /// </summary>
        [NameInMap("customer_no")]
        [Validation(Required=false)]
        public string CustomerNo { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTime { get; set; }

    }

}
