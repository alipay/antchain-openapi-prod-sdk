<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BindEntityrelationRequest extends Model
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

    // [宾]场景码（当[宾]实体唯一ID为空时，此项必填）
    /**
     * @var string
     */
    public $objectScene;

    // [宾]实体ID（当[宾]实体唯一ID为空时，此项必填）
    /**
     * @var string
     */
    public $objectEntityId;

    // [宾]平台唯一ID，与[宾]实体场景码+[宾]实体ID（object_scene+object_entity_id）不能同时为空
    /**
     * @var int
     */
    public $objectTrustiotId;

    // 绑定请求中，主语或宾语有历史关系，是否删除历史，写入新关系
    // (只处理1对1关系，即生效的前提是{RelationProperty}的maxObjectCount=1 & maxSubjectCount=1)
    /**
     * @var bool
     */
    public $upsert;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 自定义实体信息（如果object_entity_type=CUSTOMER_ENTITY，则custom_entity_info必填）
    /**
     * @var CustomEntityInfo
     */
    public $customEntityInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subjectScene'      => 'subject_scene',
        'subjectEntityId'   => 'subject_entity_id',
        'subjectTrustiotId' => 'subject_trustiot_id',
        'predicate'         => 'predicate',
        'objectEntityType'  => 'object_entity_type',
        'objectScene'       => 'object_scene',
        'objectEntityId'    => 'object_entity_id',
        'objectTrustiotId'  => 'object_trustiot_id',
        'upsert'            => 'upsert',
        'remark'            => 'remark',
        'customEntityInfo'  => 'custom_entity_info',
    ];

    public function validate()
    {
        Model::validateRequired('subjectScene', $this->subjectScene, true);
        Model::validateRequired('predicate', $this->predicate, true);
        Model::validateRequired('objectEntityType', $this->objectEntityType, true);
        Model::validateRequired('upsert', $this->upsert, true);
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
        if (null !== $this->objectEntityId) {
            $res['object_entity_id'] = $this->objectEntityId;
        }
        if (null !== $this->objectTrustiotId) {
            $res['object_trustiot_id'] = $this->objectTrustiotId;
        }
        if (null !== $this->upsert) {
            $res['upsert'] = $this->upsert;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->customEntityInfo) {
            $res['custom_entity_info'] = null !== $this->customEntityInfo ? $this->customEntityInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindEntityrelationRequest
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
        if (isset($map['object_entity_id'])) {
            $model->objectEntityId = $map['object_entity_id'];
        }
        if (isset($map['object_trustiot_id'])) {
            $model->objectTrustiotId = $map['object_trustiot_id'];
        }
        if (isset($map['upsert'])) {
            $model->upsert = $map['upsert'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['custom_entity_info'])) {
            $model->customEntityInfo = CustomEntityInfo::fromMap($map['custom_entity_info']);
        }

        return $model;
    }
}
