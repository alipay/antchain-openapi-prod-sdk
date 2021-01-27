<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetInternalMasterRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'iaasId' => 'iaas_id',
        'masterId' => 'master_id',
        'sourceSystem' => 'source_system',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->masterId) {
            $res['master_id'] = $this->masterId;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetInternalMasterRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['master_id'])){
            $model->masterId = $map['master_id'];
        }
        if(isset($map['source_system'])){
            $model->sourceSystem = $map['source_system'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 阿里云PK
    /**
     * @var string
     */
    public $iaasId;

    // 主账号ID
    /**
     * @var string
     */
    public $masterId;

    // 来源系统，例如MAYI，ALBABACLOUD
    /**
     * @var string
     */
    public $sourceSystem;

}
