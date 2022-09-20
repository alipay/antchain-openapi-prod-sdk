<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class UpdateOrgRequest extends Model
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

    // 50字符，单平台幂等
    /**
     * @var string
     */
    public $id;

    // 500字符 机构简介
    /**
     * @var string
     */
    public $introduction;

    // 社会统一信用代码固定18位
    /**
     * @var string
     */
    public $unifiedSocialCreditCode;

    // 13位时间戳 签约时间
    /**
     * @var int
     */
    public $signTime;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'id'                      => 'id',
        'introduction'            => 'introduction',
        'unifiedSocialCreditCode' => 'unified_social_credit_code',
        'signTime'                => 'sign_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('introduction', $this->introduction, 500);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->unifiedSocialCreditCode) {
            $res['unified_social_credit_code'] = $this->unifiedSocialCreditCode;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateOrgRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['unified_social_credit_code'])) {
            $model->unifiedSocialCreditCode = $map['unified_social_credit_code'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }

        return $model;
    }
}
