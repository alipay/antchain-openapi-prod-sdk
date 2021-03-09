<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportVO extends Model
{
    // is_imported
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isImported;

    // imported_workspace_name
    /**
     * @example imported_workspace_name
     *
     * @var string
     */
    public $importedWorkspaceName;

    // is_unimportable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isUnimportable;

    // unimportable_reason
    /**
     * @example unimportable_reason
     *
     * @var string
     */
    public $unimportableReason;
    protected $_name = [
        'isImported'            => 'is_imported',
        'importedWorkspaceName' => 'imported_workspace_name',
        'isUnimportable'        => 'is_unimportable',
        'unimportableReason'    => 'unimportable_reason',
    ];

    public function validate()
    {
        Model::validateRequired('isImported', $this->isImported, true);
        Model::validateRequired('importedWorkspaceName', $this->importedWorkspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isImported) {
            $res['is_imported'] = $this->isImported;
        }
        if (null !== $this->importedWorkspaceName) {
            $res['imported_workspace_name'] = $this->importedWorkspaceName;
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
     * @return ImportVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_imported'])) {
            $model->isImported = $map['is_imported'];
        }
        if (isset($map['imported_workspace_name'])) {
            $model->importedWorkspaceName = $map['imported_workspace_name'];
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
