// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.EHCAIOPS.Models
{
    public class ImportCloudLogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务码
        [NameInMap("bus_code")]
        [Validation(Required=true)]
        public string BusCode { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 日志报文
        [NameInMap("log_message")]
        [Validation(Required=true)]
        public string LogMessage { get; set; }

        // 是否批量上传
        [NameInMap("batch_import")]
        [Validation(Required=false)]
        public bool? BatchImport { get; set; }

        // 日志行内元素分隔符，默认|
        [NameInMap("element_separator")]
        [Validation(Required=false)]
        public string ElementSeparator { get; set; }

        // 日志行分隔符，默认$
        [NameInMap("line_separator")]
        [Validation(Required=false)]
        public string LineSeparator { get; set; }

    }

}
