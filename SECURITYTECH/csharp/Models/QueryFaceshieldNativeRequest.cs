// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryFaceshieldNativeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户id，标识客户来源
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 设备token
        [NameInMap("apdid_token")]
        [Validation(Required=false)]
        public string ApdidToken { get; set; }

        // 切面数据（JSON，详见下方）
        // {
        // 	"sessionId": "zimId"	//人脸的bizID
        //   "rId": "rId"	//在获取活体方法人脸下发的bisToken
        //   "keyInfoHash": "keyInfoHash"	//关键信息hash
        //   "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
        //   "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
        // }
        [NameInMap("aop_data")]
        [Validation(Required=false)]
        public string AopData { get; set; }

        // 否（和切面二选一即可）
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 签名因子（和切面二选一即可）
        [NameInMap("sign_factor")]
        [Validation(Required=false)]
        public string SignFactor { get; set; }

        // RaaS租户
        [NameInMap("raas_products")]
        [Validation(Required=true)]
        public string RaasProducts { get; set; }

        // raas二级租户
        [NameInMap("raas_second_tenant")]
        [Validation(Required=false)]
        public string RaasSecondTenant { get; set; }

    }

}
