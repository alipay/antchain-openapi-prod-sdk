<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UnbindEntityrelationRequest extends Model
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

    // [主]实体场景码
    /**
     * @var string
     */
    public $subjectScene;

    // [主]实体ID（当[主]实体平台唯一ID（subject_trustiot_id）为空时，此项不能为空）
    /**
     * @var string
     */
    public $subjectEntityId;

    // [主]实体平台唯一ID（当[主]实体ID（subject_entity_id）为空时，此项不能为空）
    /**
     * @var int
     */
    public $subjectTrustiotId;

    // 关系谓语, 取值范围：SUB_DEVICE、USER、LOCATION
    /**
     * @var string
     */
    public $predicate;

    // [宾]实体类型，取值范围：DEVICE、PERIPHERAL、LABEL、CUSTOMER_ENTITY
    /**
     * @var string
     */
    public $objectEntityType;

    // [宾]场景码（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
    /**
     * @var string
     */
    public $objectScene;

    // [宾]实体ID列表（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
    //
    /**
     * @var string[]
     */
    public $objectEntityIdList;

    // [宾]实体唯一ID列表,与[宾]实体场景码+[宾]实体ID列表（object_scene+object_entity_id）不能同时为空
    /**
     * @var int[]
     */
    public $objectTrustiotiotIdList;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'subjectScene'            => 'subject_scene',
        'subjectEntityId'         => 'subject_entity_id',
        'subjectTrustiotId'       => 'subject_trustiot_id',
        'predicate'               => 'predicate',
        'objectEntityType'        => 'object_entity_type',
        'objectScene'             => 'object_scene',
        'objectEntityIdList'      => 'object_entity_id_list',
        'objectTrustiotiotIdList' => 'object_trustiotiot_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('subjectScene', $this->subjectScene, true);
        Model::validateRequired('predicate', $this->predicate, true);
        Model::validateRequired('objectEntityType', $this->objectEntityType, true);
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
        if (null !== $this->subjectScene) {
            $res['subject_scene'] = $this->subjectScene;
        }
        if (null !== $this->subjectEntityId) {
            $res['subject_entity_id'] = $this->subjectEntityId;
        }
        if (null !== $this->subjectTrustiotId) {
            $res['subject_trustiot_id'] = $this->subjectTrustiotId;
        }
        if (null !== $this->predicate) {
            $res['predicate'] = $this->predicate;
        }
        if (null !== $this->objectEntityType) {
            $res['object_entity_type'] = $this->objectEntityType;
        }
        if (null !== $this->objectScene) {
            $res['object_scene'] = $this->objectScene;
        }
        if (null !== $this->objectEntityIdList) {
            $res['object_entity_id_list'] = $this->objectEntityIdList;
        }
        if (null !== $this->objectTrustiotiotIdList) {
            $res['object_trustiotiot_id_list'] = $this->objectTrustiotiotIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnbindEntityrelationRequest
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
        if (isset($map['subject_scene'])) {
            $model->subjectScene = $map['subject_scene'];
        }
        if (isset($map['subject_entity_id'])) {
            $model->subjectEntityId = $map['subject_entity_id'];
        }
        if (isset($map['subject_trustiot_id'])) {
            $model->subjectTrustiotId = $map['subject_trustiot_id'];
        }
        if (isset($map['predicate'])) {
            $model->predicate = $map['predicate'];
        }
        if (isset($map['object_entity_type'])) {
            $model->objectEntityType = $map['object_entity_type'];
        }
        if (isset($map['object_scene'])) {
            $model->objectScene = $map['object_scene'];
        }
        if (isset($map['object_entity_id_list'])) {
            if (!empty($map['object_entity_id_list'])) {
                $model->objectEntityIdList = $map['object_entity_id_list'];
            }
        }
        if (isset($map['object_trustiotiot_id_list'])) {
            if (!empty($map['object_trustiotiot_id_list'])) {
                $model->objectTrustiotiotIdList = $map['object_trustiotiot_id_list'];
            }
        }

        return $model;
    }
}
