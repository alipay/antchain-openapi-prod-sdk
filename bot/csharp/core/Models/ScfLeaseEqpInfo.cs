// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 菜鸟分拣机设备监控信息
    public class ScfLeaseEqpInfo : TeaModel {
        // 设备类型
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 运营日期
        [NameInMap("operation_date")]
        [Validation(Required=false)]
        public string OperationDate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 维修金比例
        [NameInMap("maintenance_money")]
        [Validation(Required=false)]
        public string MaintenanceMoney { get; set; }

        // 当日设备维修记录
        [NameInMap("maintain_record")]
        [Validation(Required=false)]
        public string MaintainRecord { get; set; }

        // 设备识别号
        [NameInMap("device_no")]
        [Validation(Required=false)]
        public string DeviceNo { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 当日分拣单数
        [NameInMap("sorting_num")]
        [Validation(Required=false)]
        public string SortingNum { get; set; }

        // 当日运营时长,单位分钟
        [NameInMap("operation_minute")]
        [Validation(Required=false)]
        public string OperationMinute { get; set; }

        // 04:00-16:00分拣单数/（派件分拣单数）
        [NameInMap("am_num")]
        [Validation(Required=false)]
        public string AmNum { get; set; }

        // 16:00-04:00分拣单数/ （揽件分拣单数)
        [NameInMap("pm_num")]
        [Validation(Required=false)]
        public string PmNum { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 设备验收日期
        [NameInMap("device_acceptance_date")]
        [Validation(Required=false)]
        public string DeviceAcceptanceDate { get; set; }

        // 数据更新时间
        [NameInMap("data_update_time")]
        [Validation(Required=false)]
        public string DataUpdateTime { get; set; }

    }

}
