<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ApplyTechintegrationSkushipbyuidRequest extends Model
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

    // 产品型号
    /**
     * @var string
     */
    public $deviceModel;

    // 产品类型
    /**
     * @var string
     */
    public $productType;

    // 安全方案
    //
    /**
     * @var string
     */
    public $securityMechanism;

    // 证书类型
    //
    /**
     * @var string
     */
    public $certType;

    // 凭证种类
    //
    /**
     * @var string[]
     */
    public $features;

    // 设备唯一编码类型
    /**
     * @var string
     */
    public $uidType;

    // 设备唯一编码值
    /**
     * @var string
     */
    public $uid;

    // 场景码
    /**
     * @var string
     */
    public $scene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceModel'       => 'device_model',
        'productType'       => 'product_type',
        'securityMechanism' => 'security_mechanism',
        'certType'          => 'cert_type',
        'features'          => 'features',
        'uidType'           => 'uid_type',
        'uid'               => 'uid',
        'scene'             => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('securityMechanism', $this->securityMechanism, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('features', $this->features, true);
        Model::validateRequired('uidType', $this->uidType, true);
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('scene', $this->scene, true);
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
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->securityMechanism) {
            $res['security_mechanism'] = $this->securityMechanism;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }
        if (null !== $this->uidType) {
            $res['uid_type'] = $this->uidType;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyTechintegrationSkushipbyuidRequest
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
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['security_mechanism'])) {
            $model->securityMechanism = $map['security_mechanism'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }
        if (isset($map['uid_type'])) {
            $model->uidType = $map['uid_type'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
