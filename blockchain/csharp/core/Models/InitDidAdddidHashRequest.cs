// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitDidAdddidHashRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // {\"creator\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"created\":\"2019-08-08T13:52:02+0800\",\"service\":[{\"id\":\"didauth-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"DidAuthService\"},{\"id\":\"vcrepository-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"VerifiableClaimRepository\"},{\"id\":\"oneBid-1\",\"serviceEndpoint\":\"[{\\\"uid\\\":\\\"z50Uid\\\",\\\"tenancyId\\\":\\\"z50\\\",\\\"version\\\":\\\"v1.0\\\",\\\"releated\\\":{\\\"releatedHash\\\":\\\"hash(关联结果)\\\",\\\"releatedInfo\\\":\\\"AES(核身过程)+version\\\"}}]\",\"type\":\"oneBid\"}],\"id\":\"did:mychain:4145aac009d5e94ad68c16bd56af0bf65a0437b49046529a142de8b385ee71c1\",\"publicKey\":[{\"controller\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"id\":\"keys-1\",\"publicKey\":\"f498ee29763dd24cd8324c6e861d82ef558e7d6dac10be8b99f5c33934d5cc4f5ff49861a235c7fd4c99a99265d777e657e747164e5549195003878c7222bdcc\",\"type\":\"Secp256k1VerificationKey2018\"}],\"@context\":\"https://w3id.org/did/v1\",\"updated\":\"2019-08-08T13:52:02+0800\",\"authentication\":[\"keys-1\"]}"])
        [NameInMap("diddoc")]
        [Validation(Required=true)]
        public string Diddoc { get; set; }

        // 使用私钥对消息中其他字段进行签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
