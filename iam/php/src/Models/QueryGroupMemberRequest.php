<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class QueryGroupMemberRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'groupId' => 'group_id',
        'pageSize' => 'page_size',
        'currentPage' => 'current_page',
    ];
    public function validate() {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 10);
        Model::validateMinimum('currentPage', $this->currentPage, 1);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGroupMemberRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['group_id'])){
            $model->groupId = $map['group_id'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 成员组ID
    /**
     * @var string
     */
    public $groupId;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

}
