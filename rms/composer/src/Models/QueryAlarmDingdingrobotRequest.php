<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmDingdingrobotRequest extends Model
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

    // 只看当前用户创建的钉钉机器人
    /**
     * @var bool
     */
    public $onlyCurrentStaff;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面尺寸
    /**
     * @var int
     */
    public $pageSize;

    // 机器人名称
    /**
     * @var string
     */
    public $name;

    // 根据token过滤
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceName'    => 'workspace_name',
        'onlyCurrentStaff' => 'only_current_staff',
        'currentPage'      => 'current_page',
        'pageSize'         => 'page_size',
        'name'             => 'name',
        'token'            => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->onlyCurrentStaff) {
            $res['only_current_staff'] = $this->onlyCurrentStaff;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmDingdingrobotRequest
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
        if (isset($map['only_current_staff'])) {
            $model->onlyCurrentStaff = $map['only_current_staff'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
