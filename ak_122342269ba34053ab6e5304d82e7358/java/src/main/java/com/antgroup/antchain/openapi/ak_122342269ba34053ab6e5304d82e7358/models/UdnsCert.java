// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class UdnsCert extends TeaModel {
    // 锚定块hash
    @NameInMap("anchored_block_hash")
    public String anchoredBlockHash;

    // 锚定块高度。
    @NameInMap("anchored_block_height")
    public Long anchoredBlockHeight;

    // 区块链id
    @NameInMap("blockchain_id")
    public String blockchainId;

    // fabric 链码
    @NameInMap("chaincode")
    public String chaincode;

    // 通道名。
    @NameInMap("channel")
    public String channel;

    // {"anchoredBlockcHeight": 12345, "anchoredBlockHash": "abcefgh", "poaCertPublicKeyHashList": ["abcdefg","abcdefg"]}
    @NameInMap("detail_info")
    public String detailInfo;

    // 链域名
    @NameInMap("domain")
    public String domain;

    // 证书公钥列表	
    // 
    @NameInMap("poa_cert_public_key_hash_list")
    public java.util.List<String> poaCertPublicKeyHashList;

    // 目标公钥
    @NameInMap("subject_public_key")
    public String subjectPublicKey;

    // 目标svn
    @NameInMap("svn")
    public Long svn;

    // 区块链类型：MYCHAIN_010, FABRIC_14	
    // 
    @NameInMap("type")
    public String type;

    // base64编码后的udns
    @NameInMap("udns_base64")
    public String udnsBase64;

    // 验证者证书列表
    @NameInMap("validator_cert_list")
    public Long validatorCertList;

    // 版本号
    @NameInMap("version")
    public String version;

    public static UdnsCert build(java.util.Map<String, ?> map) throws Exception {
        UdnsCert self = new UdnsCert();
        return TeaModel.build(map, self);
    }

    public UdnsCert setAnchoredBlockHash(String anchoredBlockHash) {
        this.anchoredBlockHash = anchoredBlockHash;
        return this;
    }
    public String getAnchoredBlockHash() {
        return this.anchoredBlockHash;
    }

    public UdnsCert setAnchoredBlockHeight(Long anchoredBlockHeight) {
        this.anchoredBlockHeight = anchoredBlockHeight;
        return this;
    }
    public Long getAnchoredBlockHeight() {
        return this.anchoredBlockHeight;
    }

    public UdnsCert setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public UdnsCert setChaincode(String chaincode) {
        this.chaincode = chaincode;
        return this;
    }
    public String getChaincode() {
        return this.chaincode;
    }

    public UdnsCert setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UdnsCert setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
        return this;
    }
    public String getDetailInfo() {
        return this.detailInfo;
    }

    public UdnsCert setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UdnsCert setPoaCertPublicKeyHashList(java.util.List<String> poaCertPublicKeyHashList) {
        this.poaCertPublicKeyHashList = poaCertPublicKeyHashList;
        return this;
    }
    public java.util.List<String> getPoaCertPublicKeyHashList() {
        return this.poaCertPublicKeyHashList;
    }

    public UdnsCert setSubjectPublicKey(String subjectPublicKey) {
        this.subjectPublicKey = subjectPublicKey;
        return this;
    }
    public String getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public UdnsCert setSvn(Long svn) {
        this.svn = svn;
        return this;
    }
    public Long getSvn() {
        return this.svn;
    }

    public UdnsCert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UdnsCert setUdnsBase64(String udnsBase64) {
        this.udnsBase64 = udnsBase64;
        return this;
    }
    public String getUdnsBase64() {
        return this.udnsBase64;
    }

    public UdnsCert setValidatorCertList(Long validatorCertList) {
        this.validatorCertList = validatorCertList;
        return this;
    }
    public Long getValidatorCertList() {
        return this.validatorCertList;
    }

    public UdnsCert setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
