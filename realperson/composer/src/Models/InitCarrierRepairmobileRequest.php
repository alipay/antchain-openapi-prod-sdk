<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class InitCarrierRepairmobileRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 流程ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，用于流程串联。
    /**
     * @var string
     */
    public $processId;

    // 运营商类型，取值如下：
    // CHINA_TELECOM：中国电信
    // CHINA_MOBILE：中国移动
    // CHINA_UNICOM：中国联通
    /**
     * @var string
     */
    public $carrier;

    // 入参加密模式：
    // "0"（默认值）：不加密；
    // "2"：身份证号、曾用手机号字段都需填写SHA256加密后的字符串。
    // 默认未"0"
    /**
     * @var string
     */
    public $encryptType;

    // 失联修复身份证号，使用入参加密模式加密
    /**
     * @var string
     */
    public $certNo;

    // 曾用手机号码，使用入参加密模式加密
    /**
     * @var string
     */
    public $mobile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'processId'         => 'process_id',
        'carrier'           => 'carrier',
        'encryptType'       => 'encrypt_type',
        'certNo'            => 'cert_no',
        'mobile'            => 'mobile',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('carrier', $this->carrier, true);
        Model::validateRequired('certNo', $this->certNo, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitCarrierRepairmobileRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['carrier'])) {
            $model->carrier = $map['carrier'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
