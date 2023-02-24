// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationResumeResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 姓名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 性别
        [NameInMap("gender")]
        [Validation(Required=false)]
        public string Gender { get; set; }

        // 生日
        [NameInMap("birthday")]
        [Validation(Required=false)]
        public string Birthday { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 头像图片url
        [NameInMap("head_pic_url")]
        [Validation(Required=false)]
        public string HeadPicUrl { get; set; }

        // 简历技能
        [NameInMap("skills")]
        [Validation(Required=false)]
        public List<ResumeSkillInfo> Skills { get; set; }

        // 证书信息
        [NameInMap("certificates")]
        [Validation(Required=false)]
        public List<CertificatesInfo> Certificates { get; set; }

        // 工作经历
        [NameInMap("work_experiences")]
        [Validation(Required=false)]
        public List<WorkExperiencesInfo> WorkExperiences { get; set; }

        // 教育经历
        [NameInMap("education_experiences")]
        [Validation(Required=false)]
        public List<EducationExperiencesInfo> EducationExperiences { get; set; }

    }

}
