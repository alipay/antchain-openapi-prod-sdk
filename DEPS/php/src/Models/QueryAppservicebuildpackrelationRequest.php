<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppservicebuildpackrelationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appserviceIds' => 'appservice_ids',
        'appIds' => 'app_ids',
        'buildpackArch' => 'buildpack_arch',
        'buildpackIds' => 'buildpack_ids',
        'currentPage' => 'current_page',
        'descend' => 'descend',
        'ids' => 'ids',
        'pageSize' => 'page_size',
        'sortField' => 'sort_field',
        'startIndex' => 'start_index',
        'techstackIdentities' => 'techstack_identities',
        'techstackIds' => 'techstack_ids',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appserviceIds) {
            $res['appservice_ids'] = $this->appserviceIds;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->buildpackIds) {
            $res['buildpack_ids'] = $this->buildpackIds;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->descend) {
            $res['descend'] = $this->descend;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
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
        if (null !== $this->techstackIdentities) {
            $res['techstack_identities'] = $this->techstackIdentities;
        }
        if (null !== $this->techstackIds) {
            $res['techstack_ids'] = $this->techstackIds;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppservicebuildpackrelationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['appservice_ids'])){
            if(!empty($map['appservice_ids'])){
                $model->appserviceIds = $map['appservice_ids'];
            }
        }
        if(isset($map['app_ids'])){
            if(!empty($map['app_ids'])){
                $model->appIds = $map['app_ids'];
            }
        }
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['buildpack_ids'])){
            if(!empty($map['buildpack_ids'])){
                $model->buildpackIds = $map['buildpack_ids'];
            }
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['descend'])){
            $model->descend = $map['descend'];
        }
        if(isset($map['ids'])){
            if(!empty($map['ids'])){
                $model->ids = $map['ids'];
            }
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
        if(isset($map['techstack_identities'])){
            if(!empty($map['techstack_identities'])){
                $model->techstackIdentities = $map['techstack_identities'];
            }
        }
        if(isset($map['techstack_ids'])){
            if(!empty($map['techstack_ids'])){
                $model->techstackIds = $map['techstack_ids'];
            }
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

    // 一组应用服务id
    /**
     * @var string[]
     */
    public $appserviceIds;

    // 一组应用id
    // 
    /**
     * @var string[]
     */
    public $appIds;

    // buildpackArch
    /**
     * @var string
     */
    public $buildpackArch;

    // buildpackIds
    /**
     * @var string[]
     */
    public $buildpackIds;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

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

    // techstackIdentities
    /**
     * @var string[]
     */
    public $techstackIdentities;

    // 一组技术栈id
    /**
     * @var string[]
     */
    public $techstackIds;

    // workspaceId
    /**
     * @var string
     */
    public $workspaceId;

}
