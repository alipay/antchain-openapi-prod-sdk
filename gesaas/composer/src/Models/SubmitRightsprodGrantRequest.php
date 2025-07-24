<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class SubmitRightsprodGrantRequest extends Model
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

    // 2088xxxx123
    /**
     * @var string
     */
    public $userId;

    // 用户手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 商户编号
    /**
     * @var string
     */
    public $merchantNo;

    // 权益编码
    /**
     * @var string
     */
    public $rightsCode;

    // 发放数量
    /**
     * @var int
     */
    public $grantNum;

    // 面额，动态面额类型必传
    /**
     * @var string
     */
    public $faceValue;

    // 外部发放订单号
    /**
     * @var string
     */
    public $outGrantOrderNo;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;

    // 发放信息,如活动ID等信息
    /**
     * @var string
     */
    public $grantInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'phoneNumber'       => 'phone_number',
        'merchantNo'        => 'merchant_no',
        'rightsCode'        => 'rights_code',
        'grantNum'          => 'grant_num',
        'faceValue'         => 'face_value',
        'outGrantOrderNo'   => 'out_grant_order_no',
        'extInfo'           => 'ext_info',
        'grantInfo'         => 'grant_info',
    ];

    public function validate()
    {
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('grantNum', $this->grantNum, true);
        Model::validateRequired('outGrantOrderNo', $this->outGrantOrderNo, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->grantNum) {
            $res['grant_num'] = $this->grantNum;
        }
        if (null !== $this->faceValue) {
            $res['face_value'] = $this->faceValue;
        }
        if (null !== $this->outGrantOrderNo) {
            $res['out_grant_order_no'] = $this->outGrantOrderNo;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->grantInfo) {
            $res['grant_info'] = $this->grantInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitRightsprodGrantRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['merchant_no'])) {
            $model->merchantNo = $map['merchant_no'];
        }
        if (isset($map['rights_code'])) {
            $model->rightsCode = $map['rights_code'];
        }
        if (isset($map['grant_num'])) {
            $model->grantNum = $map['grant_num'];
        }
        if (isset($map['face_value'])) {
            $model->faceValue = $map['face_value'];
        }
        if (isset($map['out_grant_order_no'])) {
            $model->outGrantOrderNo = $map['out_grant_order_no'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['grant_info'])) {
            $model->grantInfo = $map['grant_info'];
        }

        return $model;
    }
}
