<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryImagerepoProjectsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 仓库ID
    /**
     * @var string
     */
    public $repoId;

    // 当前页
    /**
     * @var int
     */
    public $page;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 仓库名称
    /**
     * @var string
     */
    public $projectName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'repoId'      => 'repo_id',
        'page'        => 'page',
        'pageSize'    => 'page_size',
        'projectName' => 'project_name',
    ];

    public function validate()
    {
        Model::validateRequired('repoId', $this->repoId, true);
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->repoId) {
            $res['repo_id'] = $this->repoId;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImagerepoProjectsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['repo_id'])) {
            $model->repoId = $map['repo_id'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }

        return $model;
    }
}
