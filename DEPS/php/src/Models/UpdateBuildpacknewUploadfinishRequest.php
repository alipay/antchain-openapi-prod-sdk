<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackRegionRelation;

class UpdateBuildpacknewUploadfinishRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'buildpackId' => 'buildpack_id',
        'buildpackRegionRelation' => 'buildpack_region_relation',
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
        if (null !== $this->buildpackRegionRelation) {
            $res['buildpack_region_relation'] = null !== $this->buildpackRegionRelation ? $this->buildpackRegionRelation->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBuildpacknewUploadfinishRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['buildpack_region_relation'])){
            $model->buildpackRegionRelation = BuildpackRegionRelation::fromMap($map['buildpack_region_relation']);
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // buildpackId
    /**
     * @var string
     */
    public $buildpackId;

    // buildpackRegionRelation
    /**
     * @var BuildpackRegionRelation
     */
    public $buildpackRegionRelation;

}
