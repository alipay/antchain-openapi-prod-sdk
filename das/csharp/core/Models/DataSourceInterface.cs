// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 数据源接口定义
    public class DataSourceInterface : TeaModel {
        // 数据源接口访问地址
        [NameInMap("address")]
        [Validation(Required=true, MaxLength=100)]
        public string Address { get; set; }

        // 数据源接口请求方法类型
        [NameInMap("interface_request_method")]
        [Validation(Required=true, MaxLength=50)]
        public string InterfaceRequestMethod { get; set; }

        // 数据源接口入参列表
        [NameInMap("interface_input")]
        [Validation(Required=false)]
        public List<InterfaceInput> InterfaceInput { get; set; }

        // 数据源接口出参列表
        [NameInMap("interface_output")]
        [Validation(Required=false)]
        public List<InterfaceOutput> InterfaceOutput { get; set; }

    }

}
