<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudAcmProjectMemberRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'userId' => 'user_id',
        'projectId' => 'project_id',
        'userName' => 'user_name',
        'currentPage' => 'current_page',
        'pageSize' => 'page_size',
        'sortField' => 'sort_field',
        'sortOrder' => 'sort_order',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('projectId', $this->projectId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->sortOrder) {
            $res['sort_order'] = $this->sortOrder;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudAcmProjectMemberRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['sort_field'])){
            $model->sortField = $map['sort_field'];
        }
        if(isset($map['sort_order'])){
            $model->sortOrder = $map['sort_order'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 操作者用户ID
    /**
     * @var string
     */
    public $userId;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 用户名称（模糊搜索）
    /**
     * @var string
     */
    public $userName;

    // 当前页，默认为 1
    /**
     * @var int
     */
    public $currentPage;

    // 每页大小，默认为 10
    /**
     * @var int
     */
    public $pageSize;

    // 排序字段：UTC_CREATE（创建时间）、UTC_MODIFIED（更新时间），默认为 UTC_CREATE
    /**
     * @var string
     */
    public $sortField;

    // 排序方式：ASC（升序）、DESC（降序），默认为 DESC
    /**
     * @var string
     */
    public $sortOrder;

}
