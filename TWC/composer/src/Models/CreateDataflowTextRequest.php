<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateDataflowTextRequest extends Model
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

    // 用户本地加密后的存证内容
    /**
     * @var string
     */
    public $notaryContent;

    // 存证阶段
    /**
     * @var string
     */
    public $phase;

    // 存证事务id
    /**
     * @var string
     */
    public $transactionId;

    // 存证拓展信息
    /**
     * @var string
     */
    public $properties;

    // 存证类型，支持
    // ● TEXT_HASH：文本哈希
    // ● TEXT_RAW：源文本（默认）
    /**
     * @var string
     */
    public $textNotaryType;

    // 哈希算法，当存证类型为TEXT_HASH时必填，目前支持两种
    // ● SHA256
    // ● SM3
    /**
     * @var string
     */
    public $hashAlgorithm;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notaryContent'     => 'notary_content',
        'phase'             => 'phase',
        'transactionId'     => 'transaction_id',
        'properties'        => 'properties',
        'textNotaryType'    => 'text_notary_type',
        'hashAlgorithm'     => 'hash_algorithm',
    ];

    public function validate()
    {
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('phase', $this->phase, true);
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
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->textNotaryType) {
            $res['text_notary_type'] = $this->textNotaryType;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataflowTextRequest
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
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['text_notary_type'])) {
            $model->textNotaryType = $map['text_notary_type'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }

        return $model;
    }
}
