// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetAccessorCurrentResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 一方化链路：
        // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
        // 蚂蚁链路：
        // 用户真实姓名
        // 
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前AK所属租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 一方化链路：
        // 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
        // 蚂蚁链路：
        // 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
