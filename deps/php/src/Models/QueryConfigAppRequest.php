<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryConfigAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'dataLevel' => 'data_level',
        'key' => 'key',
        'orders' => 'orders',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'paramType' => 'param_type',
        'queryType' => 'query_type',
        'scopes' => 'scopes',
        'scopeId' => 'scope_id',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataLevel) {
            $res['data_level'] = $this->dataLevel;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
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
        if (null !== $this->paramType) {
            $res['param_type'] = $this->paramType;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->scopeId) {
            $res['scope_id'] = $this->scopeId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryConfigAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['data_level'])){
            $model->dataLevel = $map['data_level'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
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
        if(isset($map['param_type'])){
            $model->paramType = $map['param_type'];
        }
        if(isset($map['query_type'])){
            $model->queryType = $map['query_type'];
        }
        if(isset($map['scopes'])){
            if(!empty($map['scopes'])){
                $model->scopes = $map['scopes'];
            }
        }
        if(isset($map['scope_id'])){
            $model->scopeId = $map['scope_id'];
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 模板参数保密级别
    /**
     * @var string
     */
    public $dataLevel;

    // 参数名
    /**
     * @var string
     */
    public $key;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根创建时间降序排序
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

    // 根据参数类型进行查询
    /**
     * @var string
     */
    public $paramType;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, key
    /**
     * @var string
     */
    public $queryType;

    // 该参数属于哪个 scope ，是个在多个 scope 中查询
    /**
     * @var string[]
     */
    public $scopes;

    // 该参数在该 scope 中的 id
    /**
     * @var string
     */
    public $scopeId;

}
