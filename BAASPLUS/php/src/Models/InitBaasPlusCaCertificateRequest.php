<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class InitBaasPlusCaCertificateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'bizUuid' => 'biz_uuid',
        'command' => 'command',
        'configId' => 'config_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->bizUuid) {
            $res['biz_uuid'] = $this->bizUuid;
        }
        if (null !== $this->command) {
            $res['command'] = $this->command;
        }
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitBaasPlusCaCertificateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['biz_uuid'])){
            $model->bizUuid = $map['biz_uuid'];
        }
        if(isset($map['command'])){
            $model->command = $map['command'];
        }
        if(isset($map['config_id'])){
            $model->configId = $map['config_id'];
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
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 业务唯一性uuid，用于后续的证书查询
    /**
     * @var string
     */
    public $bizUuid;

    // 证书请求(CSR)
    /**
     * @var string
     */
    public $command;

    // 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
    // 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
    /**
     * @var string
     */
    public $configId;

}
