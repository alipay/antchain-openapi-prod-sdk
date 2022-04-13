<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowElasticruleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 环境
    /**
     * @var string
     */
    public $workspaceGroup;

    // 规则名称
    /**
     * @var string
     */
    public $name;

    // 所属类型
    /**
     * @var string
     */
    public $type;

    // 所属应用名称
    /**
     * @var string
     */
    public $appName;

    // 场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 分页大小，默认 10
    /**
     * @var int
     */
    public $pageSize;

    // 当前页，默认 1
    /**
     * @var int
     */
    public $pageNo;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'name'           => 'name',
        'type'           => 'type',
        'appName'        => 'app_name',
        'sceneName'      => 'scene_name',
        'pageSize'       => 'page_size',
        'pageNo'         => 'page_no',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowElasticruleRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }

        return $model;
    }
}
