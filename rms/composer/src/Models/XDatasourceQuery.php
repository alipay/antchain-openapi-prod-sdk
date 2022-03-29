<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XDatasourceQuery extends Model
{
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    /**
     * @example
     *
     * @var string
     */
    public $parentUuid;

    /**
     * @example
     *
     * @var string
     */
    public $name;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    /**
     * @example
     *
     * @var string
     */
    public $targetResourceKind;

    /**
     * @example
     *
     * @var string
     */
    public $targetResourceName;

    /**
     * @example
     *
     * @var string
     */
    public $ruleType;

    /**
     * @example
     *
     * @var string
     */
    public $createdBy;
    protected $_name = [
        'uuid'               => 'uuid',
        'parentUuid'         => 'parent_uuid',
        'name'               => 'name',
        'enabled'            => 'enabled',
        'targetResourceKind' => 'target_resource_kind',
        'targetResourceName' => 'target_resource_name',
        'ruleType'           => 'rule_type',
        'createdBy'          => 'created_by',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->parentUuid) {
            $res['parent_uuid'] = $this->parentUuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->targetResourceKind) {
            $res['target_resource_kind'] = $this->targetResourceKind;
        }
        if (null !== $this->targetResourceName) {
            $res['target_resource_name'] = $this->targetResourceName;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->createdBy) {
            $res['created_by'] = $this->createdBy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XDatasourceQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['parent_uuid'])) {
            $model->parentUuid = $map['parent_uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['target_resource_kind'])) {
            $model->targetResourceKind = $map['target_resource_kind'];
        }
        if (isset($map['target_resource_name'])) {
            $model->targetResourceName = $map['target_resource_name'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['created_by'])) {
            $model->createdBy = $map['created_by'];
        }

        return $model;
    }
}
