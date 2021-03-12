// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 包含业务组的用户信息
    public class AccountInfoWithBiz : TeaModel {
        // 注册地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 业务场景code
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 业务名称
        [NameInMap("biz_name")]
        [Validation(Required=true)]
        public string BizName { get; set; }

        // 业务类型，预留
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 用户创建时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 用户注销时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 扩展字段，使用json格式
        [NameInMap("extension")]
        [Validation(Required=false, MaxLength=200)]
        public string Extension { get; set; }

        // 业务组code
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 业务组名称
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

        // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
        [NameInMap("identity_type")]
        [Validation(Required=false)]
        public long? IdentityType { get; set; }

        // 唯一标示码
        [NameInMap("identity_value")]
        [Validation(Required=false)]
        public string IdentityValue { get; set; }

        // 用户标签
        [NameInMap("label")]
        [Validation(Required=false)]
        public string Label { get; set; }

        // 间连用户的上层直连用户名称
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

        // 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("stat_date")]
        [Validation(Required=false)]
        public string StatDate { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户或企业名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户类型：direct直连，indirect间连，partner合作伙伴
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

    }

}
