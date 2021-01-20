<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;
use AntChain\Deps\Models\BuildpackOS;

class GetBuildpackResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'buildpackParams' => 'buildpack_params',
        'contactInfo' => 'contact_info',
        'creatorId' => 'creator_id',
        'debugMode' => 'debug_mode',
        'depracationNote' => 'depracation_note',
        'description' => 'description',
        'fullVersion' => 'full_version',
        'publicationTime' => 'publication_time',
        'publisherId' => 'publisher_id',
        'scope' => 'scope',
        'sharedTenants' => 'shared_tenants',
        'status' => 'status',
        'supportedOs' => 'supported_os',
        'supportedRegions' => 'supported_regions',
        'techstackId' => 'techstack_id',
    ];
    public function validate() {
        Model::validatePattern('publicationTime', $this->publicationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->buildpackParams) {
            $res['buildpack_params'] = [];
            if(null !== $this->buildpackParams && is_array($this->buildpackParams)){
                $n = 0;
                foreach($this->buildpackParams as $item){
                    $res['buildpack_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = $this->contactInfo;
        }
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->debugMode) {
            $res['debug_mode'] = $this->debugMode;
        }
        if (null !== $this->depracationNote) {
            $res['depracation_note'] = $this->depracationNote;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->publicationTime) {
            $res['publication_time'] = $this->publicationTime;
        }
        if (null !== $this->publisherId) {
            $res['publisher_id'] = $this->publisherId;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->sharedTenants) {
            $res['shared_tenants'] = $this->sharedTenants;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->supportedOs) {
            $res['supported_os'] = [];
            if(null !== $this->supportedOs && is_array($this->supportedOs)){
                $n = 0;
                foreach($this->supportedOs as $item){
                    $res['supported_os'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = $this->supportedRegions;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetBuildpackResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['buildpack_params'])){
            if(!empty($map['buildpack_params'])){
                $model->buildpackParams = [];
                $n = 0;
                foreach($map['buildpack_params'] as $item) {
                    $model->buildpackParams[$n++] = null !== $item ? BuildpackParamTemplate::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['contact_info'])){
            $model->contactInfo = $map['contact_info'];
        }
        if(isset($map['creator_id'])){
            $model->creatorId = $map['creator_id'];
        }
        if(isset($map['debug_mode'])){
            $model->debugMode = $map['debug_mode'];
        }
        if(isset($map['depracation_note'])){
            $model->depracationNote = $map['depracation_note'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['publication_time'])){
            $model->publicationTime = $map['publication_time'];
        }
        if(isset($map['publisher_id'])){
            $model->publisherId = $map['publisher_id'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['shared_tenants'])){
            if(!empty($map['shared_tenants'])){
                $model->sharedTenants = $map['shared_tenants'];
            }
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['supported_os'])){
            if(!empty($map['supported_os'])){
                $model->supportedOs = [];
                $n = 0;
                foreach($map['supported_os'] as $item) {
                    $model->supportedOs[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = $map['supported_regions'];
            }
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // buildpackParams
    /**
     * @var BuildpackParamTemplate[]
     */
    public $buildpackParams;

    // contactInfo
    /**
     * @var string
     */
    public $contactInfo;

    // creatorId
    /**
     * @var string
     */
    public $creatorId;

    // debugMode
    /**
     * @var bool
     */
    public $debugMode;

    // depracationNote
    /**
     * @var string
     */
    public $depracationNote;

    // description
    /**
     * @var string
     */
    public $description;

    // fullVersion
    /**
     * @var string
     */
    public $fullVersion;

    // publicationTime
    /**
     * @var string
     */
    public $publicationTime;

    // publisherId
    /**
     * @var string
     */
    public $publisherId;

    // scope
    /**
     * @var string
     */
    public $scope;

    // sharedTenants
    /**
     * @var string[]
     */
    public $sharedTenants;

    // status
    /**
     * @var string
     */
    public $status;

    // supportedOs
    /**
     * @var BuildpackOS[]
     */
    public $supportedOs;

    // supportedRegions
    /**
     * @var string[]
     */
    public $supportedRegions;

    // techstackId
    /**
     * @var string
     */
    public $techstackId;

}
