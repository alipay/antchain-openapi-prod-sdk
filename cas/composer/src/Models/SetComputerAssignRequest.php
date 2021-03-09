<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SetComputerAssignRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // 应用服务实例
    /**
     * @var string
     */
    public $appServiceId;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // cell信息
    /**
     * @var MapStringToStringEntity[]
     */
    public $cell;
    protected $_name = [
        'authToken'    => 'auth_token',
        'appId'        => 'app_id',
        'appServiceId' => 'app_service_id',
        'computerIds'  => 'computer_ids',
        'workspaceId'  => 'workspace_id',
        'cell'         => 'cell',
    ];

    public function validate()
    {
        Model::validateRequired('appServiceId', $this->appServiceId, true);
        Model::validateRequired('computerIds', $this->computerIds, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->cell) {
            $res['cell'] = [];
            if (null !== $this->cell && \is_array($this->cell)) {
                $n = 0;
                foreach ($this->cell as $item) {
                    $res['cell'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetComputerAssignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['cell'])) {
            if (!empty($map['cell'])) {
                $model->cell = [];
                $n           = 0;
                foreach ($map['cell'] as $item) {
                    $model->cell[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
