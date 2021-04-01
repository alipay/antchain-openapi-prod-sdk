<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateNotaryFileRequest extends Model
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

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

    // base64加密后的存证文件内容
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
    public $token;

    // 是否使用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'location'          => 'location',
        'notaryFile'        => 'notary_file',
        'notaryName'        => 'notary_name',
        'phase'             => 'phase',
        'properties'        => 'properties',
        'token'             => 'token',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('notaryFile', $this->notaryFile, true);
        Model::validateRequired('notaryName', $this->notaryName, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('token', $this->token, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateNotaryFileRequest
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
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['notary_file'])) {
            $model->notaryFile = $map['notary_file'];
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
