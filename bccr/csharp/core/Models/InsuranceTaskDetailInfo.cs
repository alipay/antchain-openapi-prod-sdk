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
        [NameInMap("user_memo")]
        [Validation(Required=false)]
        public string UserMemo { get; set; }

        // 上门人员姓名
        [NameInMap("door_to_door_worker_name")]
        [Validation(Required=false)]
        public string DoorToDoorWorkerName { get; set; }

        // 电池包装码
        [NameInMap("battery_packaging_code")]
        [Validation(Required=false)]
        public string BatteryPackagingCode { get; set; }

        // 电池码
        [NameInMap("battery_code")]
        [Validation(Required=false)]
        public string BatteryCode { get; set; }

        // 图片列表
        [NameInMap("install_images")]
        [Validation(Required=false)]
        public List<string> InstallImages { get; set; }

        // 任务id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 任务状态
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

        // 电池型号
        [NameInMap("battery_type")]
        [Validation(Required=true)]
        public string BatteryType { get; set; }

        // 上门地址
        [NameInMap("service_address")]
        [Validation(Required=true)]
        public string ServiceAddress { get; set; }

        // 租赁人姓名
        [NameInMap("battery_renter_name")]
        [Validation(Required=true)]
        public string BatteryRenterName { get; set; }

        // 租赁人电话
        [NameInMap("battery_renter_phone")]
        [Validation(Required=true)]
        public string BatteryRenterPhone { get; set; }

        // 上门时间
        [NameInMap("service_time")]
        [Validation(Required=true)]
        public string ServiceTime { get; set; }

        // 任务所属服务商账号id
        [NameInMap("isv_account_id")]
        [Validation(Required=true)]
        public string IsvAccountId { get; set; }

    }

}
