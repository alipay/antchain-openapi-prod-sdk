<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitDidAddvcHashRequest extends Model
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

    // 可验证声明hash
    /**
     * @var string
     */
    public $contentHash;

    // 发起该交易的did
    /**
     * @var string
     */
    public $did;

    // issuer did对应的hash
    /**
     * @var string
     */
    public $issuerHash;

    // 使用私钥对消息中其他字段进行签名
    /**
     * @var string
     */
    public $requestSignature;

    // valid or invalid
    /**
     * @var string
     */
    public $status;

    // subject的did计算的hash
    /**
     * @var string
     */
    public $subjectHash;

    // 可验证声明id
    /**
     * @var string
     */
    public $vcid;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contentHash'       => 'content_hash',
        'did'               => 'did',
        'issuerHash'        => 'issuer_hash',
        'requestSignature'  => 'request_signature',
        'status'            => 'status',
        'subjectHash'       => 'subject_hash',
        'vcid'              => 'vcid',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('issuerHash', $this->issuerHash, true);
        Model::validateRequired('requestSignature', $this->requestSignature, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subjectHash', $this->subjectHash, true);
        Model::validateRequired('vcid', $this->vcid, true);
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
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->issuerHash) {
            $res['issuer_hash'] = $this->issuerHash;
        }
        if (null !== $this->requestSignature) {
            $res['request_signature'] = $this->requestSignature;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subjectHash) {
            $res['subject_hash'] = $this->subjectHash;
        }
        if (null !== $this->vcid) {
            $res['vcid'] = $this->vcid;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDidAddvcHashRequest
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
        if (isset($map['content_hash'])) {
            $model->contentHash = $map['content_hash'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['issuer_hash'])) {
            $model->issuerHash = $map['issuer_hash'];
        }
        if (isset($map['request_signature'])) {
            $model->requestSignature = $map['request_signature'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subject_hash'])) {
            $model->subjectHash = $map['subject_hash'];
        }
        if (isset($map['vcid'])) {
            $model->vcid = $map['vcid'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
