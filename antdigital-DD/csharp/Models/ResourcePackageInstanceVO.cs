// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包实例信息VO
    public class ResourcePackageInstanceVO : TeaModel {
        // 流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101118131245</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 实例名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>实例</para>
        /// </summary>
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 资源包前端展现名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>名称</para>
        /// </summary>
        [NameInMap("resource_package_display_name")]
        [Validation(Required=false)]
        public string ResourcePackageDisplayName { get; set; }

        // 资源包商品名
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源包商品名</para>
        /// </summary>
        [NameInMap("resource_package_product_name")]
        [Validation(Required=false)]
        public string ResourcePackageProductName { get; set; }

        // 资源包可抵扣资源名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源包可抵扣资源名称</para>
        /// </summary>
        [NameInMap("applicable_product_name")]
        [Validation(Required=false)]
        public string ApplicableProductName { get; set; }

        // 当前状态-VALID、CLOSED、INVALID
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVALID</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 是否可续费
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("renewable")]
        [Validation(Required=false)]
        public bool? Renewable { get; set; }

        // 是否可升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("upgradable")]
        [Validation(Required=false)]
        public bool? Upgradable { get; set; }

        // 初始容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("initial_capacity")]
        [Validation(Required=false)]
        public string InitialCapacity { get; set; }

        // 当前容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_capacity")]
        [Validation(Required=false)]
        public string CurrentCapacity { get; set; }

        // 初始容量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("init_capacity_view_unit")]
        [Validation(Required=false)]
        public string InitCapacityViewUnit { get; set; }

        // 当前容量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_capacity_view_unit")]
        [Validation(Required=false)]
        public string CurrentCapacityViewUnit { get; set; }

        // 有效期开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 有效期结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 总资金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_fund")]
        [Validation(Required=false)]
        public string TotalFund { get; set; }

        // 剩余资金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("remain_fund")]
        [Validation(Required=false)]
        public string RemainFund { get; set; }

        // 子包信息
        [NameInMap("sub_resource_package_vos")]
        [Validation(Required=false)]
        public List<ResourcePackageLogVO> SubResourcePackageVos { get; set; }

    }

}
