// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class EchoGatewayCheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // demo
        [NameInMap("input_demo")]
        [Validation(Required=false)]
        public DemoClass InputDemo { get; set; }

        // echo
        [NameInMap("input_string")]
        [Validation(Required=false, MaxLength=20)]
        public string InputString { get; set; }

        // input_array
        [NameInMap("input_array")]
        [Validation(Required=true)]
        public List<TestStruct> InputArray { get; set; }

        // file_id
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 1
        [NameInMap("input_int")]
        [Validation(Required=true)]
        public long? InputInt { get; set; }

    }

}
