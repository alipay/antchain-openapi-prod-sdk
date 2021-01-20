<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplevelRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'name' => 'name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'tenant' => 'tenant',
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
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplevelRequest
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
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用等级名称
    /**
     * @var string
     */
    public $name;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 租户名称
    /**
     * @var string
     */
    public $tenant;

}
