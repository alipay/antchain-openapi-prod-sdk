<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetHealthcodeRequest extends Model
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

    // 身份证号，使用蚂蚁侧提供的RSA公钥加密
    /**
     * @var string
     */
    public $certNo;

    // 设备编码
    /**
     * @var string
     */
    public $deviceCode;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 是否需要健康码信息，不传默认不需要
    // 1：需要
    // 0：不需要
    /**
     * @var int
     */
    public $health;

    // 是否需要疫苗信息
    // 1：需要，0：不需要，不传默认不需要
    /**
     * @var int
     */
    public $vaccination;

    // 是否需要核酸信息：
    // 1.需要，0：不需要，不传默认不需要
    /**
     * @var int
     */
    public $nucleicAcid;

    // 是否需要行程码：
    // 1.需要，0：不需要，不传默认不需要
    /**
     * @var int
     */
    public $travel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'deviceCode'        => 'device_code',
        'name'              => 'name',
        'health'            => 'health',
        'vaccination'       => 'vaccination',
        'nucleicAcid'       => 'nucleic_acid',
        'travel'            => 'travel',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('deviceCode', $this->deviceCode, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->deviceCode) {
            $res['device_code'] = $this->deviceCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->health) {
            $res['health'] = $this->health;
        }
        if (null !== $this->vaccination) {
            $res['vaccination'] = $this->vaccination;
        }
        if (null !== $this->nucleicAcid) {
            $res['nucleic_acid'] = $this->nucleicAcid;
        }
        if (null !== $this->travel) {
            $res['travel'] = $this->travel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetHealthcodeRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['device_code'])) {
            $model->deviceCode = $map['device_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['health'])) {
            $model->health = $map['health'];
        }
        if (isset($map['vaccination'])) {
            $model->vaccination = $map['vaccination'];
        }
        if (isset($map['nucleic_acid'])) {
            $model->nucleicAcid = $map['nucleic_acid'];
        }
        if (isset($map['travel'])) {
            $model->travel = $map['travel'];
        }

        return $model;
    }
}
