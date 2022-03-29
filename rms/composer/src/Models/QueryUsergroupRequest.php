<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUsergroupRequest extends Model
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

    // 联系人登录名称数组
    /**
     * @var string
     */
    public $userLoginNames;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 通知组名称
    /**
     * @var string
     */
    public $keyword;

    // 是否只查询当前操作者的
    /**
     * @var bool
     */
    public $onlyCurrentStaff;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceName'    => 'workspace_name',
        'userLoginNames'   => 'user_login_names',
        'pageSize'         => 'page_size',
        'currentPage'      => 'current_page',
        'keyword'          => 'keyword',
        'onlyCurrentStaff' => 'only_current_staff',
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
        if (null !== $this->userLoginNames) {
            $res['user_login_names'] = $this->userLoginNames;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->onlyCurrentStaff) {
            $res['only_current_staff'] = $this->onlyCurrentStaff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUsergroupRequest
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
        if (isset($map['user_login_names'])) {
            $model->userLoginNames = $map['user_login_names'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['only_current_staff'])) {
            $model->onlyCurrentStaff = $map['only_current_staff'];
        }

        return $model;
    }
}
