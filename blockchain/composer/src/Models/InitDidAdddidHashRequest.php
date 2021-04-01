<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitDidAdddidHashRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 客户did
    /**
     * @var string
     */
    public $did;

    // {\"creator\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"created\":\"2019-08-08T13:52:02+0800\",\"service\":[{\"id\":\"didauth-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"DidAuthService\"},{\"id\":\"vcrepository-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"VerifiableClaimRepository\"},{\"id\":\"oneBid-1\",\"serviceEndpoint\":\"[{\\\"uid\\\":\\\"z50Uid\\\",\\\"tenancyId\\\":\\\"z50\\\",\\\"version\\\":\\\"v1.0\\\",\\\"releated\\\":{\\\"releatedHash\\\":\\\"hash(关联结果)\\\",\\\"releatedInfo\\\":\\\"AES(核身过程)+version\\\"}}]\",\"type\":\"oneBid\"}],\"id\":\"did:mychain:4145aac009d5e94ad68c16bd56af0bf65a0437b49046529a142de8b385ee71c1\",\"publicKey\":[{\"controller\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"id\":\"keys-1\",\"publicKey\":\"f498ee29763dd24cd8324c6e861d82ef558e7d6dac10be8b99f5c33934d5cc4f5ff49861a235c7fd4c99a99265d777e657e747164e5549195003878c7222bdcc\",\"type\":\"Secp256k1VerificationKey2018\"}],\"@context\":\"https://w3id.org/did/v1\",\"updated\":\"2019-08-08T13:52:02+0800\",\"authentication\":[\"keys-1\"]}"])
    /**
     * @var string
     */
    public $diddoc;

    // 使用私钥对消息中其他字段进行签名
    /**
     * @var string
     */
    public $requestSignature;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'diddoc'            => 'diddoc',
        'requestSignature'  => 'request_signature',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('diddoc', $this->diddoc, true);
        Model::validateRequired('requestSignature', $this->requestSignature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->diddoc) {
            $res['diddoc'] = $this->diddoc;
        }
        if (null !== $this->requestSignature) {
            $res['request_signature'] = $this->requestSignature;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDidAdddidHashRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['diddoc'])) {
            $model->diddoc = $map['diddoc'];
        }
        if (isset($map['request_signature'])) {
            $model->requestSignature = $map['request_signature'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
