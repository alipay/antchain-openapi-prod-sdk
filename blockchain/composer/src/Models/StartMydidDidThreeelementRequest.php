<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidDidThreeelementRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 客户自有用户的唯一id
    /**
     * @var string
     */
    public $custumorUid;

    // 实名认证身份证号
    /**
     * @var string
     */
    public $verifyInfoId;

    // 实名认证用户名
    /**
     * @var string
     */
    public $verifyInfoName;

    // 电话号码
    /**
     * @var string
     */
    public $verifyInfoPhone;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'custumorUid'       => 'custumor_uid',
        'verifyInfoId'      => 'verify_info_id',
        'verifyInfoName'    => 'verify_info_name',
        'verifyInfoPhone'   => 'verify_info_phone',
    ];

    public function validate()
    {
        Model::validateRequired('custumorUid', $this->custumorUid, true);
        Model::validateRequired('verifyInfoId', $this->verifyInfoId, true);
        Model::validateRequired('verifyInfoName', $this->verifyInfoName, true);
        Model::validateRequired('verifyInfoPhone', $this->verifyInfoPhone, true);
        Model::validateMaxLength('custumorUid', $this->custumorUid, 64);
        Model::validateMaxLength('verifyInfoId', $this->verifyInfoId, 20);
        Model::validateMaxLength('verifyInfoName', $this->verifyInfoName, 20);
        Model::validateMaxLength('verifyInfoPhone', $this->verifyInfoPhone, 11);
        Model::validateMinLength('custumorUid', $this->custumorUid, 10);
        Model::validateMinLength('verifyInfoId', $this->verifyInfoId, 14);
        Model::validateMinLength('verifyInfoName', $this->verifyInfoName, 4);
        Model::validateMinLength('verifyInfoPhone', $this->verifyInfoPhone, 11);
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
        if (null !== $this->custumorUid) {
            $res['custumor_uid'] = $this->custumorUid;
        }
        if (null !== $this->verifyInfoId) {
            $res['verify_info_id'] = $this->verifyInfoId;
        }
        if (null !== $this->verifyInfoName) {
            $res['verify_info_name'] = $this->verifyInfoName;
        }
        if (null !== $this->verifyInfoPhone) {
            $res['verify_info_phone'] = $this->verifyInfoPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidDidThreeelementRequest
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
        if (isset($map['custumor_uid'])) {
            $model->custumorUid = $map['custumor_uid'];
        }
        if (isset($map['verify_info_id'])) {
            $model->verifyInfoId = $map['verify_info_id'];
        }
        if (isset($map['verify_info_name'])) {
            $model->verifyInfoName = $map['verify_info_name'];
        }
        if (isset($map['verify_info_phone'])) {
            $model->verifyInfoPhone = $map['verify_info_phone'];
        }

        return $model;
    }
}
