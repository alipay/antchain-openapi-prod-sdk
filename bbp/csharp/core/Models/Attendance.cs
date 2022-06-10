// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 考勤信息
    public class Attendance : TeaModel {
        // 供应商编码
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 供应商A
        [NameInMap("sup_name")]
        [Validation(Required=false)]
        public string SupName { get; set; }

        // 员工编号
        [NameInMap("job_number")]
        [Validation(Required=true)]
        public string JobNumber { get; set; }

        // 名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 考勤信息
        [NameInMap("attendance_num")]
        [Validation(Required=true)]
        public long? AttendanceNum { get; set; }

        // 级别
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

        // 创建时间
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

        // 创建者
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 时间
        [NameInMap("score_date")]
        [Validation(Required=true)]
        public string ScoreDate { get; set; }

        // 结果状态
        [NameInMap("resultstate")]
        [Validation(Required=false)]
        public string Resultstate { get; set; }

        // 工作地点
        [NameInMap("workplace")]
        [Validation(Required=false)]
        public string Workplace { get; set; }

        // 结果时间
        [NameInMap("resultdate")]
        [Validation(Required=false)]
        public string Resultdate { get; set; }

        // 确认人
        [NameInMap("resultby")]
        [Validation(Required=false)]
        public string Resultby { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
