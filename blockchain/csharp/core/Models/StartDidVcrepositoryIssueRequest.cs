// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryIssueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
        // 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
        // 
        [NameInMap("auth_did_list")]
        [Validation(Required=false)]
        public List<string> AuthDidList { get; set; }

        // 颁发证书声明的原始声明内容，其中claim字段为json格式
        [NameInMap("bare_claim")]
        [Validation(Required=true)]
        public BareClaim BareClaim { get; set; }

        // 过期时间，如果用不过期可以设置为：-1。
        // 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
        [NameInMap("expire")]
        [Validation(Required=true)]
        public long? Expire { get; set; }

        // 颁发证书方，该did必须为调用者自己或者自己代理的did。
        // 
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
        [NameInMap("specified_claim_id_type")]
        [Validation(Required=false)]
        public long? SpecifiedClaimIdType { get; set; }

        // 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
        // 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
        [NameInMap("type")]
        [Validation(Required=false)]
        public List<string> Type { get; set; }

        // 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
        // 如果不指定，则会随机生成一个规范的verifiable_claim_id。
        // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
        [NameInMap("verifiable_claim_id")]
        [Validation(Required=false)]
        public string VerifiableClaimId { get; set; }

        // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
        [NameInMap("verify_status_type")]
        [Validation(Required=false)]
        public string VerifyStatusType { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
