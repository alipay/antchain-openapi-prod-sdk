<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateFinanceTextnotaryRequest extends Model
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

    // 反欺诈查询对应的身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 哈希算法
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 位置描述信息
    /**
     * @var Location
     */
    public $location;

    // 反欺诈查询需要的手机号码
    /**
     * @var string
     */
    public $mobile;

    // 存证阶段，用户可自行维护
    /**
     * @var string
     */
    public $phase;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 文本哈希
    /**
     * @var string
     */
    public $textHash;

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

    // 是否使用可信时间戳
    /**
     * @var bool
     */
    public $tsr;

    // 反欺诈查询需要的姓名
    /**
     * @var string
     */
    public $userName;

    // 本次请求的唯一id
    /**
     * @var string
     */
    public $thirdMessageId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'hashAlgorithm'     => 'hash_algorithm',
        'location'          => 'location',
        'mobile'            => 'mobile',
        'phase'             => 'phase',
        'properties'        => 'properties',
        'textHash'          => 'text_hash',
        'transactionId'     => 'transaction_id',
        'tsr'               => 'tsr',
        'userName'          => 'user_name',
        'thirdMessageId'    => 'third_message_id',
    ];

    public function validate()
    {
        Model::validateRequired('hashAlgorithm', $this->hashAlgorithm, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('textHash', $this->textHash, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->textHash) {
            $res['text_hash'] = $this->textHash;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->thirdMessageId) {
            $res['third_message_id'] = $this->thirdMessageId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFinanceTextnotaryRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['text_hash'])) {
            $model->textHash = $map['text_hash'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['third_message_id'])) {
            $model->thirdMessageId = $map['third_message_id'];
        }

        return $model;
    }
}
