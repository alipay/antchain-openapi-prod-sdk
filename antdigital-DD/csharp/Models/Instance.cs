// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品实例
    public class Instance : TeaModel {
        // 付费方式 PREPAY_BY_MONTH _按月预付_; AFTER_PAY_BY_HOUR _按小时后收_
        /// <summary>
        /// <b>Example:</b>
        /// <para>PREPAY_BY_MONTH</para>
        /// </summary>
        [NameInMap("charge_type")]
        [Validation(Required=false)]
        public string ChargeType { get; set; }

        // 实例当前配置
        [NameInMap("components")]
        [Validation(Required=false)]
        public List<Component> Components { get; set; }

        // 合约截止时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 实例Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0CSCMAYIBANKPWBATNA4F</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>ECS</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 续费信息
        [NameInMap("renewals")]
        [Validation(Required=false)]
        public List<Renewal> Renewals { get; set; }

        // 合约生效时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 实例状态 CREATING 创建中,FAILED 创建失败,STARTED 运行中,STOPPED 已停服,CHANGING 变配中,RELEASED 已释放
        /// <summary>
        /// <b>Example:</b>
        /// <para>STARTED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
