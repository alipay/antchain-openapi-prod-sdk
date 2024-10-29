<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderUserInfo extends Model
{
    // 承租人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 承租人手机号
    /**
     * @example 12345678912
     *
     * @var string
     */
    public $userPhoneNumber;

    // 地址
    /**
     * @example 四川成都
     *
     * @var string
     */
    public $userAddress;

    // 支付宝账号
    /**
     * @example 2088123456789
     *
     * @var string
     */
    public $alipayUid;

    // 租赁类别
    // 1:个人用户
    // 2:企业用户
    /**
     * @example 1
     *
     * @var int
     */
    public $lesseeType;

    // 承租人身份证
    /**
     * @example 6102384935948594
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'userName'        => 'user_name',
        'userPhoneNumber' => 'user_phone_number',
        'userAddress'     => 'user_address',
        'alipayUid'       => 'alipay_uid',
        'lesseeType'      => 'lessee_type',
        'userId'          => 'user_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->lesseeType) {
            $res['lessee_type'] = $this->lesseeType;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['lessee_type'])) {
            $model->lesseeType = $map['lessee_type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
