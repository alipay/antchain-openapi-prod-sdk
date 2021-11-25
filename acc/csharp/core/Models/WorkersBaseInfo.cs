// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 农民工基本信息
    public class WorkersBaseInfo : TeaModel {
        // 姓名
        [NameInMap("full_name")]
        [Validation(Required=true)]
        public string FullName { get; set; }

        // 身份证号
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 身份证有效期起
        [NameInMap("id_card_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdCardStartDate { get; set; }

        // 身份证有效期止
        [NameInMap("id_card_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdCardEndDate { get; set; }

        // 农民工个人did（实名认证后才有工号id）
        [NameInMap("workers_did")]
        [Validation(Required=false)]
        public string WorkersDid { get; set; }

        // 手机号
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 工种
        [NameInMap("work_type")]
        [Validation(Required=true)]
        public List<string> WorkType { get; set; }

        // 工作状态   [1.进场   2.退场]
        [NameInMap("work_state")]
        [Validation(Required=false)]
        public string WorkState { get; set; }

        // 进场时间
        [NameInMap("enter_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EnterTime { get; set; }

        // 退场时间
        [NameInMap("quit_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string QuitTime { get; set; }

        // 合同薪资（单位：元）
        [NameInMap("compensation")]
        [Validation(Required=false)]
        public string Compensation { get; set; }

    }

}
