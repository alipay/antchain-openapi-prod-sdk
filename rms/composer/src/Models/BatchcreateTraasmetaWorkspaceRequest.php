<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaWorkspaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspaces
    /**
     * @var TraasWorkspaceDto[]
     */
    public $workspaces;
    protected $_name = [
        'authToken'  => 'auth_token',
        'workspaces' => 'workspaces',
    ];

    public function validate()
    {
        Model::validateRequired('workspaces', $this->workspaces, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if (null !== $this->workspaces && \is_array($this->workspaces)) {
                $n = 0;
                foreach ($this->workspaces as $item) {
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaWorkspaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = [];
                $n                 = 0;
                foreach ($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? TraasWorkspaceDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
