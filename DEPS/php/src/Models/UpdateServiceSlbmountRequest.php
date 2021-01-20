<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;

class UpdateServiceSlbmountRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'mountInfo' => 'mount_info',
        'regionIdentity' => 'region_identity',
        'serviceId' => 'service_id',
        'slbId' => 'slb_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->mountInfo) {
            $res['mount_info'] = [];
            if(null !== $this->mountInfo && is_array($this->mountInfo)){
                $n = 0;
                foreach($this->mountInfo as $item){
                    $res['mount_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->regionIdentity) {
            $res['region_identity'] = $this->regionIdentity;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->slbId) {
            $res['slb_id'] = $this->slbId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateServiceSlbmountRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['mount_info'])){
            if(!empty($map['mount_info'])){
                $model->mountInfo = [];
                $n = 0;
                foreach($map['mount_info'] as $item) {
                    $model->mountInfo[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['region_identity'])){
            $model->regionIdentity = $map['region_identity'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['slb_id'])){
            $model->slbId = $map['slb_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 权重
    /**
     * @var Pair[]
     */
    public $mountInfo;

    // region_identity
    /**
     * @var string
     */
    public $regionIdentity;

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // slb_id
    /**
     * @var string
     */
    public $slbId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
