<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class ModelRelationship extends Model
{
    // 目标模型的唯一标识
    /**
     * @example computer
     *
     * @var string
     */
    public $destinationModelId;

    // 源模型的唯一标识（目标模型内唯一）
    /**
     * @example workspace
     *
     * @var string
     */
    public $sourceModelId;

    // 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $uniqueId;

    // 描述
    /**
     * @example 工作空间到主机的关联
     *
     * @var string
     */
    public $description;

    // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
    /**
     * @example ONE_TO_MANY
     *
     * @var string
     */
    public $relationType;

    // 是否为系统内置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $system;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;
    protected $_name = [
        'destinationModelId' => 'destination_model_id',
        'sourceModelId'      => 'source_model_id',
        'uniqueId'           => 'unique_id',
        'description'        => 'description',
        'relationType'       => 'relation_type',
        'system'             => 'system',
        'createdTime'        => 'created_time',
        'modifiedTime'       => 'modified_time',
    ];

    public function validate()
    {
        Model::validateRequired('destinationModelId', $this->destinationModelId, true);
        Model::validateRequired('sourceModelId', $this->sourceModelId, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('relationType', $this->relationType, true);
        Model::validateRequired('system', $this->system, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->destinationModelId) {
            $res['destination_model_id'] = $this->destinationModelId;
        }
        if (null !== $this->sourceModelId) {
            $res['source_model_id'] = $this->sourceModelId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->system) {
            $res['system'] = $this->system;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModelRelationship
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['destination_model_id'])) {
            $model->destinationModelId = $map['destination_model_id'];
        }
        if (isset($map['source_model_id'])) {
            $model->sourceModelId = $map['source_model_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['system'])) {
            $model->system = $map['system'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }

        return $model;
    }
}
