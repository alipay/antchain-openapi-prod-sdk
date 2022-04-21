<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWOE\Models;

use AlibabaCloud\Tea\Model;

class GetTokenRequest extends Model
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

    // 支付宝用户id
    /**
     * @var string
     */
    public $uid;

    // 证件类型。可选，根据是否需要上链公证决定
    /**
     * @var string
     */
    public $certType;

    // 证件姓名。可选，根据是否需要上链公证决定。
    /**
     * @var string
     */
    public $certName;

    // 证件编号。可选，根据是否需要上链公证决定。
    /**
     * @var string
     */
    public $certNo;

    // 手机号。可选，根据是否需要上链公证决定。
    /**
     * @var string
     */
    public $mobileNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uid'               => 'uid',
        'certType'          => 'cert_type',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'mobileNo'          => 'mobile_no',
    ];

    public function validate()
    {
        Model::validateRequired('uid', $this->uid, true);
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
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTokenRequest
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
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }

        return $model;
    }
}
