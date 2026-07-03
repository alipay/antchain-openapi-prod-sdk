// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // xr通行证券池分页返回
    public class XrTicketPoolItem : TeaModel {
        // 业务类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_LEASE</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=false)]
        public string BizScene { get; set; }

        // 通行证名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>通行证名称</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=false)]
        public string XrTicketPoolName { get; set; }

        // 资源id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-02</para>
        /// </summary>
        [NameInMap("valid_time")]
        [Validation(Required=false)]
        public string ValidTime { get; set; }

        // 体验时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>15(单位分钟)</para>
        /// </summary>
        [NameInMap("test_time")]
        [Validation(Required=false)]
        public long? TestTime { get; set; }

        // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
        /// <summary>
        /// <b>Example:</b>
        /// <para>通行证状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>USED</para>
        /// </summary>
        [NameInMap("use_status")]
        [Validation(Required=false)]
        public string UseStatus { get; set; }

        // 资源名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源名称</para>
        /// </summary>
        [NameInMap("resource_name")]
        [Validation(Required=false)]
        public string ResourceName { get; set; }

        // 设备集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>json 或数组</para>
        /// </summary>
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

        // 券池最大票数
        /// <summary>
        /// <b>Example:</b>
        /// <para>133</para>
        /// </summary>
        [NameInMap("max_pool_count")]
        [Validation(Required=false)]
        public long? MaxPoolCount { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ADSAERDS</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 核销类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_DEVICE</para>
        /// </summary>
        [NameInMap("xr_verification_type")]
        [Validation(Required=false)]
        public string XrVerificationType { get; set; }

        // 剩余可用券数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("surplus_count")]
        [Validation(Required=false)]
        public long? SurplusCount { get; set; }

        // 已发放数量 （总数-剩余数量）
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("issued_count")]
        [Validation(Required=false)]
        public long? IssuedCount { get; set; }

    }

}
