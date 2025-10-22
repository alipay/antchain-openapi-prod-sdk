// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 我的MCP详情VO
    public class DigitalGatewayMCPDetailVO : TeaModel {
        // server_host
        [NameInMap("server_host")]
        [Validation(Required=true)]
        public string ServerHost { get; set; }

        // server请求协议
        [NameInMap("transport_protocol")]
        [Validation(Required=true)]
        public string TransportProtocol { get; set; }

        // 网关请求令牌
        [NameInMap("server_token")]
        [Validation(Required=true)]
        public string ServerToken { get; set; }

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

        // server名称
        [NameInMap("server_name")]
        [Validation(Required=true)]
        public string ServerName { get; set; }

        // icon
        [NameInMap("icon")]
        [Validation(Required=true)]
        public string Icon { get; set; }

        // server描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // mcp上架信息（富文本）
        [NameInMap("docs")]
        [Validation(Required=true)]
        public string Docs { get; set; }

        // 工具列表
        [NameInMap("tool_list")]
        [Validation(Required=true)]
        public List<ToolInfoVO> ToolList { get; set; }

    }

}
