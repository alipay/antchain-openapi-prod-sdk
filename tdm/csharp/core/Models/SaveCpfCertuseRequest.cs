// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class SaveCpfCertuseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 姓名
        [NameInMap("data_owner_name")]
        [Validation(Required=true)]
        public string DataOwnerName { get; set; }

        // 用数机构ID
        [NameInMap("data_user_identity")]
        [Validation(Required=true)]
        public string DataUserIdentity { get; set; }

        // 用数机构名称
        [NameInMap("data_user_name")]
        [Validation(Required=true)]
        public string DataUserName { get; set; }

        // 用数端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 用数目的
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 用数时间
        [NameInMap("operate_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OperateTime { get; set; }

        // 扩展字段
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

    }

}
