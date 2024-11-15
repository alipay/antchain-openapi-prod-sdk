// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class UpdateInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 需变更的实例状态
        [NameInMap("instance_status")]
        [Validation(Required=true)]
        public string InstanceStatus { get; set; }

        // 履约幂等号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // L5商品编号
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 规格属性
        [NameInMap("specification")]
        [Validation(Required=false)]
        public string Specification { get; set; }

        // 扩展信息
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 修改时间戳
        [NameInMap("version_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string VersionTimestamp { get; set; }

    }

}
