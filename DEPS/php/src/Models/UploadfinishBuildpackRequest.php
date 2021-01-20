<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackRegionRelation;

class UploadfinishBuildpackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'buildpackId' => 'buildpack_id',
        'supportedRegions' => 'supported_regions',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
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
        return $res;
    }
    /**
     * @param array $map
     * @return UploadfinishBuildpackRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelation::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 技术栈的ID
    /**
     * @var string
     */
    public $buildpackId;

    // supportedRegions
    /**
     * @var BuildpackRegionRelation[]
     */
    public $supportedRegions;

}
