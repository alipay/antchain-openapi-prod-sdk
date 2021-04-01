<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateNotarySourceRequest extends Model
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

    // 原文文件描述
    /**
     * @var string
     */
    public $sourceDesc;

    // base64加密后的原文文件内容
    /**
     * @var string
     */
    public $sourceFile;

    // 存证原文名称
    /**
     * @var string
     */
    public $sourceName;

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
        'phase'             => 'phase',
        'properties'        => 'properties',
        'sourceDesc'        => 'source_desc',
        'sourceFile'        => 'source_file',
        'sourceName'        => 'source_name',
        'token'             => 'token',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('sourceDesc', $this->sourceDesc, true);
        Model::validateRequired('sourceFile', $this->sourceFile, true);
        Model::validateRequired('sourceName', $this->sourceName, true);
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
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->sourceDesc) {
            $res['source_desc'] = $this->sourceDesc;
        }
        if (null !== $this->sourceFile) {
            $res['source_file'] = $this->sourceFile;
        }
        if (null !== $this->sourceName) {
            $res['source_name'] = $this->sourceName;
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
     * @return CreateNotarySourceRequest
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
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['source_desc'])) {
            $model->sourceDesc = $map['source_desc'];
        }
        if (isset($map['source_file'])) {
            $model->sourceFile = $map['source_file'];
        }
        if (isset($map['source_name'])) {
            $model->sourceName = $map['source_name'];
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
