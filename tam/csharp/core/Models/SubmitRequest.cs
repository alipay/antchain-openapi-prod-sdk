// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 提交表单入参
    public class SubmitRequest : TeaModel {
        // 测试
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 问题描述（富文本）
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 影响
        [NameInMap("influence")]
        [Validation(Required=true)]
        public string Influence { get; set; }

        // 账号
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 钉钉群
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 校验令牌（接入RDS校验）
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // 验证码
        [NameInMap("verify_code")]
        [Validation(Required=true)]
        public string VerifyCode { get; set; }

        // RDS的bizNo
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 公有化PUBLIC、私有化PRIVATE
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 上传附件的URL
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public List<string> FileUrl { get; set; }

    }

}
