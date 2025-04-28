<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateElectrocarApplycarkeycertificateRequest extends Model
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

    // 请求唯一标识Id 调用方生成，需要保证唯一性
    /**
     * @var string
     */
    public $requestId;

    // 模式 默认为false，产线申请未true
    /**
     * @var string
     */
    public $onlineFlag;

    // 设备类型 默认为4-芯片SE，联系技术配置具体的设备类型
    /**
     * @var string
     */
    public $deviceType;

    // 凭证类型，默认se_dk_cred，如果是MCU，则mcu_dk_cred
    /**
     * @var string
     */
    public $credType;

    // 品牌Id
    /**
     * @var string
     */
    public $brandId;

    // 凭证内容
    // 集合结构[0,1,2,3]
    // 0:IIFAA根密钥
    // 1:企业业务密钥
    // 2:设备密钥
    // 3:无感控车
    // 如果此字段为空，则默认生成0，1，2
    /**
     * @var string
     */
    public $generateCode;

    // 协议类型
    // 蓝牙：ble
    // 4G: 4G
    // 蓝牙+4G：ble|4G
    // 如果此字段为空，默认为ble
    /**
     * @var string
     */
    public $protocolType;

    // 无感控车设备端数据，当generateCode包含3的时候，此字段不能为空
    /**
     * @var string
     */
    public $keyLess;

    // mac
    /**
     * @var string
     */
    public $mac;

    // ble_mac
    /**
     * @var string
     */
    public $bleMac;

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

    // 接入场景码
    /**
     * @var string
     */
    public $accessScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'onlineFlag'        => 'online_flag',
        'deviceType'        => 'device_type',
        'credType'          => 'cred_type',
        'brandId'           => 'brand_id',
        'generateCode'      => 'generate_code',
        'protocolType'      => 'protocol_type',
        'keyLess'           => 'key_less',
        'mac'               => 'mac',
        'bleMac'            => 'ble_mac',
        'deviceSn'          => 'device_sn',
        'accessScene'       => 'access_scene',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('protocolType', $this->protocolType, true);
        Model::validateRequired('mac', $this->mac, true);
        Model::validateRequired('bleMac', $this->bleMac, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('accessScene', $this->accessScene, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->onlineFlag) {
            $res['online_flag'] = $this->onlineFlag;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->credType) {
            $res['cred_type'] = $this->credType;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->generateCode) {
            $res['generate_code'] = $this->generateCode;
        }
        if (null !== $this->protocolType) {
            $res['protocol_type'] = $this->protocolType;
        }
        if (null !== $this->keyLess) {
            $res['key_less'] = $this->keyLess;
        }
        if (null !== $this->mac) {
            $res['mac'] = $this->mac;
        }
        if (null !== $this->bleMac) {
            $res['ble_mac'] = $this->bleMac;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->accessScene) {
            $res['access_scene'] = $this->accessScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateElectrocarApplycarkeycertificateRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['online_flag'])) {
            $model->onlineFlag = $map['online_flag'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['cred_type'])) {
            $model->credType = $map['cred_type'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['generate_code'])) {
            $model->generateCode = $map['generate_code'];
        }
        if (isset($map['protocol_type'])) {
            $model->protocolType = $map['protocol_type'];
        }
        if (isset($map['key_less'])) {
            $model->keyLess = $map['key_less'];
        }
        if (isset($map['mac'])) {
            $model->mac = $map['mac'];
        }
        if (isset($map['ble_mac'])) {
            $model->bleMac = $map['ble_mac'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['access_scene'])) {
            $model->accessScene = $map['access_scene'];
        }

        return $model;
    }
}
