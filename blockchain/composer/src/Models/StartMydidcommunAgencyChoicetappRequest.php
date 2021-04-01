<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyChoicetappRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 入驻时候生成的did
    /**
     * @var string
     */
    public $did;

    // 服务ID
    /**
     * @var string
     */
    public $serviceId;

    // 选择tapp的名称
    /**
     * @var string
     */
    public $tappName;

    // tapp版本
    /**
     * @var int
     */
    public $tappVersion;

    // 业务码，需要接入时联系数据隐私服务分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'serviceId'         => 'service_id',
        'tappName'          => 'tapp_name',
        'tappVersion'       => 'tapp_version',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('tappName', $this->tappName, true);
        Model::validateRequired('tappVersion', $this->tappVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->tappName) {
            $res['tapp_name'] = $this->tappName;
        }
        if (null !== $this->tappVersion) {
            $res['tapp_version'] = $this->tappVersion;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyChoicetappRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['tapp_name'])) {
            $model->tappName = $map['tapp_name'];
        }
        if (isset($map['tapp_version'])) {
            $model->tappVersion = $map['tapp_version'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
