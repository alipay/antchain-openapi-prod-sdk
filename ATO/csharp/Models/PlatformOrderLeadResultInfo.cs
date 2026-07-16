// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用户线索根据-平台订单、派发和备注返回结果信息
    public class PlatformOrderLeadResultInfo : TeaModel {
        // 场景名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>抖音1号直播间</para>
        /// </summary>
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 平台订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1233123123</para>
        /// </summary>
        [NameInMap("platform_order_id")]
        [Validation(Required=false)]
        public string PlatformOrderId { get; set; }

        // 平台订单派发id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1761892719822_132</para>
        /// </summary>
        [NameInMap("delivery_id")]
        [Validation(Required=false)]
        public string DeliveryId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>苹果/Apple iPhone 17 Pro</para>
        /// </summary>
        [NameInMap("product_title")]
        [Validation(Required=false)]
        public string ProductTitle { get; set; }

        // 订单提交时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-12-10 14:36:12</para>
        /// </summary>
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 用户姓名（脱敏）
        /// <summary>
        /// <b>Example:</b>
        /// <para>张**</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户手机号（脱敏）
        /// <summary>
        /// <b>Example:</b>
        /// <para>180****5678</para>
        /// </summary>
        [NameInMap("user_phone")]
        [Validation(Required=false)]
        public string UserPhone { get; set; }

        // 商家品牌名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>爱租机</para>
        /// </summary>
        [NameInMap("merchant_brand_name")]
        [Validation(Required=false)]
        public string MerchantBrandName { get; set; }

        // 商家品牌logoUrl
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://logo.png">http://logo.png</a></para>
        /// </summary>
        [NameInMap("merchant_brand_logo_url")]
        [Validation(Required=false)]
        public string MerchantBrandLogoUrl { get; set; }

        // 审核状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>WAIT_FEEDBACK：审核中 /ACCEPTED：审核通过 /REJECTED：已驳回 /CANCEL：已撤销/ SHIPPED：已发货/ PENDING_SHIPMENT：待发货</para>
        /// </summary>
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public string ApprovalStatus { get; set; }

        // 备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户电话打不通，已留言</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
