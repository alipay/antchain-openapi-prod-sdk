<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecThingServiceRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 服务标识
    /**
     * @var string
     */
    public $identifier;

    // 可信设备唯一ID
    /**
     * @var string[]
     */
    public $entityIdList;

    // 物模型服务入参
    /**
     * @var string
     */
    public $inputData;

    // 实体类型
    /**
     * @var string
     */
    public $entityType;

    // 是否使用trustiotId
    /**
     * @var bool
     */
    public $useTrustiotId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'identifier'        => 'identifier',
        'entityIdList'      => 'entity_id_list',
        'inputData'         => 'input_data',
        'entityType'        => 'entity_type',
        'useTrustiotId'     => 'use_trustiot_id',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('identifier', $this->identifier, true);
        Model::validateRequired('entityIdList', $this->entityIdList, true);
        Model::validateRequired('entityType', $this->entityType, true);
        Model::validateRequired('useTrustiotId', $this->useTrustiotId, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->identifier) {
            $res['identifier'] = $this->identifier;
        }
        if (null !== $this->entityIdList) {
            $res['entity_id_list'] = $this->entityIdList;
        }
        if (null !== $this->inputData) {
            $res['input_data'] = $this->inputData;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->useTrustiotId) {
            $res['use_trustiot_id'] = $this->useTrustiotId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecThingServiceRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['identifier'])) {
            $model->identifier = $map['identifier'];
        }
        if (isset($map['entity_id_list'])) {
            if (!empty($map['entity_id_list'])) {
                $model->entityIdList = $map['entity_id_list'];
            }
        }
        if (isset($map['input_data'])) {
            $model->inputData = $map['input_data'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['use_trustiot_id'])) {
            $model->useTrustiotId = $map['use_trustiot_id'];
        }

        return $model;
    }
}
