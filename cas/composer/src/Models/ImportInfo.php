<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportInfo extends Model
{
    // 已导入的workspace name
    /**
     * @example wsName
     *
     * @var string
     */
    public $importedWorkspaceName;

    // vpc是否已导入workspace
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isImported;

    // 是否可以删除已导入的workspace
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isUnimportable;

    // 不可删除已导入workspace的原因
    /**
     * @example true, false
     *
     * @var string
     */
    public $unimportableReason;
    protected $_name = [
        'importedWorkspaceName' => 'imported_workspace_name',
        'isImported'            => 'is_imported',
        'isUnimportable'        => 'is_unimportable',
        'unimportableReason'    => 'unimportable_reason',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->importedWorkspaceName) {
            $res['imported_workspace_name'] = $this->importedWorkspaceName;
        }
        if (null !== $this->isImported) {
            $res['is_imported'] = $this->isImported;
        }
        if (null !== $this->isUnimportable) {
            $res['is_unimportable'] = $this->isUnimportable;
        }
        if (null !== $this->unimportableReason) {
            $res['unimportable_reason'] = $this->unimportableReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['imported_workspace_name'])) {
            $model->importedWorkspaceName = $map['imported_workspace_name'];
        }
        if (isset($map['is_imported'])) {
            $model->isImported = $map['is_imported'];
        }
        if (isset($map['is_unimportable'])) {
            $model->isUnimportable = $map['is_unimportable'];
        }
        if (isset($map['unimportable_reason'])) {
            $model->unimportableReason = $map['unimportable_reason'];
        }

        return $model;
    }
}
