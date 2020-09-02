<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class DidDocServicesInfo extends Model {
    protected $_name = [
        'extension' => 'extension',
        'id' => 'id',
        'serviceEndpoint' => 'service_endpoint',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceEndpoint) {
            $res['service_endpoint'] = $this->serviceEndpoint;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DidDocServicesInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['extension'])){
            $model->extension = $map['extension'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['service_endpoint'])){
            $model->serviceEndpoint = $map['service_endpoint'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // 服务的扩展字段
    /**
     * @example json string
     * @var string
     */
    public $extension;

    // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务： DidAuthService， 有且只能有一个，并且id必须为didauth-1； VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
    /**
     * @example service-id1
     * @var string
     */
    public $id;

    // 服务的可访问地址
    /**
     * @example http://example.com
     * @var string
     */
    public $serviceEndpoint;

    // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
    /**
     * @example KYBServiceType
     * @var string
     */
    public $type;

}
