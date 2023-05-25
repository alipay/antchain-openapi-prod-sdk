// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFININSTCHANNEL.Models
{
    // 系统参数
    public class SystemParam : TeaModel {
        // 合作方标识，由蚂蚁分配
        [NameInMap("partner")]
        [Validation(Required=true)]
        public string Partner { get; set; }

        // 功能标识，业务接口定义
        [NameInMap("function")]
        [Validation(Required=true)]
        public string Function { get; set; }

        // 请求流水号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
