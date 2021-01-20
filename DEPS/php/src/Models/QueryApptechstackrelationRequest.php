<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApptechstackrelationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appIds' => 'app_ids',
        'buildpackArch' => 'buildpack_arch',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo' => 'creation_time_to',
        'currentPage' => 'current_page',
        'descend' => 'descend',
        'ids' => 'ids',
        'isProcessed' => 'is_processed',
        'modificationTimeFrom' => 'modification_time_from',
        'modificationTimeTo' => 'modification_time_to',
        'pageSize' => 'page_size',
        'sortField' => 'sort_field',
        'startIndex' => 'start_index',
        'techstackIdentities' => 'techstack_identities',
        'techstackIds' => 'techstack_ids',
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
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
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
        if (null !== $this->descend) {
            $res['descend'] = $this->descend;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->isProcessed) {
            $res['is_processed'] = $this->isProcessed;
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
        if (null !== $this->techstackIdentities) {
            $res['techstack_identities'] = $this->techstackIdentities;
        }
        if (null !== $this->techstackIds) {
            $res['techstack_ids'] = $this->techstackIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApptechstackrelationRequest
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
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
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
        if(isset($map['techstack_identities'])){
            $model->techstackIdentities = $map['techstack_identities'];
        }
        if(isset($map['techstack_ids'])){
            if(!empty($map['techstack_ids'])){
                $model->techstackIds = $map['techstack_ids'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 一组应用id
    /**
     * @var string[]
     */
    public $appIds;

    // buildpack_arch
    /**
     * @var string
     */
    public $buildpackArch;

    // creation_fime_from
    // 
    /**
     * @var string
     */
    public $creationTimeFrom;

    // creation_time_to
    // 
    /**
     * @var string
     */
    public $creationTimeTo;

    // current_page
    // 
    /**
     * @var int
     */
    public $currentPage;

    // 是否降序
    /**
     * @var string
     */
    public $descend;

    // ids
    /**
     * @var int[]
     */
    public $ids;

    // isProcessed
    /**
     * @var bool
     */
    public $isProcessed;

    // modification_time_from
    // 
    /**
     * @var string
     */
    public $modificationTimeFrom;

    // modification_time_to
    // 
    /**
     * @var string
     */
    public $modificationTimeTo;

    // page_size
    // 
    /**
     * @var int
     */
    public $pageSize;

    // 分类
    /**
     * @var string
     */
    public $sortField;

    // start_index
    // 
    /**
     * @var int
     */
    public $startIndex;

    // techstack_identities
    // 
    /**
     * @var string
     */
    public $techstackIdentities;

    // techstack_ids
    // 
    /**
     * @var int[]
     */
    public $techstackIds;

}
