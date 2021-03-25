<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpacknewRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'buildCommand' => 'build_command',
        'createdFroms' => 'created_froms',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo' => 'creation_time_to',
        'creatorIds' => 'creator_ids',
        'currentPage' => 'current_page',
        'descend' => 'descend',
        'fullVersion' => 'full_version',
        'ids' => 'ids',
        'isProcessed' => 'is_processed',
        'modificationTimeFrom' => 'modification_time_from',
        'modificationTimeTo' => 'modification_time_to',
        'pageSize' => 'page_size',
        'publicationTimeFrom' => 'publication_time_from',
        'publicationTimeTo' => 'publication_time_to',
        'publisherIds' => 'publisher_ids',
        'scopes' => 'scopes',
        'sortField' => 'sort_field',
        'statuses' => 'statuses',
        'supportedOsIds' => 'supported_os_ids',
        'supportedRegionIds' => 'supported_region_ids',
        'techstackIds' => 'techstack_ids',
        'techstackNames' => 'techstack_names',
    ];
    public function validate() {
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTimeFrom', $this->modificationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTimeTo', $this->modificationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('publicationTimeFrom', $this->publicationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('publicationTimeTo', $this->publicationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->buildCommand) {
            $res['build_command'] = $this->buildCommand;
        }
        if (null !== $this->createdFroms) {
            $res['created_froms'] = $this->createdFroms;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }
        if (null !== $this->creatorIds) {
            $res['creator_ids'] = $this->creatorIds;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->descend) {
            $res['descend'] = $this->descend;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
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
        if (null !== $this->publicationTimeFrom) {
            $res['publication_time_from'] = $this->publicationTimeFrom;
        }
        if (null !== $this->publicationTimeTo) {
            $res['publication_time_to'] = $this->publicationTimeTo;
        }
        if (null !== $this->publisherIds) {
            $res['publisher_ids'] = $this->publisherIds;
        }
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->supportedOsIds) {
            $res['supported_os_ids'] = $this->supportedOsIds;
        }
        if (null !== $this->supportedRegionIds) {
            $res['supported_region_ids'] = $this->supportedRegionIds;
        }
        if (null !== $this->techstackIds) {
            $res['techstack_ids'] = $this->techstackIds;
        }
        if (null !== $this->techstackNames) {
            $res['techstack_names'] = $this->techstackNames;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBuildpacknewRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
        }
        if(isset($map['created_froms'])){
            if(!empty($map['created_froms'])){
                $model->createdFroms = $map['created_froms'];
            }
        }
        if(isset($map['creation_time_from'])){
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if(isset($map['creation_time_to'])){
            $model->creationTimeTo = $map['creation_time_to'];
        }
        if(isset($map['creator_ids'])){
            if(!empty($map['creator_ids'])){
                $model->creatorIds = $map['creator_ids'];
            }
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['descend'])){
            $model->descend = $map['descend'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
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
        if(isset($map['publication_time_from'])){
            $model->publicationTimeFrom = $map['publication_time_from'];
        }
        if(isset($map['publication_time_to'])){
            $model->publicationTimeTo = $map['publication_time_to'];
        }
        if(isset($map['publisher_ids'])){
            if(!empty($map['publisher_ids'])){
                $model->publisherIds = $map['publisher_ids'];
            }
        }
        if(isset($map['scopes'])){
            if(!empty($map['scopes'])){
                $model->scopes = $map['scopes'];
            }
        }
        if(isset($map['sort_field'])){
            $model->sortField = $map['sort_field'];
        }
        if(isset($map['statuses'])){
            if(!empty($map['statuses'])){
                $model->statuses = $map['statuses'];
            }
        }
        if(isset($map['supported_os_ids'])){
            if(!empty($map['supported_os_ids'])){
                $model->supportedOsIds = $map['supported_os_ids'];
            }
        }
        if(isset($map['supported_region_ids'])){
            if(!empty($map['supported_region_ids'])){
                $model->supportedRegionIds = $map['supported_region_ids'];
            }
        }
        if(isset($map['techstack_ids'])){
            if(!empty($map['techstack_ids'])){
                $model->techstackIds = $map['techstack_ids'];
            }
        }
        if(isset($map['techstack_names'])){
            if(!empty($map['techstack_names'])){
                $model->techstackNames = $map['techstack_names'];
            }
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

    // buildCommand
    /**
     * @var string
     */
    public $buildCommand;

    // createdFroms
    /**
     * @var string[]
     */
    public $createdFroms;

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

    // creatorIds
    /**
     * @var string[]
     */
    public $creatorIds;

    // currentPage
    /**
     * @var int
     */
    public $currentPage;

    // descend
    /**
     * @var bool
     */
    public $descend;

    // fullVersion
    /**
     * @var string
     */
    public $fullVersion;

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

    // pageSize
    /**
     * @var int
     */
    public $pageSize;

    // publicationTimeFrom
    /**
     * @var string
     */
    public $publicationTimeFrom;

    // publicationTimeTo
    /**
     * @var string
     */
    public $publicationTimeTo;

    // publisherIds
    /**
     * @var string[]
     */
    public $publisherIds;

    // scopes
    /**
     * @var string[]
     */
    public $scopes;

    // sortField
    /**
     * @var string
     */
    public $sortField;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // supportedOsIds
    /**
     * @var int[]
     */
    public $supportedOsIds;

    // supported_region_ids
    /**
     * @var string[]
     */
    public $supportedRegionIds;

    // techstackIds
    /**
     * @var int[]
     */
    public $techstackIds;

    // techstackNames
    /**
     * @var string[]
     */
    public $techstackNames;

}
