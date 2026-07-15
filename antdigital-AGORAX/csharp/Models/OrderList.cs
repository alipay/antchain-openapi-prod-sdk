// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 发券记录列表
    public class OrderList : TeaModel {
        // 活动ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0zgNdId0nxi95b5lsNpazWYoCo5</para>
        /// </summary>
        [NameInMap("activity_id")]
        [Validation(Required=false)]
        public string ActivityId { get; set; }

        // 记录ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>b5lsNpazWYoCo5</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 奖品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

        // 触发时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-29 10:19:23</para>
        /// </summary>
        [NameInMap("send_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SendTime { get; set; }

        // 发券结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("send_status")]
        [Validation(Required=false)]
        public string SendStatus { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000911</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>[10000911]指定奖品指定金额决策参数检查异常</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

    }

}
