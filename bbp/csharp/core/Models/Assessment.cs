// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 考核信息
    public class Assessment : TeaModel {
        // 供应商
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 供应商B
        [NameInMap("sup_name")]
        [Validation(Required=true)]
        public string SupName { get; set; }

        // 员工号
        [NameInMap("job_number")]
        [Validation(Required=true)]
        public string JobNumber { get; set; }

        // 员工姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 考核分数
        [NameInMap("assessment_num")]
        [Validation(Required=true)]
        public long? AssessmentNum { get; set; }

        // 级别
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        // 创建时间
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

        // 管理员
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 202103
        [NameInMap("score_date")]
        [Validation(Required=true)]
        public string ScoreDate { get; set; }

        // 结果状态
        [NameInMap("resultstate")]
        [Validation(Required=true)]
        public string Resultstate { get; set; }

        // 工作地点
        [NameInMap("workplace")]
        [Validation(Required=false)]
        public string Workplace { get; set; }

        // 状态更新时间
        [NameInMap("resultdate")]
        [Validation(Required=true)]
        public string Resultdate { get; set; }

        // 确认人
        [NameInMap("resultby")]
        [Validation(Required=true)]
        public string Resultby { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
