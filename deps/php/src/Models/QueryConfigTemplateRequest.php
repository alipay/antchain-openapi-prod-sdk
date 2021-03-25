<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryConfigTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'orders' => 'orders',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'queryType' => 'query_type',
        'state' => 'state',
        'tplVersion' => 'tpl_version',
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
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->tplVersion) {
            $res['tpl_version'] = $this->tplVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryConfigTemplateRequest
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
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['tpl_version'])){
            $model->tplVersion = $map['tpl_version'];
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

    // 排序规则数组，默认为 UTC_MODIFIED_DESC，即 根据修改时间降序排序
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

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name
    /**
     * @var string
     */
    public $queryType;

    // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
    /**
     * @var string
     */
    public $state;

    // 版本
    /**
     * @var string
     */
    public $tplVersion;

}
