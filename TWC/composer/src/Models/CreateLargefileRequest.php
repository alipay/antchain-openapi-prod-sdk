<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLargefileRequest extends Model
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

    // 上传至中枢文件扩展服务后得到的文件ID
    /**
     * @var string
     */
    public $fileId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'location'          => 'location',
        'transactionId'     => 'transaction_id',
        'tsr'               => 'tsr',
        'notaryName'        => 'notary_name',
        'phase'             => 'phase',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('notaryName', $this->notaryName, true);
        Model::validateRequired('phase', $this->phase, true);
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLargefileRequest
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['notary_name'])) {
            $model->notaryName = $map['notary_name'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
