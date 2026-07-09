<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class InitIotbasicDevicekeyRequest extends Model
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

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 设备厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 设备品类
    /**
     * @var string
     */
    public $deviceType;

    // json字符串，包含设备sn等信息
    /**
     * @var string
     */
    public $deviceInfo;

    // RSA公钥
    /**
     * @var string
     */
    public $pubKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'corpName'          => 'corp_name',
        'productCode'       => 'product_code',
        'deviceType'        => 'device_type',
        'deviceInfo'        => 'device_info',
        'pubKey'            => 'pub_key',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('deviceInfo', $this->deviceInfo, true);
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = $this->deviceInfo;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitIotbasicDevicekeyRequest
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['device_info'])) {
            $model->deviceInfo = $map['device_info'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }

        return $model;
    }
}
