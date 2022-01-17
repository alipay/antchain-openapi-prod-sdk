// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 联系方式分页列表
    public class ContactInfoPagedListVO : TeaModel {
        // 分页信息
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

        // 联系方式列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ContactInfoVO> List { get; set; }

    }

}
