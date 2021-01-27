<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class QueryRoleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'name' => 'name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'paging' => 'paging',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->paging) {
            $res['paging'] = $this->paging;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRoleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['paging'])){
            $model->paging = $map['paging'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 角色名称
    /**
     * @var string
     */
    public $name;

    // 当前页,默认1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，取值范围[1~50],默认10
    /**
     * @var int
     */
    public $pageSize;

    // 是否分页，默认true
    /**
     * @var bool
     */
    public $paging;

    // 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
    /**
     * @var string
     */
    public $type;

}
