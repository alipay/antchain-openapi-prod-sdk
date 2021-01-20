<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppserviceenvparamRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appIds' => 'app_ids',
        'appServiceIds' => 'app_service_ids',
        'buildpackIds' => 'buildpack_ids',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo' => 'creation_time_to',
        'currentPage' => 'current_page',
        'defaultValue' => 'default_value',
        'descend' => 'descend',
        'ids' => 'ids',
        'isProcessed' => 'is_processed',
        'key' => 'key',
        'modificationTimeFrom' => 'modification_time_from',
        'modificationTimeTo' => 'modification_time_to',
        'pageSize' => 'page_size',
        'sortField' => 'sort_field',
        'startIndex' => 'start_index',
        'value' => 'value',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTimeFrom', $this->modificationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTimeTo', $this->modificationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->buildpackIds) {
            $res['buildpack_ids'] = $this->buildpackIds;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->descend) {
            $res['descend'] = $this->descend;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->isProcessed) {
            $res['is_processed'] = $this->isProcessed;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->modificationTimeFrom) {
            $res['modification_time_from'] = $this->modificationTimeFrom;
        }
        if (null !== $this->modificationTimeTo) {
            $res['modification_time_to'] = $this->modificationTimeTo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppserviceenvparamRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_ids'])){
            if(!empty($map['app_ids'])){
                $model->appIds = $map['app_ids'];
            }
        }
        if(isset($map['app_service_ids'])){
            if(!empty($map['app_service_ids'])){
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if(isset($map['buildpack_ids'])){
            if(!empty($map['buildpack_ids'])){
                $model->buildpackIds = $map['buildpack_ids'];
            }
        }
        if(isset($map['creation_time_from'])){
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if(isset($map['creation_time_to'])){
            $model->creationTimeTo = $map['creation_time_to'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['descend'])){
            $model->descend = $map['descend'];
        }
        if(isset($map['ids'])){
            if(!empty($map['ids'])){
                $model->ids = $map['ids'];
            }
        }
        if(isset($map['is_processed'])){
            $model->isProcessed = $map['is_processed'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['modification_time_from'])){
            $model->modificationTimeFrom = $map['modification_time_from'];
        }
        if(isset($map['modification_time_to'])){
            $model->modificationTimeTo = $map['modification_time_to'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['sort_field'])){
            $model->sortField = $map['sort_field'];
        }
        if(isset($map['start_index'])){
            $model->startIndex = $map['start_index'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // appIds
    /**
     * @var string[]
     */
    public $appIds;

    // appServiceIds
    /**
     * @var string[]
     */
    public $appServiceIds;

    // buildpackIds
    /**
     * @var string[]
     */
    public $buildpackIds;

    // creationTimeFrom
    /**
     * @var string
     */
    public $creationTimeFrom;

    // creationTimeTo
    /**
     * @var string
     */
    public $creationTimeTo;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // defaultValue
    /**
     * @var string
     */
    public $defaultValue;

    // 是否降序
    /**
     * @var bool
     */
    public $descend;

    // ids
    /**
     * @var string[]
     */
    public $ids;

    // isProcessed
    /**
     * @var bool
     */
    public $isProcessed;

    // key
    /**
     * @var string
     */
    public $key;

    // modificationTimeFrom
    /**
     * @var string
     */
    public $modificationTimeFrom;

    // modificationTimeTo
    /**
     * @var string
     */
    public $modificationTimeTo;

    // 每页个数
    /**
     * @var int
     */
    public $pageSize;

    // 分类
    /**
     * @var string
     */
    public $sortField;

    // 开始索引
    /**
     * @var int
     */
    public $startIndex;

    // value
    /**
     * @var string
     */
    public $value;

    // workspaceId
    /**
     * @var string
     */
    public $workspaceId;

}
