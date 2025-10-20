// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // MyMCP page分页内容信息
    public class DigitalGatewayMCPPageVO : TeaModel {
        // 空间id
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // server_id
        [NameInMap("server_id")]
        [Validation(Required=true)]
        public string ServerId { get; set; }

        // server_code
        [NameInMap("server_code")]
        [Validation(Required=true)]
        public string ServerCode { get; set; }

        // server_name
        [NameInMap("server_name")]
        [Validation(Required=true)]
        public string ServerName { get; set; }

        // icon
        [NameInMap("icon")]
        [Validation(Required=true)]
        public string Icon { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        //  mcp分类
        [NameInMap("categories")]
        [Validation(Required=true)]
        public List<string> Categories { get; set; }

    }

}
