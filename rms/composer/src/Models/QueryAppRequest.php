<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppRequest extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 应用名称模糊搜索
    /**
     * @var string
     */
    public $keyword;

    // 应用名称列表
    /**
     * @var string[]
     */
    public $appNames;

    // 为true时表示查询我的应用
    /**
     * @var bool
     */
    public $onlyMine;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'currentPage'   => 'current_page',
        'pageSize'      => 'page_size',
        'keyword'       => 'keyword',
        'appNames'      => 'app_names',
        'onlyMine'      => 'only_mine',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->onlyMine) {
            $res['only_mine'] = $this->onlyMine;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppRequest
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }
        if (isset($map['only_mine'])) {
            $model->onlyMine = $map['only_mine'];
        }

        return $model;
    }
}
