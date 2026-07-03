// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 菜鸟分拣机设备监控信息
    public class ScfLeaseEqpInfo : TeaModel {
        // 设备类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>分拣机</para>
        /// </summary>
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 运营日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>20210720</para>
        /// </summary>
        [NameInMap("operation_date")]
        [Validation(Required=false)]
        public string OperationDate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-20 14:08:17</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 维修金比例
        /// <summary>
        /// <b>Example:</b>
        /// <para>50</para>
        /// </summary>
        [NameInMap("maintenance_money")]
        [Validation(Required=false)]
        public string MaintenanceMoney { get; set; }

        // 当日设备维修记录
        /// <summary>
        /// <b>Example:</b>
        /// <para>error</para>
        /// </summary>
        [NameInMap("maintain_record")]
        [Validation(Required=false)]
        public string MaintainRecord { get; set; }

        // 设备识别号
        /// <summary>
        /// <b>Example:</b>
        /// <para>10010100101</para>
        /// </summary>
        [NameInMap("device_no")]
        [Validation(Required=false)]
        public string DeviceNo { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-20 14:08:17</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 当日分拣单数
        /// <summary>
        /// <b>Example:</b>
        /// <para>131222</para>
        /// </summary>
        [NameInMap("sorting_num")]
        [Validation(Required=false)]
        public string SortingNum { get; set; }

        // 当日运营时长,单位分钟
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231321</para>
        /// </summary>
        [NameInMap("operation_minute")]
        [Validation(Required=false)]
        public string OperationMinute { get; set; }

        // 04:00-16:00分拣单数/（派件分拣单数）
        /// <summary>
        /// <b>Example:</b>
        /// <para>130012</para>
        /// </summary>
        [NameInMap("am_num")]
        [Validation(Required=false)]
        public string AmNum { get; set; }

        // 16:00-04:00分拣单数/ （揽件分拣单数)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1210</para>
        /// </summary>
        [NameInMap("pm_num")]
        [Validation(Required=false)]
        public string PmNum { get; set; }

        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 设备验收日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-20 11:33:59</para>
        /// </summary>
        [NameInMap("device_acceptance_date")]
        [Validation(Required=false)]
        public string DeviceAcceptanceDate { get; set; }

        // 数据更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-20 11:32:35</para>
        /// </summary>
        [NameInMap("data_update_time")]
        [Validation(Required=false)]
        public string DataUpdateTime { get; set; }

    }

}
