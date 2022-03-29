<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NavWorkspace extends Model
{
    // workspace
    /**
     * @example
     *
     * @var WorkspaceDTO
     */
    public $workspace;
    protected $_name = [
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspace) {
            $res['workspace'] = null !== $this->workspace ? $this->workspace->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NavWorkspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace'])) {
            $model->workspace = WorkspaceDTO::fromMap($map['workspace']);
        }

        return $model;
    }
}
