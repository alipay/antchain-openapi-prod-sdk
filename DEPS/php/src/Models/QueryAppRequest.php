<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appGroupName' => 'app_group_name',
        'appName' => 'app_name',
        'orders' => 'orders',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'queryType' => 'query_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_group_name'])){
            $model->appGroupName = $map['app_group_name'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['orders'])){
            if(!empty($map['orders'])){
                $model->orders = $map['orders'];
            }
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['query_type'])){
            $model->queryType = $map['query_type'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 根据应用分组查询，为空默认查询所有应用分组
    /**
     * @var string
     */
    public $appGroupName;

    // 根据应用名称查询，为空默认查询所有应用
    /**
     * @var string
     */
    public $appName;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    /**
     * @var string[]
     */
    public $orders;

    // 当前页码，从1开始，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, app_group_name
    /**
     * @var string
     */
    public $queryType;

}
