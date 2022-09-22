<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecFlowDisasterswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 容灾切换类型，枚举型，CUTOFF（切流），RECOVER（恢复）
    /**
     * @var string
     */
    public $disasterType;

    // 容灾切换范围，枚举型，GROUP（单元组）、ZONE（单元）、IDC（机房，暂不支持）
    /**
     * @var string
     */
    public $disasterScope;

    // 同城或者异地容灾，true代表异地容灾，false代表同城容灾
    /**
     * @var bool
     */
    public $remote;

    // 容灾切换对象列表
    /**
     * @var string[]
     */
    public $targets;

    // 操作者，选填，应填登录名
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'disasterType'   => 'disaster_type',
        'disasterScope'  => 'disaster_scope',
        'remote'         => 'remote',
        'targets'        => 'targets',
        'operator'       => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('disasterType', $this->disasterType, true);
        Model::validateRequired('disasterScope', $this->disasterScope, true);
        Model::validateRequired('remote', $this->remote, true);
        Model::validateRequired('targets', $this->targets, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->disasterType) {
            $res['disaster_type'] = $this->disasterType;
        }
        if (null !== $this->disasterScope) {
            $res['disaster_scope'] = $this->disasterScope;
        }
        if (null !== $this->remote) {
            $res['remote'] = $this->remote;
        }
        if (null !== $this->targets) {
            $res['targets'] = $this->targets;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecFlowDisasterswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['disaster_type'])) {
            $model->disasterType = $map['disaster_type'];
        }
        if (isset($map['disaster_scope'])) {
            $model->disasterScope = $map['disaster_scope'];
        }
        if (isset($map['remote'])) {
            $model->remote = $map['remote'];
        }
        if (isset($map['targets'])) {
            if (!empty($map['targets'])) {
                $model->targets = $map['targets'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
