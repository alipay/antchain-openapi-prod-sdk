<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PushAuthClaimVcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    /**
     * @var string
     */
    public $bizType;

    // 申请授权的具体内容，通常由业务方对接定义，在小程序展示声明详细内容给用户，用户进行确认后，授权颁发声明。
    /**
     * @var string
     */
    public $claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    /**
     * @var string
     */
    public $claimType;

    // 业务方持有的did身份
    /**
     * @var string
     */
    public $did;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    /**
     * @var int
     */
    public $expire;

    // 申请目标did身份持有者，对声明进行授权颁发。
    /**
     * @var string
     */
    public $issuerDid;

    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
    // 1. Map<String,String> params 的key按照字典序排序
    // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
    // 3. 计算sha256(第2步结果)得到hash
    // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'claimContent'      => 'claim_content',
        'claimType'         => 'claim_type',
        'did'               => 'did',
        'expire'            => 'expire',
        'issuerDid'         => 'issuer_did',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('claimContent', $this->claimContent, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('issuerDid', $this->issuerDid, true);
        Model::validateRequired('signature', $this->signature, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->claimContent) {
            $res['claim_content'] = $this->claimContent;
        }
        if (null !== $this->claimType) {
            $res['claim_type'] = $this->claimType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAuthClaimVcRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['claim_content'])) {
            $model->claimContent = $map['claim_content'];
        }
        if (isset($map['claim_type'])) {
            $model->claimType = $map['claim_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
