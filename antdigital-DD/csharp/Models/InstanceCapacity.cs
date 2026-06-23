// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包结构
    public class InstanceCapacity : TeaModel {
        // 实例ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0KMMSFM00190219BMZNESCN1ZXEMO6IGIE</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 当前剩余容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("current_capacity")]
        [Validation(Required=true)]
        public string CurrentCapacity { get; set; }

        // 初始容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("initial_capacity")]
        [Validation(Required=true)]
        public string InitialCapacity { get; set; }

        // 起始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 截止时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // Valid：有效；Closed：已用完；Expired:已到期
        /// <summary>
        /// <b>Example:</b>
        /// <para>状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 资源包对应商品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KXSFFM00264687</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 关联按量商品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KKAASP00000001</para>
        /// </summary>
        [NameInMap("rel_postpay_commodity")]
        [Validation(Required=true)]
        public string RelPostpayCommodity { get; set; }

    }

}
