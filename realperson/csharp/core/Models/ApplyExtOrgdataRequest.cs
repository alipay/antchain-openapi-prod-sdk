// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyExtOrgdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 是	入参加密模式：
        // "0"（默认值）：不加密；
        // "4"：RSA加密
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 星火保
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 外部机构数据类型，取值如下： AXINSUR_BANK_LIVENESS：星火保蚂蚁推荐卡
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 机构上报数据，json数组
        [NameInMap("data_content")]
        [Validation(Required=true)]
        public string DataContent { get; set; }

    }

}
