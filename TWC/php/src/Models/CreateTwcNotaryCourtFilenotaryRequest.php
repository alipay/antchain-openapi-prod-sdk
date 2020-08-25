<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\Location;

class CreateTwcNotaryCourtFilenotaryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'agencyCode' => 'agency_code',
        'applicationCode' => 'application_code',
        'businessType' => 'business_type',
        'dataType' => 'data_type',
        'fileHash' => 'file_hash',
        'fileName' => 'file_name',
        'hashAlgorithm' => 'hash_algorithm',
        'location' => 'location',
        'phase' => 'phase',
        'properties' => 'properties',
        'transactionId' => 'transaction_id',
        'tsr' => 'tsr',
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
        if (null !== $this->agencyCode) {
            $res['agency_code'] = $this->agencyCode;
        }
        if (null !== $this->applicationCode) {
            $res['application_code'] = $this->applicationCode;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
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
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryCourtFilenotaryRequest
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
        if(isset($map['agency_code'])){
            $model->agencyCode = $map['agency_code'];
        }
        if(isset($map['application_code'])){
            $model->applicationCode = $map['application_code'];
        }
        if(isset($map['business_type'])){
            $model->businessType = $map['business_type'];
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        if(isset($map['file_hash'])){
            $model->fileHash = $map['file_hash'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['location'])){
            $model->location = Location::fromMap($map['location']);
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

    // 对应的法院编号
    /**
     * @var string
     */
    public $agencyCode;

    // 对应的法院应用ID
    /**
     * @var string
     */
    public $applicationCode;

    // 业务类型标识
    /**
     * @var string
     */
    public $businessType;

    // 数据类型标识
    /**
     * @var string
     */
    public $dataType;

    // 文件哈希
    /**
     * @var string
     */
    public $fileHash;

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // 哈希算法，目前仅支持SHA256
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 地理位置信息
    /**
     * @var Location
     */
    public $location;

    // 存证阶段
    /**
     * @var string
     */
    public $phase;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

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

}
