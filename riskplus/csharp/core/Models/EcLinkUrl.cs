// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-跳转链接
    public class EcLinkUrl : TeaModel {
        // 根据传输的操作类型，返回对应的URL地址
        [NameInMap("url_id")]
        [Validation(Required=false)]
        public string UrlId { get; set; }

        // 免登场景下，给到开放银行和对公认证中心的链接ID,如果对方没有，没办法以免登的形式进入银行页面。
        [NameInMap("h5id")]
        [Validation(Required=false)]
        public string H5id { get; set; }

        // 免登场景下，给到对公认证中心的数据，后续KYB需要拿到这个数据进行校验，否则会无法跳转指定地址。
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

    }

}
