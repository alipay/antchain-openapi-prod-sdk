<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class VerifyCustomerRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $bizCode;

    // 支付宝uid
    /**
     * @var string
     */
    public $alipayUid;

    // 个人名称
    /**
     * @var string
     */
    public $personName;

    // 个人联系电话
    /**
     * @var string
     */
    public $personPhone;

    // 核验证件号
    /**
     * @var string
     */
    public $personCertNo;

    // 个人身份类型  RESIDENT（身份证）
    /**
     * @var string
     */
    public $personCertType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'alipayUid'         => 'alipay_uid',
        'personName'        => 'person_name',
        'personPhone'       => 'person_phone',
        'personCertNo'      => 'person_cert_no',
        'personCertType'    => 'person_cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUid', $this->alipayUid, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->personName) {
            $res['person_name'] = $this->personName;
        }
        if (null !== $this->personPhone) {
            $res['person_phone'] = $this->personPhone;
        }
        if (null !== $this->personCertNo) {
            $res['person_cert_no'] = $this->personCertNo;
        }
        if (null !== $this->personCertType) {
            $res['person_cert_type'] = $this->personCertType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyCustomerRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['person_name'])) {
            $model->personName = $map['person_name'];
        }
        if (isset($map['person_phone'])) {
            $model->personPhone = $map['person_phone'];
        }
        if (isset($map['person_cert_no'])) {
            $model->personCertNo = $map['person_cert_no'];
        }
        if (isset($map['person_cert_type'])) {
            $model->personCertType = $map['person_cert_type'];
        }

        return $model;
    }
}
