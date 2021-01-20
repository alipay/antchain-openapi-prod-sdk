<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'currentPage' => 'current_page',
        'fullVersion' => 'full_version',
        'pageSize' => 'page_size',
        'publicationTimeFrom' => 'publication_time_from',
        'publicationTimeTo' => 'publication_time_to',
        'scopes' => 'scopes',
        'statuses' => 'statuses',
        'supportedOsIds' => 'supported_os_ids',
        'supportedRegions' => 'supported_regions',
        'techstackIds' => 'techstack_ids',
        'techstackNames' => 'techstack_names',
        'creatorIds' => 'creator_ids',
    ];
    public function validate() {
        Model::validatePattern('publicationTimeFrom', $this->publicationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('publicationTimeTo', $this->publicationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
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
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->supportedOsIds) {
            $res['supported_os_ids'] = $this->supportedOsIds;
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = $this->supportedRegions;
        }
        if (null !== $this->techstackIds) {
            $res['techstack_ids'] = $this->techstackIds;
        }
        if (null !== $this->techstackNames) {
            $res['techstack_names'] = $this->techstackNames;
        }
        if (null !== $this->creatorIds) {
            $res['creator_ids'] = $this->creatorIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBuildpackRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
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
        if(isset($map['scopes'])){
            if(!empty($map['scopes'])){
                $model->scopes = $map['scopes'];
            }
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
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = $map['supported_regions'];
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
        if(isset($map['creator_ids'])){
            if(!empty($map['creator_ids'])){
                $model->creatorIds = $map['creator_ids'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 技术栈版本号
    /**
     * @var string
     */
    public $fullVersion;

    // 每页的大小
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间
    /**
     * @var string
     */
    public $publicationTimeFrom;

    // 截至时间
    /**
     * @var string
     */
    public $publicationTimeTo;

    // 技术栈提供方所在域
    /**
     * @var string[]
     */
    public $scopes;

    // 技术栈版本状态
    /**
     * @var string[]
     */
    public $statuses;

    // 支持的操作系统ID列表
    /**
     * @var int[]
     */
    public $supportedOsIds;

    // 支持的地域名称列表
    /**
     * @var string[]
     */
    public $supportedRegions;

    // 技术栈ID列表
    /**
     * @var int[]
     */
    public $techstackIds;

    // 技术栈名称
    /**
     * @var string[]
     */
    public $techstackNames;

    // creatorIds
    /**
     * @var string[]
     */
    public $creatorIds;

}
