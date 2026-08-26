// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 优惠券模板信息
    public class ChannelTemplateInfo : TeaModel {
        // 优惠券模板id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模板名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>国际站10美元优惠券</para>
        /// </summary>
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 模板状态,APPROVED代表审批通过的模板
        /// <summary>
        /// <b>Example:</b>
        /// <para>APPROVED</para>
        /// </summary>
        [NameInMap("template_status")]
        [Validation(Required=false)]
        public string TemplateStatus { get; set; }

        // 优惠券类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>VOUCHER</para>
        /// </summary>
        [NameInMap("coupon_type")]
        [Validation(Required=false)]
        public string CouponType { get; set; }

        // 单张优惠券的券面额，单位是 分/美分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("coupon_amount")]
        [Validation(Required=false)]
        public string CouponAmount { get; set; }

        // 券面额币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY、USD</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 模板最多允许发放的优惠券总数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("total_quota")]
        [Validation(Required=false)]
        public long? TotalQuota { get; set; }

        // 当前已经发出的优惠券数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("released_quota")]
        [Validation(Required=false)]
        public long? ReleasedQuota { get; set; }

        // 当前剩余可发数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("available_quota")]
        [Validation(Required=false)]
        public long? AvailableQuota { get; set; }

        // 模板有效期开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-08-09T10:10:00Z</para>
        /// </summary>
        [NameInMap("template_start_time")]
        [Validation(Required=false)]
        public string TemplateStartTime { get; set; }

        // 模板有效期结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-08-12T10:10:00Z</para>
        /// </summary>
        [NameInMap("template_end_time")]
        [Validation(Required=false)]
        public string TemplateEndTime { get; set; }

        // 模板适用的商品编码列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("item_codes")]
        [Validation(Required=false)]
        public List<string> ItemCodes { get; set; }

    }

}
