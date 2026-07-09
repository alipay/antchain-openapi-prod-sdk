// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 用户通行证详情
    public class XrUserTicketDetail : TeaModel {
        // 业务类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_LEASE</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 所属客户
        /// <summary>
        /// <b>Example:</b>
        /// <para>QWERTYUI</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户通行证编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>8613356</para>
        /// </summary>
        [NameInMap("xr_ticket_code")]
        [Validation(Required=true)]
        public string XrTicketCode { get; set; }

        // xr通行证资源池名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源池001</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088**</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 资源id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xsadds</para>
        /// </summary>
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 资源名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源001</para>
        /// </summary>
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 用户通行证状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>待核销</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-03-28</para>
        /// </summary>
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>86871</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 核销时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("xr_verification_time")]
        [Validation(Required=false)]
        public string XrVerificationTime { get; set; }

        // 体验开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("sample_start_time")]
        [Validation(Required=false)]
        public string SampleStartTime { get; set; }

        // 体验结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("sample_end_time")]
        [Validation(Required=false)]
        public string SampleEndTime { get; set; }

        // 核销类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_DEVICE</para>
        /// </summary>
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

        // 实例名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>实例001</para>
        /// </summary>
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 体验时长，分
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("test_time")]
        [Validation(Required=true)]
        public long? TestTime { get; set; }

        // vr应用集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>vr应用集合</para>
        /// </summary>
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

    }

}
