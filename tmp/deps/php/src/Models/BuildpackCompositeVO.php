<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\UserDTO;
use AntChain\Deps\Models\BuildpackOS;
use AntChain\Deps\Models\BuildpackRegionRelationDetail;
use AntChain\Deps\Models\Techstack;

class BuildpackCompositeVO extends Model {
    protected $_name = [
        'appServiceCount' => 'app_service_count',
        'creator' => 'creator',
        'originType' => 'origin_type',
        'publisher' => 'publisher',
        'supportedOS' => 'supported_o_s',
        'supportedRegions' => 'supported_regions',
        'techstack' => 'techstack',
        'id' => 'id',
        'description' => 'description',
        'fullVersion' => 'full_version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appServiceCount) {
            $res['app_service_count'] = $this->appServiceCount;
        }
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }
        if (null !== $this->originType) {
            $res['origin_type'] = $this->originType;
        }
        if (null !== $this->publisher) {
            $res['publisher'] = null !== $this->publisher ? $this->publisher->toMap() : null;
        }
        if (null !== $this->supportedOS) {
            $res['supported_o_s'] = [];
            if(null !== $this->supportedOS && is_array($this->supportedOS)){
                $n = 0;
                foreach($this->supportedOS as $item){
                    $res['supported_o_s'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = [];
            if(null !== $this->supportedRegions && is_array($this->supportedRegions)){
                $n = 0;
                foreach($this->supportedRegions as $item){
                    $res['supported_regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackCompositeVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_service_count'])){
            $model->appServiceCount = $map['app_service_count'];
        }
        if(isset($map['creator'])){
            $model->creator = UserDTO::fromMap($map['creator']);
        }
        if(isset($map['origin_type'])){
            $model->originType = $map['origin_type'];
        }
        if(isset($map['publisher'])){
            $model->publisher = UserDTO::fromMap($map['publisher']);
        }
        if(isset($map['supported_o_s'])){
            if(!empty($map['supported_o_s'])){
                $model->supportedOS = [];
                $n = 0;
                foreach($map['supported_o_s'] as $item) {
                    $model->supportedOS[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelationDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        return $model;
    }
    // app_service_count
    /**
     * @example 
     * @var int
     */
    public $appServiceCount;

    // creator
    /**
     * @example 
     * @var UserDTO
     */
    public $creator;

    // origin_type
    /**
     * @example origin_type
     * @var string
     */
    public $originType;

    // publisher
    /**
     * @example 
     * @var UserDTO
     */
    public $publisher;

    // supported_o_s
    /**
     * @example 
     * @var BuildpackOS[]
     */
    public $supportedOS;

    // supported_regions
    /**
     * @example 
     * @var BuildpackRegionRelationDetail[]
     */
    public $supportedRegions;

    // techstack
    /**
     * @example 
     * @var Techstack
     */
    public $techstack;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // fullVersion
    /**
     * @example fullVersion
     * @var string
     */
    public $fullVersion;

}
