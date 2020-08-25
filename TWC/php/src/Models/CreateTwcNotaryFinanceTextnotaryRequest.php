<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\Location;

class CreateTwcNotaryFinanceTextnotaryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'certNo' => 'cert_no',
        'hashAlgorithm' => 'hash_algorithm',
        'location' => 'location',
        'mobile' => 'mobile',
        'phase' => 'phase',
        'properties' => 'properties',
        'textHash' => 'text_hash',
        'thirdMessageId' => 'third_message_id',
        'transactionId' => 'transaction_id',
        'tsr' => 'tsr',
        'userName' => 'user_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
        if (null !== $this->thirdMessageId) {
            $res['third_message_id'] = $this->thirdMessageId;
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
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryFinanceTextnotaryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['location'])){
            $model->location = Location::fromMap($map['location']);
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['phase'])){
            $model->phase = $map['phase'];
        }
        if(isset($map['properties'])){
            $model->properties = $map['properties'];
        }
        if(isset($map['text_hash'])){
            $model->textHash = $map['text_hash'];
        }
        if(isset($map['third_message_id'])){
            $model->thirdMessageId = $map['third_message_id'];
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        if(isset($map['tsr'])){
            $model->tsr = $map['tsr'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
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

    /**
     * @var string
     */
    public $regionName;

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

    // 本次请求的唯一id
    /**
     * @var string
     */
    public $thirdMessageId;

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

}
