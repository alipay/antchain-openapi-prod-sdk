<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ApplyDigitalkeyCredRequest extends Model
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

    // 设备类型
    /**
     * @var string
     */
    public $deviceType;

    // 凭证类型
    /**
     * @var string
     */
    public $credType;

    // 需要生成的内容
    /**
     * @var string
     */
    public $generateCode;

    // 客户身份ID
    /**
     * @var string
     */
    public $secretId;

    // 设备SN号
    /**
     * @var string
     */
    public $deviceSn;

    // MAC地址
    /**
     * @var string
     */
    public $mac;

    // ble名称
    /**
     * @var string
     */
    public $bleNme;

    // 无感控车数据
    /**
     * @var string
     */
    public $keyLess;

    // 凭证格式
    /**
     * @var string
     */
    public $formatType;

    // 加密类型
    /**
     * @var string
     */
    public $encType;

    // 协议类型
    /**
     * @var string
     */
    public $protocolType;

    // 品牌ID
    /**
     * @var string
     */
    public $brandId;

    // IOT通道
    /**
     * @var string
     */
    public $channel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceType'        => 'device_type',
        'credType'          => 'cred_type',
        'generateCode'      => 'generate_code',
        'secretId'          => 'secret_id',
        'deviceSn'          => 'device_sn',
        'mac'               => 'mac',
        'bleNme'            => 'ble_nme',
        'keyLess'           => 'key_less',
        'formatType'        => 'format_type',
        'encType'           => 'enc_type',
        'protocolType'      => 'protocol_type',
        'brandId'           => 'brand_id',
        'channel'           => 'channel',
    ];

    public function validate()
    {
        Model::validateRequired('secretId', $this->secretId, true);
        Model::validateRequired('bleNme', $this->bleNme, true);
        Model::validateRequired('brandId', $this->brandId, true);
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
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->credType) {
            $res['cred_type'] = $this->credType;
        }
        if (null !== $this->generateCode) {
            $res['generate_code'] = $this->generateCode;
        }
        if (null !== $this->secretId) {
            $res['secret_id'] = $this->secretId;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->mac) {
            $res['mac'] = $this->mac;
        }
        if (null !== $this->bleNme) {
            $res['ble_nme'] = $this->bleNme;
        }
        if (null !== $this->keyLess) {
            $res['key_less'] = $this->keyLess;
        }
        if (null !== $this->formatType) {
            $res['format_type'] = $this->formatType;
        }
        if (null !== $this->encType) {
            $res['enc_type'] = $this->encType;
        }
        if (null !== $this->protocolType) {
            $res['protocol_type'] = $this->protocolType;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDigitalkeyCredRequest
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
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['cred_type'])) {
            $model->credType = $map['cred_type'];
        }
        if (isset($map['generate_code'])) {
            $model->generateCode = $map['generate_code'];
        }
        if (isset($map['secret_id'])) {
            $model->secretId = $map['secret_id'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['mac'])) {
            $model->mac = $map['mac'];
        }
        if (isset($map['ble_nme'])) {
            $model->bleNme = $map['ble_nme'];
        }
        if (isset($map['key_less'])) {
            $model->keyLess = $map['key_less'];
        }
        if (isset($map['format_type'])) {
            $model->formatType = $map['format_type'];
        }
        if (isset($map['enc_type'])) {
            $model->encType = $map['enc_type'];
        }
        if (isset($map['protocol_type'])) {
            $model->protocolType = $map['protocol_type'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }

        return $model;
    }
}
