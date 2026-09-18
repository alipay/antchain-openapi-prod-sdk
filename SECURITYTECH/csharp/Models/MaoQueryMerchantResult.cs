// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-查询结果
    public class MaoQueryMerchantResult : TeaModel {
        // 商户号
        /// <summary>
        /// <b>Example:</b>
        /// <para>商户号</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 所属渠道租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>所属渠道租户</para>
        /// </summary>
        [NameInMap("channel_tenant")]
        [Validation(Required=false)]
        public string ChannelTenant { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>统一社会信用代码</para>
        /// </summary>
        [NameInMap("usci")]
        [Validation(Required=false)]
        public string Usci { get; set; }

        // 行业类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>行业类型</para>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 二级类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>二级类目</para>
        /// </summary>
        [NameInMap("sub_category")]
        [Validation(Required=false)]
        public string SubCategory { get; set; }

        // 入驻场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>入驻场景</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 申请单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>申请单状态</para>
        /// </summary>
        [NameInMap("apply_status")]
        [Validation(Required=false)]
        public string ApplyStatus { get; set; }

        // 商户信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("merchant_info")]
        [Validation(Required=false)]
        public MaoMerchantInfo MerchantInfo { get; set; }

        // 是否有在申请
        /// <summary>
        /// <b>Example:</b>
        /// <para>是否有在申请</para>
        /// </summary>
        [NameInMap("pending_apply")]
        [Validation(Required=false)]
        public string PendingApply { get; set; }

        // 入驻时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>入驻时间</para>
        /// </summary>
        [NameInMap("onboarding_time")]
        [Validation(Required=false)]
        public string OnboardingTime { get; set; }

    }

}
