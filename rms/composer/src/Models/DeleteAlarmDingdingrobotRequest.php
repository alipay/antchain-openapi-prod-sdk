<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DeleteAlarmDingdingrobotRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // 要删除的机器人列表
    /**
     * @var DingDingRobot[]
     */
    public $robots;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'robots'        => 'robots',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('robots', $this->robots, true);
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
        if (null !== $this->robots) {
            $res['robots'] = [];
            if (null !== $this->robots && \is_array($this->robots)) {
                $n = 0;
                foreach ($this->robots as $item) {
                    $res['robots'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteAlarmDingdingrobotRequest
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
        if (isset($map['robots'])) {
            if (!empty($map['robots'])) {
                $model->robots = [];
                $n             = 0;
                foreach ($map['robots'] as $item) {
                    $model->robots[$n++] = null !== $item ? DingDingRobot::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
