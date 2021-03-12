// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateNotarySourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 描述本条存证在存证事务中的阶段，用户可自行维护
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 原文文件描述
        [NameInMap("source_desc")]
        [Validation(Required=true)]
        public string SourceDesc { get; set; }

        // base64加密后的原文文件内容
        [NameInMap("source_file")]
        [Validation(Required=true)]
        public string SourceFile { get; set; }

        // 存证原文名称
        [NameInMap("source_name")]
        [Validation(Required=true)]
        public string SourceName { get; set; }

        // 存证事务ID
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 是否使用可信时间戳，默认为false
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
