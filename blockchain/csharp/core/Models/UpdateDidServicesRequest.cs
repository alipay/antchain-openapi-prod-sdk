// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDidServicesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 新增的服务信息
        [NameInMap("add_sevices")]
        [Validation(Required=false)]
        public List<DidDocServicesInfo> AddSevices { get; set; }

        // 要删除的服务id列表
        [NameInMap("del_services")]
        [Validation(Required=false)]
        public List<string> DelServices { get; set; }

        // 指定要更新的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // did类型，个人|企业|设备(IOT)
        [NameInMap("did_type")]
        [Validation(Required=true)]
        public string DidType { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
