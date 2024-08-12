<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryZolozmetaThreemetamobilereuseRequest extends Model
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

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 日期
    /**
     * @var string
     */
    public $date;

    // 运营商类型
    /**
     * @var string
     */
    public $carrier;

    // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式 0：明文 1：MD5
    /**
     * @var string
     */
    public $encryptType;

    // 扩展参数
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'mobile'            => 'mobile',
        'date'              => 'date',
        'carrier'           => 'carrier',
        'encryptType'       => 'encrypt_type',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('carrier', $this->carrier, true);
        Model::validateRequired('externParam', $this->externParam, true);
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
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryZolozmetaThreemetamobilereuseRequest
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
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['carrier'])) {
            $model->carrier = $map['carrier'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
