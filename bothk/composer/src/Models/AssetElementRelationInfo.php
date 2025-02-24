<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTHK\Models;

use AlibabaCloud\Tea\Model;

class AssetElementRelationInfo extends Model
{
    // 来源要素ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $sourceElementId;

    // 目标要素ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $targetElementId;

    // 关联类型
    /**
     * @example 1
     *
     * @var int
     */
    public $relationType;

    // 关联依据类型
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $relationDependencyType;

    // 关联依据
    /**
     * @example {...}
     *
     * @var string
     */
    public $relationDependency;

    // 项目ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $projectId;

    // 来源要素名称
    /**
     * @example 来源要素
     *
     * @var string
     */
    public $sourceElementName;

    // 目标要素名称
    /**
     * @example 目标要素
     *
     * @var string
     */
    public $targetElementName;
    protected $_name = [
        'sourceElementId'        => 'source_element_id',
        'targetElementId'        => 'target_element_id',
        'relationType'           => 'relation_type',
        'relationDependencyType' => 'relation_dependency_type',
        'relationDependency'     => 'relation_dependency',
        'projectId'              => 'project_id',
        'sourceElementName'      => 'source_element_name',
        'targetElementName'      => 'target_element_name',
    ];

    public function validate()
    {
        Model::validateRequired('sourceElementId', $this->sourceElementId, true);
        Model::validateRequired('targetElementId', $this->targetElementId, true);
        Model::validateRequired('relationType', $this->relationType, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('sourceElementName', $this->sourceElementName, true);
        Model::validateRequired('targetElementName', $this->targetElementName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sourceElementId) {
            $res['source_element_id'] = $this->sourceElementId;
        }
        if (null !== $this->targetElementId) {
            $res['target_element_id'] = $this->targetElementId;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->relationDependencyType) {
            $res['relation_dependency_type'] = $this->relationDependencyType;
        }
        if (null !== $this->relationDependency) {
            $res['relation_dependency'] = $this->relationDependency;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->sourceElementName) {
            $res['source_element_name'] = $this->sourceElementName;
        }
        if (null !== $this->targetElementName) {
            $res['target_element_name'] = $this->targetElementName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetElementRelationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source_element_id'])) {
            $model->sourceElementId = $map['source_element_id'];
        }
        if (isset($map['target_element_id'])) {
            $model->targetElementId = $map['target_element_id'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['relation_dependency_type'])) {
            $model->relationDependencyType = $map['relation_dependency_type'];
        }
        if (isset($map['relation_dependency'])) {
            $model->relationDependency = $map['relation_dependency'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['source_element_name'])) {
            $model->sourceElementName = $map['source_element_name'];
        }
        if (isset($map['target_element_name'])) {
            $model->targetElementName = $map['target_element_name'];
        }

        return $model;
    }
}
