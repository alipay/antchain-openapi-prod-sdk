<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CheckRouteTwometaRequest extends Model
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

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outerOrderNo;

    // 姓名
    /**
     * @var string
     */
    public $certName;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 使用场景（不再使用）
    /**
     * @var string
     */
    public $scene;

    // map结果的json数据格式，预留字段
    //
    /**
     * @var string
     */
    public $externParam;

    // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
    /**
     * @var string
     */
    public $reqEncType;

    // 用于入参加密的AES密钥
    /**
     * @var string
     */
    public $encToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'scene'             => 'scene',
        'externParam'       => 'extern_param',
        'reqEncType'        => 'req_enc_type',
        'encToken'          => 'enc_token',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('certName', $this->certName, true);
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
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->reqEncType) {
            $res['req_enc_type'] = $this->reqEncType;
        }
        if (null !== $this->encToken) {
            $res['enc_token'] = $this->encToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckRouteTwometaRequest
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
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['req_enc_type'])) {
            $model->reqEncType = $map['req_enc_type'];
        }
        if (isset($map['enc_token'])) {
            $model->encToken = $map['enc_token'];
        }

        return $model;
    }
}
