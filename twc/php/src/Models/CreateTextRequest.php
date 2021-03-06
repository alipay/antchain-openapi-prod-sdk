<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\Location;

class CreateTextRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'location' => 'location',
        'notaryContent' => 'notary_content',
        'phase' => 'phase',
        'properties' => 'properties',
        'transactionId' => 'transaction_id',
        'tsr' => 'tsr',
        'textNotaryType' => 'text_notary_type',
        'hashAlgorithm' => 'hash_algorithm',
    ];
    public function validate() {
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
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
     * @return CreateTextRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['location'])){
            $model->location = Location::fromMap($map['location']);
        }
        if(isset($map['notary_content'])){
            $model->notaryContent = $map['notary_content'];
        }
        if(isset($map['phase'])){
            $model->phase = $map['phase'];
        }
        if(isset($map['properties'])){
            $model->properties = $map['properties'];
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        if(isset($map['tsr'])){
            $model->tsr = $map['tsr'];
        }
        if(isset($map['text_notary_type'])){
            $model->textNotaryType = $map['text_notary_type'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

    // 存证内容
    /**
     * @var string
     */
    public $notaryContent;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    /**
     * @var string
     */
    public $phase;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 存证事务id
    /**
     * @var string
     */
    public $transactionId;

    // 是否使用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;

    // 文本存证类型，支持源文本/文本哈希
    /**
     * @var string
     */
    public $textNotaryType;

    // 哈希算法，目前仅支持 SHA256
    /**
     * @var string
     */
    public $hashAlgorithm;

}
