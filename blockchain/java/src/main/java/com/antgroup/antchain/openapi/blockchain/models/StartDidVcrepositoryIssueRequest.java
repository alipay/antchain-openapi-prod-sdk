// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryIssueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
    // 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
    // 
    @NameInMap("auth_did_list")
    public java.util.List<String> authDidList;

    // 颁发证书声明的原始声明内容，其中claim字段为json格式
    @NameInMap("bare_claim")
    @Validation(required = true)
    public BareClaim bareClaim;

    // 过期时间，如果用不过期可以设置为：-1。
    // 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
    @NameInMap("expire")
    @Validation(required = true)
    public Long expire;

    // 颁发证书方，该did必须为调用者自己或者自己代理的did。
    // 
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    @NameInMap("specified_claim_id_type")
    public Long specifiedClaimIdType;

    // 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
    // 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
    @NameInMap("type")
    public java.util.List<String> type;

    // 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
    // 如果不指定，则会随机生成一个规范的verifiable_claim_id。
    // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    @NameInMap("verifiable_claim_id")
    public String verifiableClaimId;

    // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
    @NameInMap("verify_status_type")
    public String verifyStatusType;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidVcrepositoryIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryIssueRequest self = new StartDidVcrepositoryIssueRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryIssueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryIssueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryIssueRequest setAuthDidList(java.util.List<String> authDidList) {
        this.authDidList = authDidList;
        return this;
    }
    public java.util.List<String> getAuthDidList() {
        return this.authDidList;
    }

    public StartDidVcrepositoryIssueRequest setBareClaim(BareClaim bareClaim) {
        this.bareClaim = bareClaim;
        return this;
    }
    public BareClaim getBareClaim() {
        return this.bareClaim;
    }

    public StartDidVcrepositoryIssueRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public StartDidVcrepositoryIssueRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public StartDidVcrepositoryIssueRequest setSpecifiedClaimIdType(Long specifiedClaimIdType) {
        this.specifiedClaimIdType = specifiedClaimIdType;
        return this;
    }
    public Long getSpecifiedClaimIdType() {
        return this.specifiedClaimIdType;
    }

    public StartDidVcrepositoryIssueRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public StartDidVcrepositoryIssueRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public StartDidVcrepositoryIssueRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

    public StartDidVcrepositoryIssueRequest setVerifyStatusType(String verifyStatusType) {
        this.verifyStatusType = verifyStatusType;
        return this;
    }
    public String getVerifyStatusType() {
        return this.verifyStatusType;
    }

    public StartDidVcrepositoryIssueRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
