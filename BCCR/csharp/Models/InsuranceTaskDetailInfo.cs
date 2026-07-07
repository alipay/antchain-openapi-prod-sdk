// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 骑行保平台任务详情
    public class InsuranceTaskDetailInfo : TeaModel {
        // 用户备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("user_memo")]
        [Validation(Required=false)]
        public string UserMemo { get; set; }

        // 上门人员姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("door_to_door_worker_name")]
        [Validation(Required=false)]
        public string DoorToDoorWorkerName { get; set; }

        // 电池包装码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ABC</para>
        /// </summary>
        [NameInMap("battery_packaging_code")]
        [Validation(Required=false)]
        public string BatteryPackagingCode { get; set; }

        // 电池码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ABC</para>
        /// </summary>
        [NameInMap("battery_code")]
        [Validation(Required=false)]
        public string BatteryCode { get; set; }

        // 图片列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;image1&quot;, &quot;image2&quot;]</para>
        /// </summary>
        [NameInMap("install_images")]
        [Validation(Required=false)]
        public List<string> InstallImages { get; set; }

        // 任务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 任务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;doorToDoorFinsh&quot; (已完成)</para>
        /// </summary>
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

        // 电池型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("battery_type")]
        [Validation(Required=true)]
        public string BatteryType { get; set; }

        // 上门地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市西湖区某小区</para>
        /// </summary>
        [NameInMap("service_address")]
        [Validation(Required=true)]
        public string ServiceAddress { get; set; }

        // 租赁人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("battery_renter_name")]
        [Validation(Required=true)]
        public string BatteryRenterName { get; set; }

        // 租赁人电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>15666666666</para>
        /// </summary>
        [NameInMap("battery_renter_phone")]
        [Validation(Required=true)]
        public string BatteryRenterPhone { get; set; }

        // 上门时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-05-16 11:00:00</para>
        /// </summary>
        [NameInMap("service_time")]
        [Validation(Required=true)]
        public string ServiceTime { get; set; }

        // 任务所属服务商账号id
        /// <summary>
        /// <b>Example:</b>
        /// <para>AC000100000000011000</para>
        /// </summary>
        [NameInMap("isv_account_id")]
        [Validation(Required=true)]
        public string IsvAccountId { get; set; }

    }

}
