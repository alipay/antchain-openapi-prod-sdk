<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAgentLabelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 唯一标识数组
    /**
     * @var string[]
     */
    public $collectIds;

    // 标记是否开启告警
    // 1：开启告警
    // 0：关闭告警
    /**
     * @var int
     */
    public $label;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'collectIds'    => 'collect_ids',
        'label'         => 'label',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('collectIds', $this->collectIds, true);
        Model::validateRequired('label', $this->label, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->collectIds) {
            $res['collect_ids'] = $this->collectIds;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAgentLabelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['collect_ids'])) {
            if (!empty($map['collect_ids'])) {
                $model->collectIds = $map['collect_ids'];
            }
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }

        return $model;
    }
}
