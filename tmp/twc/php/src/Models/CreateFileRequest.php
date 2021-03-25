<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\Location;

class CreateFileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileNotaryType' => 'file_notary_type',
        'hashAlgorithm' => 'hash_algorithm',
        'location' => 'location',
        'notaryFile' => 'notary_file',
        'notaryName' => 'notary_name',
        'phase' => 'phase',
        'properties' => 'properties',
        'transactionId' => 'transaction_id',
        'tsr' => 'tsr',
    ];
    public function validate() {
        Model::validateRequired('notaryFile', $this->notaryFile, true);
        Model::validateRequired('notaryName', $this->notaryName, true);
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
        if (null !== $this->fileNotaryType) {
            $res['file_notary_type'] = $this->fileNotaryType;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->notaryFile) {
            $res['notary_file'] = $this->notaryFile;
        }
        if (null !== $this->notaryName) {
            $res['notary_name'] = $this->notaryName;
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
     * @return CreateFileRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['file_notary_type'])){
            $model->fileNotaryType = $map['file_notary_type'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['location'])){
            $model->location = Location::fromMap($map['location']);
        }
        if(isset($map['notary_file'])){
            $model->notaryFile = $map['notary_file'];
        }
        if(isset($map['notary_name'])){
            $model->notaryName = $map['notary_name'];
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

    // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
    /**
     * @var string
     */
    public $fileNotaryType;

    // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

    // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
    /**
     * @var string
     */
    public $notaryFile;

    // 存证文件名称
    /**
     * @var string
     */
    public $notaryName;

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

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

    // 是否使用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;

}
