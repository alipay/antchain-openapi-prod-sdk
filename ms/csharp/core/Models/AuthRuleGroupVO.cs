// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务鉴权规则组
    public class AuthRuleGroupVO : TeaModel {
        // 	服务id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 是否生效，1 生效，0 未生效。默认未生效
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public long? Enabled { get; set; }

        // 最后更新日期
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 	租户实例id	
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 一份白名单或者黑名单下所有服务鉴权规则
        [NameInMap("rules")]
        [Validation(Required=true)]
        public List<AuthRuleVO> Rules { get; set; }

        // 下发是否成功, 0 失败, 1 成功, 2 部分失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // WHITELIST 或者是 BLACKLIST
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 规则组id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

    }

}
